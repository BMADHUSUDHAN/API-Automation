package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;


public class Utils {

	RequestSpecification req;
	public RequestSpecification requestSpecification() throws IOException
	
{

		PrintStream log = new PrintStream(new FileOutputStream("executionlog.txt"));
	
	    
	    req =  new RequestSpecBuilder().setBaseUri(getGlobalValue("baseurl"))
	    		.addFilter(RequestLoggingFilter.logRequestTo(log))
	    .addFilter(ResponseLoggingFilter.logResponseTo(log)).setContentType(ContentType.JSON).build();
	    return req;
		
	}
public static String getGlobalValue(String key) throws IOException
{
	
	FileInputStream fis = new FileInputStream("D:\\Madhu_PC\\Madhu_PC\\Softwares\\eclipse\\SampleAPIAutomation\\src\\test\\java\\resources\\global.properties");
	Properties properties = new Properties();
	properties.load(fis);
	return properties.getProperty(key);
	
	

	
}

}
