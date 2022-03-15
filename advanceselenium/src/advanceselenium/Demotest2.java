package advanceselenium;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

//@Listeners(ListnerExample.class)

public class Demotest2 {
	@Test
	public void m1() {
		System.out.println("testcase 4");
		Assert.assertEquals(1, 1);
	}

	@Test
	public void m2() {
		System.out.println("testcase 5");
		Assert.assertEquals(1, 1);
	}

	@Test
	public void m3() {
		System.out.println("testcase 6");
		throw new SkipException("Skipping a testcse");
	}
}
