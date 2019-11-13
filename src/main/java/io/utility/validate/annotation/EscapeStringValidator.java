package io.utility.validate.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import io.utility.validate.ValidateUtility;

public class EscapeStringValidator implements ConstraintValidator<EscapeString, String>{

	@Override
	public void initialize(EscapeString constraintAnnotation) {
	}

	@Override
	public boolean isValid(String inputData, ConstraintValidatorContext ctx) {

        if(inputData == null || inputData.length() < 1){
            return false;
        }

        if(!ValidateUtility.validateCharacters(inputData)) {
        	return false;
        }

        return true;
	}

}