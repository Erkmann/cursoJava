import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char dnv;
        int tempC;
        double tempF;

        do{
            System.out.printf("Digite a temperatura em Celsius: ");
            tempC = sc.nextInt();
            tempF = ((double) tempC * 9) / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: " + tempF);
            System.out.printf("\n Deseja Repetir (s/n)? ");
             dnv = sc.next().charAt(0);
        }while(dnv == 's');
    }
}
