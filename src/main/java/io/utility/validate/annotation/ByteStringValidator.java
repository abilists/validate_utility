package io.utility.validate.annotation;

import java.nio.charset.Charset;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ByteStringValidator implements ConstraintValidator<ByteString, String>{
	final Logger logger = LoggerFactory.getLogger(ByteStringValidator.class);

    private int min;
    private int max;
    private String charset;

	@Override
	public void initialize(ByteString constraintAnnotation) {
	       this.min = constraintAnnotation.min();
	       this.max = constraintAnnotation.max();
	       this.charset = constraintAnnotation.charset();
	}

	@Override
	public boolean isValid(String inputData, ConstraintValidatorContext ctx) {

        if(inputData == null || inputData.length() < 1){
            return true;
        }
        // Remove new line special character so that the character doesn't be counted in the counting size. 
        byte[] bt = inputData.replaceAll("\\n", "").getBytes(Charset.forName(charset));

        if(min > bt.length || bt.length >= max) {
        	logger.warn("string size = " + bt.length);
        	return false;
        }

        return true;
	}

}