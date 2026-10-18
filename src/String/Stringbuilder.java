package String;

import java.sql.SQLOutput;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder(6);
        System.out.println(s.length()+" "+s.capacity());
//        System.out.println(s);
        s.append("lumar");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.setCharAt(1,'k');
        System.out.println(s);
        String t=s.toString();
        System.out.println(t);
        s.append("prajapati");
        System.out.println(s.length()+" "+s.length());


    }
}
