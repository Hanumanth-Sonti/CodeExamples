package com.AutoIT.solutions;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sonti.hanumanth\\Downloads\\Selenium Files\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("file:///C:/fileUpload.html");
	  driver.findElement(By.xpath(".//*[@id='1']")).click();
	  Thread.sleep(1000);
	  Runtime.getRuntime().exec("C:\\Users\\sonti.hanumanth\\Desktop\\Auto IT Selenium Examples\\FileUpload_Chrome.exe");
	  Thread.sleep(2000);
      driver.quit();
	}
}
