import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        try {
            System.out.println("Hãy nhập a: ");
            a = scanner.nextInt();
            System.out.println("Hãy nhập b: ");
            b = scanner.nextInt();
            System.out.println("Hãy nhập c : ");
            c = scanner.nextInt();
            if (a > 0 && b > 0 && c > 0){
                if (a + b > c && a + c > b && b + c > a){
                    System.out.println("Là tam giác");
                }else {
                    throw new IllegalTriangleException();
                }
            }else {
                throw new IllegalTriangleException();
            }
        } catch (InputMismatchException i) {
            System.out.println(i.getMessage());
        } catch (IllegalTriangleException e) {
            System.out.println("xảy ra ngoại lệ : " + e.toString());
        }

    }

}