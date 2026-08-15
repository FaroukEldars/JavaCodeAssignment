package Session01;

public class SwappingTwoNumbers {
    static void main() {
        int a = 10;
        int b = 20;
//
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
//        System.out.println(b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
