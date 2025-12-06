💻**GeradorDeSenha — gerador simples de senhas em Java**💻

Resumo: Programa Java que gera uma senha aleatória usando um conjunto de caracteres predefinido.
Objetivo: Fornecer uma senha forte e rápida para uso em testes ou criação de contas temporárias.
Como funciona:

Fonte: O principal arquivo é gerarSenha.java.
Lógica: O programa constrói uma senha selecionando aleatoriamente caracteres de uma string contendo letras, números e símbolos. Usa java.util.Random para escolher posições dentro dessa string.
Tamanho padrão: O exemplo atual gera uma senha com 10 caracteres (variável tamanhoDaSenha).
Como executar:

1. **Compilar:**
   ```bash
   javac -d build\classes src\GerarSenha\gerarSenha.java
2. **Executar:**
java -cp build\classes GerarSenha.gerarSenha

🔑Exemplo de saída:🔑

Sua execução imprimirá algo como:
GERADOR DE SENHA
Sua senha é: 4$kA@f1Z9!
Personalização:

Alterar tamanho: Mude o valor de tamanhoDaSenha para gerar senhas maiores ou menores.
Mudar o conjunto de caracteres: Edite a string caracteres para adicionar/remover letras, números ou símbolos que deseja permitir.
Melhoria de aleatoriedade: Para maior segurança, substitua Random por 🔑SecureRandom🔑 (java.security.SecureRandom) se as senhas forem para uso real.
Contribuição:

Sugestões: Abra issues para pedir funções como opção de comprimento, inclusão/exclusão de tipos de caracteres (por exemplo, sem símbolos), ou exportação para arquivo.
Pull requests: Envie PRs com código limpo e testes mínimos adicionados.