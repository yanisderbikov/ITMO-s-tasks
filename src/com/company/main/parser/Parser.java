package com.company.main.parser;

import java.util.Arrays;
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

    // парсит строку и возвращает массив 11 битный
    public int[] getElevenBits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("write down 11 bits");
        String inputStr = scanner.nextLine();
        if (inputStr.length() > 11){
            getElevenBits();
        }
        int[] arr = new int[11];
        try {
            int[] arrCash = new int[inputStr.length()];
            for (int i = 0; i < arrCash.length; i++) {
                arrCash[i] = Integer.parseInt(inputStr.substring(i, i+1));
            }

            int i = 10;
            int j = arrCash.length-1;
            while (i > (10 - arrCash.length)){
                arr[i] = arrCash[j];
                i--;
                j--;
            }

        } catch (Exception e){
            System.out.println("this is some shit, not a binary");
            getElevenBits();
        }
        if (!Arrays.stream(arr).allMatch(x -> x == 0 || x == 1)){
            getElevenBits();
        }

        return arr;
    }

    public int[] addToArr(int binary){
        int[] arr = new int[11];
        String str = String.valueOf(binary);

        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }

        printArr(arr, "");

        return arr;
    }

    public static void printArr(int[] arr, String message){
        System.out.println(message);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
