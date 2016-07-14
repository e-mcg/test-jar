package com.linqia.testjar;

import java.util.List;
import java.util.Arrays;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
        	   // thread to sleep for 1000 milliseconds
        	Thread.sleep(3000);
        } catch (Exception e) {
        	System.out.println(e);
        }
        System.out.println("Goodbye world!");
    }
}
