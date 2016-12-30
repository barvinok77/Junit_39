package core;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AppTest {
	
	@Test
	public void test01_assertEqualsPositive() {
		assertEquals("Strings are equal.","JUnit 4.12", App.s);
	}
	
	@Test
	public void test02_assertEqualsNegative() {
		assertEquals("Strings are not equal.","JUnit 3", App.s);
	}
	
	@Test @Ignore 
	public void test03_assertEqualsIgnored() {
		assertEquals("Strings are equal.","JUnit 4.12", App.s);
	}
	
	@Test
	public void test04_assertSamePositive() {
		assertSame("Integers are the same.",39, App.i);
	}
	
	@Test
	public void test05_assertSameNegative() {
		assertSame("Integers are not the same.",40, App.i);
	}
	
	@Test @Ignore
	public void test06_assertSameIgnored() {
		assertSame("Integers are the same.",39, App.i);
	}
	
	@Test
	public void test07_assertFalsePositive() {
		assertFalse("Must be false.", App.f);
	}
	
	@Test
	public void test08_assertFalseNegative() {
		assertFalse("Must be false.", App.t);
	}
	
	@Test
	public void test09_assertTruePositive() {
		assertTrue("Must be true.", App.t);
	}
	
	@Test
	public void test10_assertTrueNegative() {
		assertTrue("Must be true.", App.f);
	}
}
