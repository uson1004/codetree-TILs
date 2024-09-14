import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0, i = 0;
        
        for(i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 250) break;
            sum += arr[i];
        }
        double avg = (double)sum / i;
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}