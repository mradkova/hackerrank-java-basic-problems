package basic;

import java.util.Scanner;
import java.util.StringTokenizer;
//import java.io.*;
//import java.util.*;

public class StringTokens {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //String[] result = s.trim().split("\\W+");
        s.trim();
        //String[] result = s.split("[(^(a-zA-Z))||(\\d\\h\\s {1})]");         
        //System.out.println(result.length);
        
        StringTokenizer result = new StringTokenizer(s, " ://.;,~'`?!_#$%^&*()+-=@{}") ;
        System.out.println(result.countTokens());
        while (result.hasMoreTokens())
        {
            System.out.println(result.nextToken());
        }
        
//        for(String str: result) {
//        	System.out.println(str);
//        }   
        scan.close();
    }
}
