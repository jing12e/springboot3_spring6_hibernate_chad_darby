package com.luv2code.demo.entity;

public class Student {
    private String firstName;
    private String lastName;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * 获取
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 获取
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Student{firstName = " + firstName + ", lastName = " + lastName + "}";
    }
}
