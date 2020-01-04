import java.util.Scanner;

public class ex1While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int informada = sc.nextInt();

        while (informada != senha){
            System.out.printf("Senha Invalida \n");
            informada = sc.nextInt();
        }

        System.out.printf("Acesso Permitido");
    }
}
