package com.inflearn.problem1.student;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student = new Student("학생", 15, 90);
        Student student2 = new Student("학생", 15, 99);

        Student[] students = new Student[]{student, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].getName() + " 나이: " + students[i].getAge() + " 성적 : " + students[i].getGrade());
        }
        
    }
}
