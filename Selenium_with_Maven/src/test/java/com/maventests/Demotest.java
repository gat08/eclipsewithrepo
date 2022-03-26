package com.maventests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demotest {
	@Test
	public void test() {
		System.out.println("Im in test case");
	}
	@Test
	public void test2() {
		Assert.assertEquals(true, true);
	}
}
