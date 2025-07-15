package com.demo.lab1;
import java.util.Scanner;
import java.lang.String;

public class WordCount {
    public void charAt(String str,int word){
        System.out.println(str.charAt(word));
    }
//    public void contains(){
//
//    }
    public static void Contains(String str,String search) {
        System.out.println("contains(" + search + "): " + str.contains(search));
    }

    public static void Length(String str) {
        System.out.println("length : " + str.length());
    }

    public static void IndexOf(String str, String search) {
        System.out.println("indexOf(" + search + "): " + str.indexOf(search));
    }

    public static void Equals(String str1, String str2) {
        System.out.println("\"" + str1 + "\".equals(\"" + str2 + "\"): " + str1.equals(str2));
    }

    public static void EqualsIgnoreCase(String str1, String str2) {
        System.out.println("\"" + str1 + "\".equalsIgnoreCase(\"" + str2 + "\"): " + str1.equalsIgnoreCase(str2));
    }

    public static void Join(String delimiter, String... elements) {
        System.out.println("join(): " + String.join(delimiter, elements));
    }

    public static void LastIndexOf(String str, String search) {
        System.out.println("lastIndexOf(\"" + search + "\"): " + str.lastIndexOf(search));
    }

    public static void Substring(String str, int start, int end) {
        System.out.println("substring(" + start + ", " + end + "): " + str.substring(start, end));
    }

    public static void ToLowerCase(String str) {
        System.out.println("toLowerCase(): " + str.toLowerCase());
    }

    public static void ToUpperCase(String str) {
        System.out.println("toUpperCase(): " + str.toUpperCase());
    }

    public static void Trim(String str) {
        System.out.println("trim(): \"" + str.trim() + "\"");
    }
    public static void main(String[] args) {
        String str;
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter a String");
        str=sc.nextLine();
        System.out.println("Enter a position your looking for");
        int word=sc.nextInt();
        WordCount wd=new WordCount();
        wd.charAt(str,word);
        System.out.println(str);
    }
}
