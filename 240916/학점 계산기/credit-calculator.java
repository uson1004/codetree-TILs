import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr;
        double avg = 0;
        for(int i = 0; i < n; i++) {
            arr = sc.nextDouble();
            avg += arr;
        }
        arr = (double)avg / n;
         
        System.out.printf("%.1f\n", arr);

        if (arr >= 4.0) {
            System.out.print("Perfect");
        } else if (arr >= 3.0) {
            System.out.print("Good");
        } else {
            System.out.print("Poor");
        }
    }
}