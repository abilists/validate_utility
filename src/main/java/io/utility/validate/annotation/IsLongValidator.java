package io.utility.validate.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import io.utility.validate.ValidateUtility;

public class IsLongValidator implements ConstraintValidator<IsLong, String>{

	@Override
	public void initialize(IsLong constraintAnnotation) {
	}

	@Override
	public boolean isValid(String inputData, ConstraintValidatorContext ctx) {

        if(inputData == null || inputData.length() < 1){
            return false;
        }

        boolean blnFalse = false;
        char[] sChar = inputData.toCharArray();
        for (char ch : sChar) {
        	if(ValidateUtility.isNumber(String.valueOf(ch)) || (".").equals(String.valueOf(ch))) {
        		// yes
        	} else {
        		blnFalse = true;
        		break;
        	}
        }

        if(blnFalse) {
        	return false;
        }

        return true;
	}

}