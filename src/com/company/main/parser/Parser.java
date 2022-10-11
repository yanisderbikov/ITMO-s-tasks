package com.company.main.parser;

import java.util.Arrays;
import java.util.Scanner;

public class Parser {
//    public int[] tenToBinary(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input a number: (1-1000) ");
//        int input = 0;
//        try {
//            input = scanner.nextInt();
//            if ((0 >= input && input <= 1000)) {
//                tenToBinary();
//            }
//        } catch (Exception e){
//            System.out.println("stupid shit! ");
//            tenToBinary();
//        }
//
//        int binary = Integer.parseInt(Integer.toString(input, 2));
//        int[] arrayBinary = addToArr(binary);
//
//
//        System.out.println("input : " + input );
//        System.out.println("binary : " + binary);
//
//        return arrayBinary;
//
//    }

    public int[] parseFifteenBits(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("write down 15 bits");
        String inputStr = scanner.nextLine();
        if (inputStr.length() > 15){
            parseFifteenBits();
        }
        int[] arr = new int[15];
        try {
            int[] arrCash = new int[inputStr.length()];
            for (int i = 0; i < arrCash.length; i++) {
                arrCash[i] = Integer.parseInt(inputStr.substring(i, i+1));
            }

            int i = 14;
            int j = arrCash.length-1;
            while (i > (14 - arrCash.length)){
                arr[i] = arrCash[j];
                i--;
                j--;
            }

        } catch (Exception e){
            System.out.println("this is some shit, not a binary");
            parseFifteenBits();
        }
        if (!Arrays.stream(arr).allMatch(x -> x == 0 || x == 1)){
            parseFifteenBits();
        }

        return arr;
    }

    public int[] parseElevenBits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("write down 11 bits");
        String inputStr = scanner.nextLine();
        if (inputStr.length() > 11){
            parseElevenBits();
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
            parseElevenBits();
        }
        if (!Arrays.stream(arr).allMatch(x -> x == 0 || x == 1)){
            parseElevenBits();
        }

        return arr;
    }

    public static void printArr(int[] arr, String message){
        System.out.println(message);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static String printArr(int[] arr){
        StringBuilder builder = new StringBuilder("");
        builder.append("[");
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
        }
        builder.append("]");

        return builder.toString();
    }

    public int[] parseAnyBits(){
        // TODO: 11.10.2022 поверить если будет 0 на вход
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] arr = new int[str.length()];
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
                if (arr[i] != 0 || arr[i] != 1){
                    throw new RuntimeException();
                }
            }
        } catch (Exception e){
            parseAnyBits();
        }

        int[] hammingSignature = createHammingSignature(arr.length);



        return null;
    }

    static int[] createHammingSignature(int length){
        // 1 параметр - количество значимых битов
        // 2 параметр - количество кодируемых битов
        
        return null;
    }
}
