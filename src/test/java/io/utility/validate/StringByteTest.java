package io.utility.validate;

import java.nio.charset.Charset;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringByteTest {

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
			
//			String test = Charset.forName("UTF-8");
//			test.getBytes("UTF-8").length;
//			
			String strTest = "Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivated architect/engineer with extensive experience in Java/J2EE/XML and web/Ajax/Json development. Self-starter with excellent analytical, problem-solving, and communication skills.\n" + 
					"\n" + 
					"A career which can sharpen my current skills & knowledge and I can have good scope for learning and implementing new technologies. Looking for a challenging opportunity to pursue and excel in the area of, application(system) architect.\n" + 
					"Accomplished over 18+ years of experience in software design and development, presently working as application architect engineer, highly motivate";
			
			byte[] ptext1 = strTest.getBytes(Charset.forName("UTF-8"));
			
			System.out.println("ptext1 size => " + ptext1.length);

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
