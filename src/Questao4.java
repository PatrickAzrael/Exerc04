import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        System.out.println("Informe a primeira nota: ");
        Scanner leia = new Scanner(System.in);
        float nota1;
        nota1 = leia.nextFloat();

        System.out.println("Informe a segunda nota: ");
        float nota2;
        nota2 = leia.nextFloat();

        System.out.println("Informe a terceira nota: ");
        float nota3;
        nota3 = leia.nextFloat();

        System.out.println("Informe a quarta nota: ");
        float nota4;
        nota4 = leia.nextFloat();
        leia.close();
        float media;

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média entre as notas informadas é: " + media);
    }
}