package String;

public class BuiltInMethod {
    public static void main(String[] args) {
        String s="Anoop Kumar 🫶🫶";
        System.out.println(s.indexOf('p'));
        System.out.println(s.indexOf('m'));
        System.out.println(s.indexOf('r'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        if(s.contains("🫶"))
            System.out.println("Happy");
        System.out.println(s.startsWith("An"));
    }
}
