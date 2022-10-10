package com.company.main.parser;

public class NumSystem {

    public static int byteToTenSystem(int[] code){

        int sum = 0;

        int j = 10;
        for (int i = 0; i < code.length; i++) {
            sum = code[i] * (int)Math.pow(2, j) + sum;
            j--;
        }


        return sum;
    }


}
