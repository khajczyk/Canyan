package pracadomowa;

public class Zadanie2 {

    public static void main(String[] args) {
        String result = method1(15, 6, "");
        System.out.println(result);

    }
    public static String method1(int a, int b, String d) {

        d = new String(String.valueOf(a / b) + " " + String.valueOf(a % b) + "/" + b);

        if (a % b == 0) {
            return String.valueOf(a / b);
        }else if (b % (a % b) == 0) {
            return new String(String.valueOf(a / b) + " " + String.valueOf((a % b) / (a % b ) ) + "/" + (b / (a % b)));
        }
        else {
            return d;
        }
    }
}
