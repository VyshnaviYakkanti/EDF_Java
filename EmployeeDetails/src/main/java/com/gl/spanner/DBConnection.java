package com.gl.spanner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.gl.edfstubs.EmployeeOuterClass.Employee;
import com.gl.edfstubs.EmployeeOuterClass.Employees;
import com.gl.edfstubs.EmployeeOuterClass.Response;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.spanner.*;

public class DBConnection {
	Spanner spanner;
	public DatabaseClient startConnection()
	{
	
   	 GoogleCredentials credentials;
   	 
     try {
     	credentials	=  GoogleCredentials.fromStream(new FileInputStream("src//main//java//com//gl//spanner//config.json"));
         //getApplicationDefault(new FileInputStream(jsonPath));
     } catch (IOException e) {
         // Panic and leave ;)
         e.printStackTrace();
         return null;
     }
     SpannerOptions options = SpannerOptions.newBuilder().setCredentials(credentials).build();
     spanner = options.getService();
     
     String instanceId = "edfinstance";
     String databaseId = "edf_prod";
    return spanner.getDatabaseClient(DatabaseId.of(options.getProjectId(), instanceId, databaseId));
    
	}
	
	 public Employees getAllEmploees(DatabaseClient dbclient)
	{
		
		 ResultSet resultSet = dbclient.singleUse().executeQuery(Statement.of("SELECT * From EmployeeInfo"));

         System.out.println("\n\nResults:");
         Employees.Builder allemp=Employees.newBuilder();
         // Prints the results
         int i=0;
         while (resultSet.next()) {
        	
          Employee.Builder emp=Employee.newBuilder();        
          emp.setEmployeeid(resultSet.getLong(0))
          .setName(resultSet.getString(1))
          .setProject(resultSet.getString(2))
          .setPhonenumber(resultSet.getLong(4)).        
          
        	 addAllSkills(resultSet.getStringList(3));
       
        allemp.addEmployee(i++,emp.build());
    }
	
		return allemp.build();
				}
	 public  void closeConnection()
	 {
		spanner.close(); 
	 }
	public Response insertEmployee(Employee request, DatabaseClient dbclient) {
		 Response.Builder response=Response.newBuilder();
		try {
		
		List<Mutation> mutations = new ArrayList<>();
		Mutation mutation=Mutation.newInsertBuilder("EmployeeInfo").
		set("EmployeeId").to(request.getEmployeeid()).
		set("Project").to(request.getProject()).
		set("Name").to(request.getName()).
		set("PhoneNumber").to(request.getPhonenumber()).		
		build();
		;
		mutations.add(mutation);
		dbclient.writeAtLeastOnce(mutations);
		response.setResponsemessage("Inserted");
		}
		catch(Exception e)
		{
			response.setResponsemessage("Fail to insert");	
			e.printStackTrace();
		}
		
		
	
		return response.build();
	}
}
