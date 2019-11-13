package io.utility.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.utility.validate.annotation.CharacterEscapeValidator;

public class ValidateUtility {

	final static Logger logger = LoggerFactory.getLogger(CharacterEscapeValidator.class);
	
	public static char[] CHR_ARRAY = {'<', '>', '"', '\'', '^'};
	public static char[] CHR_ARRAY2 = {'<', '>', '"', '^'};

	public static boolean isExtenstionName(String str, String ext) {

    	String[] strName = str.split("\\.");
    	if(strName.length < 2) {
    		return false;
    	}

    	// TODO To revise this
    	if(!strName[strName.length].equals(ext)) {
    		return false;
    	}

        return true;
    }

    public static boolean isNumber(String str) {

        boolean result = true;

    	if(str==null) {
        	return false;
        }

        byte[] ori = str.getBytes();
        if(ori==null) {
        	return false;
        }

        for(int i=0; i<ori.length; i++){

            if(ori[i]>0x2F && ori[i] < 0x3A){
            	// If it's number....don't do it
            }else{
            	// If it's string....
            	return false;
            }
        }

        return result;
    }

    /**
     * Validate the inputed String with default special character.
     * 
     * @param s
     * @return
     */
    public static boolean validateSpecialCharacter(String s) {

    	// Check null
    	if(s == null) {
    		return false;
    	}

        // char[] sChar = s.toCharArray();
        for (char ch : CHR_ARRAY2) {
        	if(s.contains(String.valueOf(ch))) {
        		return false;
        	}
        }

        return true;
    }

    /**
     * Validate the inputed String with user's set special character.
     * 
     * @param s
     * @return
     */
    public static boolean validateSpecialCharacter(String s, char[] specialCharArray) {

    	if (s == null || s.trim().isEmpty()) {
            return false;
        }

    	// Set the default special characters.
    	if(specialCharArray == null) {
    		specialCharArray = ValidateUtility.CHR_ARRAY;
    	}

        for (char ch : specialCharArray) {
        	if(s.contains(String.valueOf(ch))) {
        		return false;
        	}
        }

        return true;
    }

    /**
     * Only allow to input the [^A-Za-z0-9]
     * @param s
     * @return
     */
    public static boolean validateCharacters(String s) {
        if (s == null || s.trim().isEmpty()) {
            return false;
        }

        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(s);
        if (m.find()) {
        	return false;
        }

        return true;
    }

    /**
     * Only allow to input the [0,1]
     * @param s
     * @return
     */
    public static boolean validateCharacters(String s, char[] allowCharArray) {
        if (s == null || s.trim().isEmpty()) {
            return false;
        }

        for (char ch : allowCharArray) {
        	if(s.contains(String.valueOf(ch))) {
        		return true;
        	}
        }

        return false;
    }

    /**
     * For password
     * @param pwd
     * @return
     */
    public static boolean validatePassword(String pwd) {
        if (pwd == null || pwd.trim().isEmpty()) {
            return false;
        }

        String pattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,})";
        if (!pwd.matches(pattern)) {
        	return false;
        }

        return true;
    }
}
