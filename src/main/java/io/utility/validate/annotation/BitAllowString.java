package io.utility.validate.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = BitAllowStringValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface BitAllowString {

	String[] allowBitArray() default {"true", "false"};

    String message() default "Allow only {allowCharArray} string to this URL.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}