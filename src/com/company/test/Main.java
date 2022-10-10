package com.company.test;

import com.company.main.parser.NumSystem;
import com.company.main.parser.Parser;
import com.company.trash.numbersystem.ToTen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Parser parser = new Parser();
        int[] elevenBits = parser.parseElevenBits();
        Parser.printArr(elevenBits, "your input: ");

        int ten = NumSystem.byteToTenSystem(elevenBits);
        System.out.println(ten);


    }
}
