package com.company.trash;

import java.util.Arrays;
import java.util.Scanner;

public class HammingCode {

    public static int[] shifr(int[] code4){


        int[] array = new int[8];// первый битик будет пустой
        // заполняем

        array[3] = code4[0];
        array[5] = code4[1];
        array[6] = code4[2];
        array[7] = code4[3];

        array[1] = (array[3] + array[5] + array[7]) % 2;
        array[2] = (array[3] + array[6] + array[7]) % 2;
        array[4] = (array[5] + array[6] + array[7]) % 2;


        return Arrays.copyOfRange(array, 1,array.length);
    }

    public static int[] deshifr(int[] arr){

//        сделать новый массив, который девшифрует с значениями начиная с 1
        int[] array = new int[8];
        for (int i = 1; i < 8; i++) {
            array[i] = arr[i-1];
        }
        int first = (array[3] + array[5] + array[7]) % 2;
        int second = (array[3] + array[6] + array[7]) % 2;
        int third = (array[5] + array[6] + array[7]) % 2;

//        исправлятор
        int error = 0;
        if (first != array[1]){
            error = error + 1;
        } if (second != array[2]) {
            error = error + 2;
        } if (third != array[4]) {
            error = error + 4;
        }

        // ошибка в индексе error

        if (array[error] == 1){
            array[error] = 0;
        } else {
            array[error] = 1;
        }

        return Arrays.copyOfRange(array, 1, array.length);
    }


    public static int[] changeElementNum(int[] arrFrom){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nwhich element want to change? (1 - 7)");
        int element = scanner.nextInt() - 1;

        if (arrFrom[element] == 1){
            arrFrom[element] = 0;
        } else {
            arrFrom[element] = 1;
        }

        System.out.println("is everything all right?");
        for (int i : arrFrom){
            System.out.print(i);
        }
        System.out.println();
        return arrFrom;
    }



    public static void shifring8(){
        Scanner scanner = new Scanner(System.in);

        int[] code = new int[4];
        for (int i = 0; i < code.length; i++) {
            System.out.printf("write %s: ", Integer.valueOf(i+1).toString());
            code[i] = scanner.nextInt();
        }


        int[] result = HammingCode.shifr(code);
        for (int i : result) {
            System.out.print(i);
        }

        int[] arr = HammingCode.changeElementNum(result);

        System.out.println();

        arr = HammingCode.deshifr(arr);
        System.out.println("code recovered");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }




}
