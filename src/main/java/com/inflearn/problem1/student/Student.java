package com.inflearn.problem1.student;

/**
 * 학생 정보를 담는 객체
 */
public class Student {

    private final String name;

    private final int age;

    private final int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static Student from(String[] studentInfo) {
        return new Student(studentInfo[0], Integer.parseInt(studentInfo[1]), Integer.parseInt(studentInfo[2]));
    }

    @Override
    public String toString() {
        return new StringBuilder().append("이름 : ")
                                  .append(this.name)
                                  .append(" 나이 : ")
                                  .append(this.age)
                                  .append(" 성적 : ")
                                  .append(this.grade)
                                  .toString();
    }
}
