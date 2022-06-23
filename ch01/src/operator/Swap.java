package operator;

public class Swap {
    public static void main(String[] args) {
        int x = 0, y = 1;

        System.out.println("교환 전 \nx = " + x + ", y = " + y);
        System.out.println("----------------------");

        int temp = x;
        x = y;
        y = temp;

        System.out.println("교환 후 \nx = " + x + ", y = " + y);
    }
}
