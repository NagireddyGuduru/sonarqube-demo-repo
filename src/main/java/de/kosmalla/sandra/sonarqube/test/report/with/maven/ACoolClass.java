package de.kosmalla.sandra.sonarqube.test.report.with.maven;


/**
 * A cool class
 *
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Timer;
//import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//import app.LoginCheck.RemindTask;

public class ACoolClass {

public String show() {
		// Create a new instance of the Firefox driver
				WebDriver driver = new FirefoxDriver();
				String status;
                                String submitBtn = "signup";

		        //Launch the Online Store Website
				driver.get("http://172.16.151.119:80/Devopsdemo/index.jsp");
                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				String pageTitle = driver.getTitle();
		        String actTitle = "demo page";
		        
		        if (pageTitle.equalsIgnoreCase(actTitle)){
                                System.out.println("Application is up and running");
                                driver.findElement(By.className(submitBtn)).click();
                                driver.findElement(By.id("email")).sendKeys("raj@yahoo.co.in");
	    	                driver.findElement(By.id("password")).sendKeys("rrr");
	    	                driver.findElement(By.id("rpassword")).sendKeys("rrr");
                                driver.findElement(By.className("signupbtn")).click(); 
		        	status = "success";
		        }else {
		        	status = "fail";
		        }
		        // Print a Log In message to the screen
		        //System.out.println("Google is up and running");
		 
				//Wait for 5 Sec
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		        // Close the driver
		        driver.quit();
		        
		        return status;
	}    



public String show1() {
		// Create a new instance of the Firefox driver
				WebDriver driver = new FirefoxDriver();
				String status;
                                String submitBtn = "signup";

		        //Launch the Online Store Website
				driver.get("http://172.16.151.119:80/Devopsdemo/index.jsp");
                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				String pageTitle = driver.getTitle();
		        String actTitle = "demo page";
		        
		        if (pageTitle.equalsIgnoreCase(actTitle)){
                                System.out.println("Application is up and running");
                                driver.findElement(By.className(submitBtn)).click();
                                driver.findElement(By.id("email")).sendKeys("manju@yahoo.co.in");
	    	                driver.findElement(By.id("password")).sendKeys("rrr");
	    	                driver.findElement(By.id("rpassword")).sendKeys("rrr");
                                driver.findElement(By.className("signupbtn")).click(); 
		        	status = "success";
		        }else {
		        	status = "fail";
		        }
		        // Print a Log In message to the screen
		        //System.out.println("Google is up and running");
		 
				//Wait for 5 Sec
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		        // Close the driver
		        driver.quit();
		        
		        return status;
	}    






public String display() {
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		String status = null;
        //Launch the Online Store Website
		driver.get("http://172.16.151.119:80/Devopsdemo/index.jsp");
		String title = driver.getTitle();
		
		if (title.equalsIgnoreCase("demo page")){
			status = "success";
		}else{
			status = "failure";
		}
 
		//Wait for 5 Sec
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // Close the driver
        driver.quit();
        
        return status;
		
		
		
	}




}
