package io.utility.validate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ValidateTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is the first excuted");
	}

	@Before
	public void before() {
		System.out.println("Before");
	}

	@Test
	public void testOne() throws Exception {

		try {
			assertTrue(ValidateUtility.validatePassword("123Ead435"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testValidateSpecialCharacter() throws Exception {

		try {
			assertFalse(ValidateUtility.validateSpecialCharacter("12Eadafe<>5"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testValidateSpecialCharacter2() throws Exception {

		char[] charArray = {'\'', '"', '^'};

		try {
			assertFalse(ValidateUtility.validateSpecialCharacter("12Eadafe<>5", charArray));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testValidateByte() throws Exception {

		try {

			if(ValidateUtility.validateCharacters("license01")) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@After
	public void after() {
		System.out.println("Before");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("This is the end excuted");
	}
}
