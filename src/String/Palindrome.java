package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
        String s="markram";
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) System.out.println("false");;
            i++;
            j--;

        }
        System.out.println("true");;
    }
}
