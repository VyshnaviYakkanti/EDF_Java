package com.gl.spanner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.gl.edfstubs.EmployeeOuterClass.Employee;
import com.gl.edfstubs.EmployeeOuterClass.Address;
import com.gl.edfstubs.EmployeeOuterClass.Asset;
import com.gl.edfstubs.EmployeeOuterClass.Employees;
import com.gl.edfstubs.ResponseOuterClass.Response;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.spanner.*;
import com.google.cloud.spanner.Mutation.WriteBuilder;


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
    return spanner.getDatabaseClient(DatabaseId.of(options.getProjectId(), SpannerConstants.SPANNER_INSTANCE_ID, SpannerConstants.SPANNER_DATABASE_ID));
    
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
          emp.setEmployeeid(resultSet.getLong("EmployeeId"))
          .setName(resultSet.getString(1))
          .addAllProjects(resultSet.getStringList("Projects"))
          .setPhonenumber(resultSet.getLong("PhoneNumber")).        
          
        	 addAllSkills(resultSet.getStringList("Skills"));
       
        allemp.addEmp(i++,emp.build());
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
		Mutation emp_mutation=Mutation.newInsertBuilder("EmployeeInfo").
		set("EmployeeId").to(request.getEmployeeid()).
		set("Projects").toStringArray((List<String>)request.getProjectsList()).
		set("Name").to(request.getName()).
		set("PhoneNumber").to(request.getPhonenumber()).
		set("Skills").toStringArray((List<String>)request.getSkillsList()).
		set("BloodGroup").to(request.getBloodgroup()).
		set("ClientMail").to(request.getClientmail()).
		set("EmergencyContact").to(request.getEmergencyphonenumber()).
		set("GlMail").to(request.getGlmail()).
		set("Ldap").to(request.getLdap()).
		set("Manager").to(request.getManger()).
		set("SeatNo").to(request.getSeatno()).
		set("VendiCard").to(request.getVendicard()).	
		build();		
		mutations.add(emp_mutation);					
			
		for(Asset asset: request.getAssetList())
			mutations.add(Mutation.newInsertBuilder("AssetInfo").
					set("AssetId").to(asset.getAssetnumber()).
					set("AssetType").to(asset.getAssettye()).
					set("EmployeeId").to(request.getEmployeeid()).build());
		int peraddkey=this.generateID();
		mutations.add(insertAddress(request.getPermanentaddress(),peraddkey));
		mutations.add(Mutation.newInsertOrUpdateBuilder("Address_Empoyee_Map").
				set("AddressId").to(peraddkey).
				set("AddressType").to("Permanent").
				set("EmployeeId").to(request.getEmployeeid()).build());
				
		WriteBuilder temp_add_mutation=Mutation.newInsertBuilder("Address_Empoyee_Map").
				set("AddressType").to("Temporary").
				set("EmployeeId").to(request.getEmployeeid());
			if(!request.getPermanentaddress().equals(request.getTempaddress()))
			{ int tempaddkey = this.generateID();
				mutations.add(insertAddress(request.getTempaddress(),tempaddkey));
				mutations.add(temp_add_mutation.set("AddressId").to(tempaddkey).build());
				
			}
			mutations.add(temp_add_mutation.set("AddressId").to(peraddkey).build());
		
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
	private Mutation insertAddress(Address address , int addressid)
	{
		Mutation mutation=Mutation.newInsertBuilder("AddressInfo").
				set("AddressId").to(addressid).
				set("AddressLine1").to(address.getAddressline1()).
				set("AddressLine2").to(address.getAddressline2()).
				set("County").to(address.getCountry()).
				set("District").to(address.getDistrict()).
				set("State").to(address.getState()).
				set("ZipCode").to(address.getZipcode()).
				build();
		return mutation;
	}
	private int generateID()
	{
		UUID random = UUID.randomUUID();
		return random.hashCode();
	}
	
	public Response deleteEmployee(Employee request,DatabaseClient dbClient) {
		 Response.Builder response=Response.newBuilder();
		List<Mutation> mutations = new ArrayList<>();
	

		  // KeySet.singleKey() can be used to delete one row at a time.
		 try {
		    mutations.add(
		        Mutation.delete(
		            "EmployeeInfo", KeySet.singleKey(Key.newBuilder().append(request.getEmployeeid()).build())));
		

		  dbClient.write(mutations);
		  System.out.printf("Records deleted.\n");
		  response.setResponsemessage("Deleted");
		 }
		 catch(Exception e)
		 {
			 response.setResponsemessage("Fail to delete"); 
		 }
		  return response.build();
		}
}
