import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        String str = sc.nextLine();
        arr = str.split(" ");
        for(int i = 9; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}