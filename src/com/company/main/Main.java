package com.company.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        com.company.trash.HammingCode.shifring8();

        Scanner scanner = new Scanner(System.in);
        int[] code = new int[11];
        for (int i = 0; i < 11; i++) {
            System.out.print("write " + (i+1) + ": ");
            code[i] = scanner.nextInt();
        }
        printArr(code);

        int[] newCode = Hamming11.shifr(code);
        System.out.println("shifered code: ");
        printArr(newCode);

        System.out.println("write which to change (1-15) : ");
        int element = scanner.nextInt();
        if (newCode[element-1] == 0){
            newCode[element-1] = 1;
        } else {
            newCode[element-1] = 0;
        }

        System.out.println("code with error:");
        printArr(newCode);

        int[] recoveredCode = Hamming11.removeErrors(newCode);
        System.out.println("recovered code: ");
        printArr(recoveredCode);


    }


    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }


}