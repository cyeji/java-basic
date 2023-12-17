package com.inflearn.problem1.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 학생 정보 출력 프로그램 만들기
 * 당신은 두명의 학생 정보를 출력하는 프로그램을 작성해야 한다.
 * 각 학생은 이름, 나이, 성적을 가지고 있다.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("학생의 이름, 나이, 성적을 입력하세요. ex) 홍길동 19 90");
            String studentInfo = sc.nextLine();
            studentList.add(Student.from(studentInfo.split(" ")));
        }

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

}
