import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.print("N sonini kiriting: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Yig'indi: " + sum);

    }
}
