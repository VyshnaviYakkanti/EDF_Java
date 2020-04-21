package com.gl.services;


import com.gl.edfstubs.EmployeeDetailsGrpc.EmployeeDetailsImplBase;
import com.gl.edfstubs.EmployeeOuterClass.Employee;
import com.gl.edfstubs.EmployeeOuterClass.Employees;

import com.gl.edfstubs.ResponseOuterClass.Response;
import com.gl.edfstubs.ResponseOuterClass.Empty;
import com.gl.spanner.DBConnection;
import com.google.cloud.spanner.DatabaseClient;

import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;

public class EmployeeService extends EmployeeDetailsImplBase  {


	public void allemployees(com.google.protobuf.Empty request, StreamObserver<Employees> responseObserver) {
		System.out.println("AllEmployee");
		DBConnection db=new DBConnection();
		DatabaseClient dbclient=db.startConnection();
		responseObserver.onNext(db.getAllEmploees(dbclient));
		db.closeConnection();
		responseObserver.onCompleted();
	}
	
	
	@Override
	public void test(com.google.protobuf.Empty request, StreamObserver<Response> responseObserver) {
		// TODO Auto-generated method stub
	System.out.println("Test");
Response r = Response.newBuilder().setResponsemessage("suceesss").build();
responseObserver.onNext(r);
responseObserver.onCompleted();
	
	}









	public void addemployee(Employee request, StreamObserver<Response> responseObserver) {
		DBConnection db=new DBConnection();
		DatabaseClient dbclient=db.startConnection();
		responseObserver.onNext(db.insertEmployee(request,dbclient));
		db.closeConnection();
		responseObserver.onCompleted();		
	
	}

	@Override
	public void editemployee(Employee request,
			StreamObserver<com.gl.edfstubs.ResponseOuterClass.Response> responseObserver) {
		
		super.editemployee(request, responseObserver);
	}



	@Override
	public void deleteemployee(Employee request, StreamObserver<Response> responseObserver) {
		DBConnection db=new DBConnection();
		DatabaseClient dbclient=db.startConnection();
		responseObserver.onNext(db.deleteEmployee(request,dbclient));
		db.closeConnection();
		responseObserver.onCompleted();	
	}
	
	
	

	
	
}
