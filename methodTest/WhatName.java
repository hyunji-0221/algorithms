package methodTest;

import java.util.Scanner;

public class WhatName {

    static String inputLastName(Scanner sc){
        System.out.println("학생 이름 : ");
        return sc.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= inputLastName(sc);
        System.out.println("이름 : "+name);
    }
}
