package io.utility.validate.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = ByteStringValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ByteString {

	int min() default 0;
	int max() default Integer.MAX_VALUE;
	String charset() default "UTF-8";
    String message() default "Please set from {min}byte to {max}byte with {charset}";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}