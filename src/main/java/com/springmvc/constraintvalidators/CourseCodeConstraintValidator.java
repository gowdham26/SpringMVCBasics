package com.springmvc.constraintvalidators;

import com.springmvc.customannotations.CourseCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode courseCode) {
        System.out.println("course prefix initialized");
        coursePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String userEnteredValue, ConstraintValidatorContext constraintValidatorContext) {
        if (userEnteredValue != null) {
            return userEnteredValue.startsWith(coursePrefix);
        }

        return true;
    }
}
