# 🔐 GeradorDeSenha

> Um gerador de senhas simples e eficiente escrito em Java.

## 📋 Sobre o Projeto
**Objetivo:** Fornecer uma ferramenta para criar senhas fortes e rápidas para uso em testes, estudos ou criação de contas temporárias.

**Como funciona:**
* **Fonte:** O arquivo principal é `gerarSenha.java`.
* **Lógica:** O programa constrói uma senha selecionando aleatoriamente caracteres de uma "string estoque" (contendo letras, números e símbolos).
* **Tecnologia:** Utiliza a classe `java.util.Random` para sortear as posições dentro dessa string.
* **Padrão:** O código vem configurado para gerar uma senha de **10 caracteres**.

---

## 🚀 Como executar

Certifique-se de estar na raiz do projeto pelo terminal e ter o Java instalado.

1. **Compilar o código:**

javac -d build\classes src\GerarSenha\gerarSenha.java
Executar o programa:

Bash
java -cp build\classes GerarSenha.gerarSenha
💻 Exemplo de saída
Ao rodar, você verá algo assim no seu terminal:

Plaintext
GERADOR DE SENHA
Sua senha é: 4$kA@f1Z9!
⚙️ Personalização
Você pode adaptar o código para suas necessidades:

Alterar tamanho: Mude o valor da variável tamanhoDaSenha no código para gerar senhas maiores ou menores.

Mudar o conjunto de caracteres: Edite a string caracteres para adicionar/remover letras, números ou símbolos que deseja permitir.

Melhoria de segurança: Para uso real em produção, recomenda-se substituir Random por SecureRandom (java.security.SecureRandom) para garantir uma aleatoriedade criptograficamente segura.

## 🤝 Contribuição
Fique à vontade para contribuir!

Sugestões: Abra issues para pedir funções como opção de comprimento via terminal ou exportação para arquivo.

Pull requests: Envie PRs com código limpo e testes.
