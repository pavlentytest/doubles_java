public class Main {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 2.1;
        System.out.println (3.0 - 2.1);
        double c = a - b;
        System.out.println(c);
        double d = 0.899;
        if(Math.abs(c-d) < 0.00001) {
            System.out.println ("Одинаковы");
        }
        System.out.println(0.1 + 0.2);
        double x = 0.1;
        double y = 0.2;
        double z = 0.3;
        System.out.println(Math.abs((x + y) - z) < 0.00001);

    }
}