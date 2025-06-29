import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        float N1 = leia.nextFloat();
        float N2 = leia.nextFloat();
        float N3 = leia.nextFloat();
        float N4 = leia.nextFloat();
        
        float MP = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10;
        System.out.printf("Media: %.1f\n",MP);
        if(MP>=7){
            System.out.print("Aluno aprovado.\n");
        } if (MP > 5 && MP <6.9){
            System.out.print("Aluno em exame.\n");
            
            float NE = leia.nextFloat();
            float MF = (MP+NE)/2;
            
            if(MF>=5){
                System.out.print("Aluno aprovado.\n");
                System.out.printf("Nota do exame: %.1f\n",MF);
            } else {
                System.out.print("Aluno reprovado.\n");
            }
        } else if (MP<5){
            System.out.print("Aluno reprovado.");
        }
    }
}