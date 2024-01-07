package com.inflearn.problem1.student;

import java.util.Objects;

/**
 * 학생 정보를 담는 객체
 */
public class Student {

    private String name;

    private int age;

    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public static Student from(String[] studentInfo) {
        return new Student(studentInfo[0], Integer.parseInt(studentInfo[1]), Integer.parseInt(studentInfo[2]));
    }

//    @Override
//    public String toString() {
//        return new StringBuilder().append("이름 : ")
//                                  .append(this.name)
//                                  .append(" 나이 : ")
//                                  .append(this.age)
//                                  .append(" 성적 : ")
//                                  .append(this.grade)
//                                  .toString();
//    }

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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            if (student.name.equals(this.name) && this.age == student.age) {
                return true;
            }
        }
        return false;
    }

}
