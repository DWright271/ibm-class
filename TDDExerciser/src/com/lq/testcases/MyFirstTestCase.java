/**
 * 
 */
package com.lq.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Student
 *
 */
public class MyFirstTestCase {

	@Test
	public void test() {
		System.out.println("test");
		ClassToTest ctt = new ClassToTest();
		assertEquals(false, ctt.methodToTest());
	}

}
