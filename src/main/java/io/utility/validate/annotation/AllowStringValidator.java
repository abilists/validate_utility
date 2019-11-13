package io.utility.validate.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import io.utility.validate.ValidateUtility;

public class AllowStringValidator implements ConstraintValidator<AllowString, String>{

	private char[] allowCharArray = {'0', '1'};

	@Override
	public void initialize(AllowString constraintAnnotation) {
		this.allowCharArray = constraintAnnotation.allowCharArray();
	}

	@Override
	public boolean isValid(String inputData, ConstraintValidatorContext ctx) {

        if(inputData == null || inputData.length() < 1){
            return false;
        }

        if(!ValidateUtility.validateCharacters(inputData, this.allowCharArray)) {
        	return false;
        }

        return true;
	}

}