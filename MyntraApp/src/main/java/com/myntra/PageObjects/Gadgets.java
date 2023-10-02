package com.myntra.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.myntra.ActionDriver.*;

import io.appium.java_client.android.AndroidDriver;

public class Gadgets extends Action {
	AndroidDriver driver;

	public Gadgets(AndroidDriver driver) {
		this.driver = driver;
	}
	
	public void moveToEveryday() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Everyday_icon=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"tabButton_everydaymen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
	    Action.click(driver, Everyday_icon);
	}
	
	public void ClickGadgets() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Gadgets=driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"19:fe5f0094-de66-4d65-90de-43fcedaf48e8&644d08e696aff6dc95a8b812\"]/android.view.ViewGroup/android.widget.ImageView"));
        Action.click(driver, Gadgets);
	}
	
	public void ClickPortronics() throws InterruptedException {
		
		WebElement Portronics=driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[1]/android.view.ViewGroup/android.widget.ImageView"));
		Action.scrollByVisibilityOfElement(driver,Portronics);
		Thread.sleep(5000);
	    Action.click(driver, Portronics);
	    
	}

}
 