import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();

        if (n < 0){
            System.out.printf("NEGATIVO");
        }
        else {
            System.out.printf("POSITIVO");
        }

        sc.close();

    }
}
