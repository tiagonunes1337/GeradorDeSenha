package GerarSenha;

import java.util.Random; ///Serve para criar caracteres/numeros/ (o principal gerador de senha)

public class gerarSenha {

    public static void main(String[] args) {
        System.out.println("GERADOR DE SENHA");
        
        String geradorSenha = "";
       
       Random gerador = new Random();
        
       String caracteres = "DJAJFISDJIFAIFNOFINFOAIKJNFJOKASOJNAFKJFBNAHJFSHABIHFE1342312321SABHASFHSBJHASFSFJHASFUJH84284389120841249920148*$#$@#@#@21@!@!@$%$¨¨¨&&**(&"; ///Estoque da geração de senha
       
       
       int tamanho = caracteres.length(); ///length é o conversor da String

       int tamanhoDaSenha = 10; //Quero somente 10 senhas
        for (int i = 0; i < tamanhoDaSenha; i++) {
            int posicao = gerador.nextInt(tamanho);
            char letra = caracteres.charAt(posicao);
            ///A declaração de Gerador de Senha só para imprimir.
            geradorSenha = geradorSenha + letra; 
        }
        
        System.out.println("Sua senha é: " + geradorSenha); 
    }
    
}
