package com.company.main;

import java.util.Arrays;

public class Hamming11 {


    // cюда пеоедается 11 битный код
    public static int[] shifr(int[] code){

        int[] array = new int[16];
        Arrays.fill(array, -1);
        array[0] = 10;

//        копирование массива
        int j = 3;
        for (int i = 0; i < code.length; i++) {
            if( j == 4 || j == 8) {
                j++;
            }
            array[j] = code[i];
            j++;
        }

////        первое число:
//        array[1] = 0;
//        for (int i = 1; i <= array.length-1; i++) {
//            if (i % 2 == 0){
//                i++;
//            }
//            array[1] += array[i];
//        }
//        array[1] = array[1] % 2;
//
//
////        второе число
//        array[2] = array[3];
//        for (int i = 6; i <= array.length-1 ; i++) {
//            for (int k = 0; k < 2; k++) {
//                array[2] += array[i+k];
//            }
//            i+=4;
//        }
//        array[2] = array[2] % 2;
//
//        array[2] = 0;
//        j = 2;
//        while (j<=15){
//
//        }
//
//
//
////        третее число
//        array[4] = 0;
//        j = 4;
//        while (j<=15){
//            for (int k = 0; k < 4; k++) {
//                array[4] += array[j+k];
//            }
//            j+=8;
//        }
//        array[4] = array[4] % 2;
//
//
////        четвертое число
//        array[8] = 0;
//        j = 8;
//        while (j<=15){
//            for (int k = 0; k < 8; k++) {
//                array[8] += array[j+k];
//            }
//            j+=16;
//        }
//        array[8] = array[8] % 2;

        int i = 1;
        while (i <= 15){
            array[i] = create(array,i);
            i = i*2;
        }

        return Arrays.copyOfRange(array,1,array.length);
    }

    static int create(int[] array, int element){
        array[element] = 0;
        int j = element;
        while (j<=15){
            for (int k = 0; k < element; k++) {
                array[element] += array[j+k];
            }
            j += element * 2;
        }
        array[element] = array[element] % 2;
        return array[element];
    }

    public static int[] removeErrors(int[] code){
        int j = 1;
        int[] array = new int[16];
        array[0] = 10;
        for (int i = 0; i < code.length; i++) {
            array[j] = code[i];
            j++;
        }

        int[] checkList = new int[16];

        for (int i = 1; i <= 15; i*=2) {
            checkList[i] = create(array,i);
        }

        for (int i = 1; i <= 15; i*=2) {
            if (checkList[i] != array[1] && checkList[i] == 0){
                array[i] = 1;
            }
        }

        return Arrays.copyOfRange(array,1,array.length);
    }


}
