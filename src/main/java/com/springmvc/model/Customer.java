package com.springmvc.model;

import com.springmvc.customannotations.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull(message = "should not be empty, required") // better usage -> @NotBlank(message = "should not be empty")
    @Size(min = 1,message="is required")
    private String lastName;

    @NotNull(message="is required")
    @Min(value = 0, message = "must be greater or equal than 0")
    @Max(value=10, message = "must be lesser than 11")
    private Integer freePasses;

    @Pattern(regexp = "^[0-9]{6}", message = "should be 6 valid digits")
    private String pinCode;

    @CourseCode(value = "GOW", message = "course code must start with GOW")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }


    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
