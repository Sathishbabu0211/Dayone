package org.junit;

public class Test1 {
	@Test
	public void tc1() {
		System.out.println("TC1...");

	}

	@Test
	public void tc2() {
		Assert.assertTrue(false);
		System.out.println("TC2...");
		
	}

	@Test
	public void tc3() {
		Assert.assertEquals("TestCase", "TC2");
		System.out.println("TC3...");

	}

}
