package org.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Runner {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(Test1.class,Test2.class);
		int runCount = r.getRunCount();
		System.out.println(runCount);
		
		int failureCount = r.getFailureCount();
		System.out.println(failureCount);
		
		int ignoreCount = r.getIgnoreCount();
		System.out.println(ignoreCount);
		
		long runTime = r.getRunTime();
		System.out.println(runTime);
		
	}
}
