package com.myntra.testcases;

import org.testng.annotations.Test;

import com.myntra.BaseClass.*;
import com.myntra.PageObjects.Gadgets;

public class GadgetsTest extends BaseClass {

	@Test
	public void GadgetTest() throws InterruptedException {
		Gadgets gadget = new Gadgets(driver);

		gadget.moveToEveryday();
		gadget.ClickGadgets();
		gadget.ClickPortronics();
	}

}
