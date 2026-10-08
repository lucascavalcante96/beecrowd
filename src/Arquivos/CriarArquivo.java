package Arquivos;

import java.io.FileWriter;
import java.io.IOException;

public class CriarArquivo {
    static void main()  {

        try (FileWriter mensagem = new FileWriter("arquivo.txt")){
            mensagem.write("Conteúdo a ser gravado no arquivo.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo.");
        }
    }
}
