package com.springmvc.customannotations;

import com.springmvc.constraintvalidators.CourseCodeConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    public String value() default "GOW";

    public String message() default "Course code must start with GOW";

    public Class<?>[] groups() default {}; // grouping constraints

    public Class<? extends Payload>[] payload() default {}; // contains details about validation(security, failure)

}

