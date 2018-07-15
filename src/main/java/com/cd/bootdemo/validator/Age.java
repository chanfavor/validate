package com.cd.bootdemo.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {

    int min();
    int max();
    String message() default "age invalid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
