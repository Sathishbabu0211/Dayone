package org.junit;

import java.util.Date;

public class Sample {
	@org.junit.BeforeClass
	public static void BeforeClass() {
		System.out.println("Browser Configuration and Launch");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("close broswer");
	}
	@Before
	public void beforeEachMethod() {
		Date d = new Date();
		System.out.println("Start time" + d);
	}
	@After
	public void afterEachMethod() {
		Date d = new Date();
		System.out.println("End time" + d);
	}
	@Ignore
	@Test
	public void tc1() {
		System.out.println("TC1...");
	}
	@Test
	public void tc2() {
		System.out.println("TC2...");
	}
	@Test
	public void tc3() {
		System.out.println("TC3...");	
	}

	}


