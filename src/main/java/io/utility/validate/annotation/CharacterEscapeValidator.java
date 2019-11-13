package io.utility.validate.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.utility.validate.ValidateUtility;

public class CharacterEscapeValidator implements ConstraintValidator<CharacterEscape, String>{

	final Logger logger = LoggerFactory.getLogger(CharacterEscapeValidator.class);
	
	private char[] CHAR_ARRAY = {'\'', '"', '^'};

	@Override
	public void initialize(CharacterEscape characterEscape) {
		CHAR_ARRAY = characterEscape.charArray();
	}

	@Override
	public boolean isValid(String inputData, ConstraintValidatorContext ctx) {

    	if (inputData == null || inputData.trim().isEmpty()) {
            return true;
        }

    	// Set the default special characters.
    	if(CHAR_ARRAY == null) {
    		CHAR_ARRAY = ValidateUtility.CHR_ARRAY;
    	}

        for (char ch : CHAR_ARRAY) {
        	if(inputData.contains(String.valueOf(ch))) {
        		return false;
        	}
        }

        return true;
	}

}