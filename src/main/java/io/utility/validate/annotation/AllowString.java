package io.utility.validate.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = AllowStringValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface AllowString {

	char[] allowCharArray() default {'0', '1'};

    String message() default "Allow only {strAllow} string to this URL.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}