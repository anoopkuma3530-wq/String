package String;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        String s1=Integer.toString(n);
        String s2=String.valueOf(n);
        String s3=""+n;
        System.out.println(s3);
    }
}
