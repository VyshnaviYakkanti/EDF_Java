package com.gl.server;

import java.io.File;
import java.io.IOException;

import javax.security.auth.login.AppConfigurationEntry;

import com.gl.services.EmployeeService;
import com.gl.spanner.SpannerConstants;
import io.grpc.Server;
import io.grpc.ServerBuilder;




public class AppServer {
	public static void main(String args[]) throws IOException, InterruptedException
	{
		
		Server server=
				ServerBuilder.forPort(SpannerConstants.SERVER_PORT).							
				addService(new EmployeeService()).build();
				server.start();
		System.out.println("Server Running at"+SpannerConstants.SERVER_PORT);
		server.awaitTermination();
	}
}

