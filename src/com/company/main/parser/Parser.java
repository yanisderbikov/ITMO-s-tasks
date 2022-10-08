package com.company.main.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Parser {
    public int[] tenToBinary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number: (1-1000) ");
        int input = 0;
        try {
            input = scanner.nextInt();
            if ((0 >= input && input <= 1000)) {
                tenToBinary();
            }
        } catch (Exception e){
            System.out.println("stupid shit! ");
            tenToBinary();
        }

        int binary = Integer.parseInt(Integer.toString(input, 2));
        int[] arrayBinary = addToArr(binary);


        System.out.println("input : " + input );
        System.out.println("binary : " + binary);

        return arrayBinary;

    }

    public int[] addToArr(int binary){
        int[] arr = new int[11];
        String str = String.valueOf(binary);

        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }

        printArr(arr);

        return arr;
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
