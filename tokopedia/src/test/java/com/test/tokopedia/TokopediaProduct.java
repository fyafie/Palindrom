package com.test.tokopedia;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TokopediaProduct {
  @Test
  public void tokopediaProductTest() {
	  
	  System.setProperty("webdriver.chrome.driver", 
				"C:\\webdrivers\\chromedriver.exe");
	  String baseURL = "https://www.tokopedia.com/search?st=product&q=laptop&srp_component_id=02.01.00.00&srp_page_id=&srp_page_title=&navsource="; 
	  WebDriver driver = new ChromeDriver();
	  driver.get(baseURL);
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  int limit = 50;
	  int page = 0;
	  while (page <= limit) {
		js.executeScript("window.scrollBy(0,200)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		page ++;
	}
	  
	  
	  List<WebElement> elements = driver.findElements(By.cssSelector("div[data-testid=\"spnSRPProdPrice\"]"));
	  System.out.println("jumlah barang = "+elements.size());
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.quit();
  }
}
