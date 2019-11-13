package io.utility.validate.annotation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BitAllowStringValidator implements ConstraintValidator<BitAllowString, String>{

	private String[] allowBitArray = {"true", "false"};

	@Override
	public void initialize(BitAllowString constraintAnnotation) {
		this.allowBitArray = constraintAnnotation.allowBitArray();
	}

	@Override
	public boolean isValid(String inputData, ConstraintValidatorContext ctx) {

        if(inputData == null){
        	inputData = "false";
        	return true;
        }

        List<String> bitArray = Arrays.asList(allowBitArray);
        if(!bitArray.contains(inputData.toLowerCase())) {
        	return false;
        }

        return true;
	}

}