package Excecoes;

import java.util.Scanner;

/*
Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos
(por exemplo, ter pelo menos 8 caracteres).
 */
public class Senha {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String password = sc.nextLine();
        try {
            validarSenha(password);
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw  new SenhaInvalidaException("Senha invalida deve conter no minimo 8 caracteres");
        }
    }
}
