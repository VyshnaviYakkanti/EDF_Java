package com.gl.services;


import com.gl.edfstubs.EmployeeDetailsGrpc.EmployeeDetailsImplBase;
import com.gl.edfstubs.EmployeeOuterClass.Employee;
import com.gl.edfstubs.EmployeeOuterClass.Employees;
import com.gl.edfstubs.EmployeeOuterClass.Empty;
import com.gl.edfstubs.EmployeeOuterClass.Response;
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
	

	
	
}
