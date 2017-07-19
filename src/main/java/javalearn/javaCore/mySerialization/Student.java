package javalearn.javaCore.mySerialization;


import java.io.Serializable;

public class Student implements Serializable {

    protected static String faculty;
    private String name;
    private int age;
    private transient String password = null;
    private static final long serialVersionUID = 1L;

    public Student(String nameOfFaculty,String name, int age, String password) {
        faculty = nameOfFaculty;
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student " + name + " " + age + " " + faculty;
    }
}
