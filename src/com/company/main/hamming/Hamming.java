package com.company.main.hamming;

import java.util.Arrays;

public class Hamming {


    // пеоедается 11 битный код
    public static int[] cipher(int[] code){

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

    public static int[] decipher(int[] ciphered){
        int[] copy = new int[16];
        for (int i = 1; i <= 15; i++) {
            copy[i] = ciphered[i-1];
        }

        int[] decipheredArr = new int[12];

        int i = 3;
        int j = 1;
        while (i <= 15){
            if (i == 4 || i == 8) {
                i++;
            }
            decipheredArr[j] = copy[i];
            i++;
            j++;
        }

        return Arrays.copyOfRange(decipheredArr, 1, decipheredArr.length);
    }


}
