package io.utility.validate.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import io.utility.validate.ValidateUtility;

public class IsLongValidator implements ConstraintValidator<IsInteger, String>{

	@Override
	public void initialize(IsInteger constraintAnnotation) {
	}

	@Override
	public boolean isValid(String inputData, ConstraintValidatorContext ctx) {

        if(inputData == null || inputData.length() < 1){
            return false;
        }

        if(ValidateUtility.isNumber(inputData) || inputData.equals(".")) {
        	return true;
        }

        return false;
	}

}