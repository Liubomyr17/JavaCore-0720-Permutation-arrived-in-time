package com.company;

import sun.awt.windows.WPrinterJob;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*

0720 Permutation arrived in time

Enter 2 N and M from the keyboard.
Enter N lines and fill in the list with them.
Rearrange the M first lines to the end of the list.
Display the list, each value from a new line.
Note: It is forbidden to create more than one list.

Requirements:
1. Declare a variable like list of strings and immediately initialize ee.
2. Read the numbers N and M from the keyboard, read N lines and add them to the list.
3. Rearrange the M first lines to the end of the list.
4. Display the list, each value from a new line.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int N = Integer.valueOf(reader.readLine());
        int M = Integer.valueOf(reader.readLine());

        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < M; i++) {
            list.add(list.size() - 1, list.remove(0));
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}








