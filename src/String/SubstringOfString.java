package String;

public class SubstringOfString {
    public static void main(String[] args) {
//        String a="Anoop";
//        System.out.println(a);
//        String k="Kumar";
//        System.out.println(k);
        String s = "Anoop";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.print(s.substring(i, j)+" ");
//        System.out.println(s.substring());

            }
            System.out.println();
        }
    }
}
