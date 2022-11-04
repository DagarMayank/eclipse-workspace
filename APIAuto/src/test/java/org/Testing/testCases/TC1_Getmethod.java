package org.Testing.testCases;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC1_Getmethod  
{
	@Test
	public void testcase() 
	{ 	
		
			Response res=
					given()
					.contentType(ContentType.JSON)
					.when()
					.get("http://localhost:3000/ApiStudent");
			
			System.out.println("Status code is "+res.statusCode());
			System.out.println("Response data is "+res.asString()); //AsString is used to change the json format into String 
	}
	
} 