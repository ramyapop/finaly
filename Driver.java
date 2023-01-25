package com.cognizant;///////programetic

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static void main(String[] args) throws IOException  {

		WebDriver sun = new ChromeDriver();
		
		sun.get("https://www.makemytrip.com/");
		
		/*sun.get("https://www.amazon.in/");
		
     
		String title = sun.getTitle();	

        System.out.println(title);

        String currentUrl = sun.getCurrentUrl();
        System.out.println(currentUrl);

  
  sun.navigate().to("https://www.flipkart.com/");
  sun.navigate().back();
  sun.navigate().forward();
  sun.manage().window().fullscreen();
  
		
	}

} */
		
//syntax
		
	TakesScreenshot q = (TakesScreenshot) sun;
	
	File w = q.getScreenshotAs(OutputType.FILE); // src file
	
	File e = new File("C:\\Users\\ramya\\eclipse-workspace\\Lab\\screenshot\\make.png");
	
	FileUtils.copyFile(w, e);
	
		
	}}	
		
