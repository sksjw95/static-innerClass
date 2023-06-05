package org.example;

public class Main {
    public static void main(String[] args) {

        Outer.StaticInClass a = new Outer.StaticInClass();
        // 정적 이너클래스의 객체 생성
        a.test();
    }
}