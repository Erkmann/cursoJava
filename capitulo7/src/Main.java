import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z){
        if (x > y && x > z){
            return x;
        }
        else if (y > z){
            return y;
        }
        else{
            return z;
        }
    }

    public static void showResult(int res){
        System.out.println("Higher = " + res);
    }

}
