package com.company.test;

import com.company.main.parser.Parser;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();

        int[] arr = parser.getElevenBits();
        Parser.printArr(arr, "parsed array is: ");



    }
}
