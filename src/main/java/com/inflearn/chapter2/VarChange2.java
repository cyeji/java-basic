package com.inflearn.chapter2;

public class VarChange2 {

    public static void main(String[] args) {
        Data data = new Data();
        data.setValue(10);

        Data data2 = data;

        System.out.println("data 참조값" + data);
        System.out.println("data2 참조값" + data2);

        data.setValue(20);
        System.out.println("변경 data.value = 20");
        System.out.println("data 참조값" + data);
        System.out.println("data2 참조값" + data2);

    }
}
