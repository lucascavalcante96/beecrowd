package Excecoes;
/*
Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
 */
import java.util.Scanner;

public class Divisao {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        double resultado;
        System.out.print("Digite o primeiro numero: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        b = sc.nextInt();
        try {
            resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possivel dividir por zero");
        }
        sc.close();
    }
}
