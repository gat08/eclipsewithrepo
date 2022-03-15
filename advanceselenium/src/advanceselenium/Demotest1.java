package advanceselenium;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerExample.class) //instead of it we writing in a testng.xml file/from suit
public class Demotest1 {
	@Test
	public void m1() {
		System.out.println("testcase 1");
		Assert.assertEquals(1, 1);
	}

	@Test
	public void m2() {
		System.out.println("testcase 2");
		Assert.assertEquals(1, 1);
	}

	@Test
	public void m3() {
		System.out.println("testcase 3");
		throw new SkipException("Skipping a testcase 3s");
	}
}
