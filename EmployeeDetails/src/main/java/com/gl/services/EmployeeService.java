package com.gl.services;


import com.gl.edfstubs.EmployeeDetailsGrpc.EmployeeDetailsImplBase;
import com.gl.edfstubs.EmployeeOuterClass.Employee;
import com.gl.edfstubs.EmployeeOuterClass.Employees;

import com.gl.edfstubs.ResponseOuterClass.Response;
import com.gl.edfstubs.ResponseOuterClass.Empty;
import com.gl.spanner.DBConnection;
import com.google.cloud.spanner.DatabaseClient;

import io.grpc.stub.StreamObserver;

public class EmployeeService extends EmployeeDetailsImplBase  {

	@Override
	public void allemployees(Empty request, StreamObserver<Employees> responseObserver) {
		// TODO Auto-generated method stub
		DBConnection db=new DBConnection();
		DatabaseClient dbclient=db.startConnection();
		responseObserver.onNext(db.getAllEmploees(dbclient));
		db.closeConnection();
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
		// TODO Auto-generated method stub
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
