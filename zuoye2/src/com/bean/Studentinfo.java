package com.bean;

public class Studentinfo {
    private String name;
    private int age;
    private String class1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    @Override
    public String toString() {
        return "Studentinfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", class1='" + class1 + '\'' +
                '}';
    }
}
