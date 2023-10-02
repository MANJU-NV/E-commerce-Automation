package com.myntra.testcases;

import org.testng.annotations.Test;
import com.myntra.PageObjects.*;
import com.myntra.BaseClass.*;

public class HomePageTest extends BaseClass {

	@Test
	public void HomeTest() throws InterruptedException {
		HomePage h = new HomePage(driver);
//		h.CartButton();
//		h.Favorites();
//		h.Notifications();
		h.Search();
//		h.SearchText();

	}
}
