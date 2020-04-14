package com.gl.server;

import java.io.IOException;

import com.gl.services.EmployeeService;


import io.grpc.Server;
import io.grpc.ServerBuilder;

public class AppServer {
	public static void main(String args[]) throws IOException, InterruptedException
	{
		Server server=ServerBuilder.forPort(8889).addService(new EmployeeService()).build();
		server.start();
		System.out.println("started");
		server.awaitTermination();
	}
}
