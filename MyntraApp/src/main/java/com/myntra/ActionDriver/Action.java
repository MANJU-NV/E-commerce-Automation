package com.myntra.ActionDriver;

import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.appium.java_client.android.AndroidDriver;

public class Action {

	public static void scrollByVisibilityOfElement(AndroidDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

	}

	public static void scroll(String input, AndroidDriver driver) {
		
		
		//driver.findElement(new AppiumBy.ByAndroidUIAutomator(
			//	"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Puma\"));"));


		
		String scroll="new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(%s));";
		String formatted=String.format(scroll, input);
		driver.findElement(new AppiumBy.ByAndroidUIAutomator(formatted));
	}

	public static void click(WebDriver driver, WebElement ele) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();

	}

	public static boolean CheckElement(AndroidDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			flag = true;
		} catch (Exception e) {

		}

		return flag;
	}

	public static boolean isDisplayed(AndroidDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			ele.isDisplayed();
			flag = true;
		} catch (Exception e) {

		}
		return flag;
	}

	public static boolean SetValue(WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		}
		return flag;

	}

	public static void implicitWait(AndroidDriver driver, int timeOut) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
	}

}
