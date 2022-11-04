package Org.testing.Testcases;

import java.io.IOException;
import java.util.Properties;

import Org.testing.testSteps.HTTPsMethods;
import Org.testing.utilities.JsonParsingUsingOrgJson;
import Org.testing.utilities.Propertieshandle;
import io.restassured.response.Response;

public class TC3_GetOrgParsing 
{
	public void testcase3() throws IOException
	{
		Properties pr=Propertieshandle.ReadProperties("../API_FrameWork/URI.properties");
		HTTPsMethods http= new HTTPsMethods(pr);
		Response res=http.Getparse("QA_URI_Selenium");
		String obj=JsonParsingUsingOrgJson.responseParse(res.toString(),"id");
		System.out.println((int)obj.trim().charAt(0));
	}
}
