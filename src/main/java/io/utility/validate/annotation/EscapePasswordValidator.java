package io.utility.validate.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import io.utility.validate.ValidateUtility;

public class EscapePasswordValidator implements ConstraintValidator<EscapePassword, String>{

	@Override
	public void initialize(EscapePassword constraintAnnotation) {
	}

	@Override
	public boolean isValid(String pwdData, ConstraintValidatorContext ctx) {

        if(pwdData == null || pwdData.length() < 1){
            return false;
        }

        if(!ValidateUtility.validatePassword(pwdData)) {
        	return false;
        }

        return true;
	}

}