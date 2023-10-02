package com.myntra.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.myntra.ActionDriver.*;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HomePage extends Action {
	AndroidDriver driver;
	private final By wishlist = AppiumBy.accessibilityId("wishlist");
	private final By notification = AppiumBy.accessibilityId("notification");
	private final By search = AppiumBy.accessibilityId("search");
	private final By searchText = AppiumBy.accessibilityId("search_default_search_text_input");

	public HomePage(AndroidDriver driver) {
		this.driver = driver;

	}

	public void CartButton() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Cart = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"bag\"]/android.view.ViewGroup"));
		Action.click(driver, Cart);
		Thread.sleep(5000);
		driver.navigate().back();

	}

	public void Favorites() throws InterruptedException {
		Thread.sleep(5000);
		WebElement WishList = driver.findElement(wishlist);
		Action.click(driver, WishList);
		Thread.sleep(5000);
		driver.navigate().back();

	}

	public void skip() throws InterruptedException {
		Thread.sleep(3000);
		WebElement close = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup"));
		Action.click(driver, close);

	}

	public void Notifications() throws InterruptedException {
		Thread.sleep(5000);
		WebElement noti = driver.findElement(notification);
		Action.click(driver, noti);
		Thread.sleep(5000);
		driver.navigate().back();

	}

	public void Search() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Search = driver.findElement(search);
		Action.click(driver, Search);
		Action.SetValue(Search, "Kurta");
		driver.navigate().back();

	}

	public void SearchText() throws InterruptedException {
		Thread.sleep(5000);
		WebElement search_txt = driver.findElement(searchText);
		
	}

}
