package com.inflearn.chapter2;

public class MethodChange2 {

    public static void main(String[] args) {
        Data a = new Data();
        a.setValue(10);

        System.out.println("메서드 호출 전 : dataA.value = " + a.getValue());
        changeReference(a);
        System.out.println("메서드 호출 후 : dataA.value = " + a.getValue());

    }

    public static void changeReference(Data x) {
        x.setValue(20);
    }
}
