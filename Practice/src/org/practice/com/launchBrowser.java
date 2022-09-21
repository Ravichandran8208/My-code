package org.practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\for Selenium\\Chrome Webdrive.chromedriver_win32");
		WebDriver driver= new ChromeDriver();
	    driver.get("http://192.168.2.40:7001/EximBillWeb/");
	    
	
		
	
		
	
	

	}

}
