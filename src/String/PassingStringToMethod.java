package String;

public class PassingStringToMethod {
    public static void change(String x){
        x="Anoop";
    }

    public static void main(String[] args) {
        String x="Kumar";
        System.out.println(x);
        change(x);
        System.out.println(x);

    }
}