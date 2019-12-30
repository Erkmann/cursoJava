import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if(n1 % n2 == 0 || n2 % n1 == 0){
            System.out.printf("Sao Multiplos");
        }
        else{
            System.out.printf("Nao sao Multiplos");
        }

    }
}
