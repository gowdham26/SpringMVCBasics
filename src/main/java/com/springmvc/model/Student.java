package com.springmvc.model;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    private String[] operatingSystems;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    private String programmingLanguage;

    public LinkedHashMap getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap countryOptions) {
        this.countryOptions = countryOptions;
    }

    private LinkedHashMap countryOptions;

    public LinkedHashMap getFavLanguageOptions() {
        return favLanguageOptions;
    }

    public void setFavLanguageOptions(LinkedHashMap favLanguageOptions) {
        this.favLanguageOptions = favLanguageOptions;
    }

    private LinkedHashMap favLanguageOptions;

    public String[] getOperatinsSystemOptions() {
        return operatinsSystemOptions;
    }

    public void setOperatinsSystemOptions(String[] operatinsSystemOptions) {
        this.operatinsSystemOptions = operatinsSystemOptions;
    }

    private String[] operatinsSystemOptions;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String country;

    public Student() {
        countryOptions = new LinkedHashMap();
        countryOptions.put("BR", "BRAZIL");
        countryOptions.put("ENG", "ENGLAND");
        countryOptions.put("IND", "INDIA");
        countryOptions.put("AUS", "AUSTRALIA");

        favLanguageOptions = new LinkedHashMap();
        favLanguageOptions.put("C#", "Csharp");
        favLanguageOptions.put("JAVA", "Java");
        favLanguageOptions.put("PYTHON", "Python");

        operatinsSystemOptions = new String[]{"Windows", "MAC", "LINUX"};


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
