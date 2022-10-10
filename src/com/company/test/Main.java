package com.company.test;

import com.company.main.parser.NumSystem;
import com.company.main.parser.Parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Parser parser = new Parser();
        int[] elevenBits = parser.parseElevenBits();
        Parser.printArr(elevenBits, "your input: ");

        int ten = NumSystem.byteToTenSystem(elevenBits);
        System.out.println(ten);

//        int[] code = parser.parseElevenBits();
//        Parser.printArr(code, "your input code: ");
//
//        int[] cipheredCode = Hamming.cipher(code);
//        Parser.printArr(cipheredCode, "ciphered code: ");
//
//        Parser.printArr(Hamming.decipher(cipheredCode), "deciphered code:");
//
//        cipheredCode = makeAnError(cipheredCode);
//        Parser.printArr(cipheredCode, "code with error:");
//
//        int[] recoveredCode = Hamming.recoverCode(cipheredCode);
//        Parser.printArr(recoveredCode, "recovered code: ");
//
//        int[] decipheredCode = Hamming.decipher(recoveredCode);
//        Parser.printA

    }
}
