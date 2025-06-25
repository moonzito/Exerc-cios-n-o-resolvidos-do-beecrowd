import java.util.Scanner;
//import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int valor = leia.nextInt();

        
        if (valor > 100) {
            int rc = valor / 100;
            System.out.format("%d nota(s) de R$ 100,00\n",rc);

            int r50 = rc/50;
            System.out.printf("%d nota(s) de R$ 50,00\n",r50);

        }

    }
}
