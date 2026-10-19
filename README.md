# Password Analyzer

Aplicação simples de console em Java para validação de senhas. O programa recebe uma senha digitada pelo usuário, verifica se ela atende aos requisitos básicos e se não está entre as senhas mais comuns.

## Requisitos

- Java 21
- Maven

## Como executar

Compile o projeto:

```bash
mvn compile
```

Execute a classe principal:

```bash
java -cp target/classes Main
```

Também é possível executar diretamente pela IDE (IntelliJ IDEA, Eclipse, etc.).

## Como funciona

1. O usuário informa a senha no terminal.
2. O programa valida o tamanho da senha.
3. A senha é comparada com uma lista interna de senhas comuns.
4. O resultado da validação é exibido no console.

### Regras de validação

- A senha não pode ser vazia.
- A senha deve ter no mínimo 6 caracteres.
- A senha deve ter no máximo 20 caracteres.
- A senha não pode estar na lista de senhas comuns (ex.: `123456`, `password`, `qwerty`, `admin`).

## Estrutura do projeto

```
src/main/java
├── Main.java                # Ponto de entrada; lê a senha e exibe o resultado
├── CommonPassword.java      # Classe abstrata com a lista de senhas comuns
├── PasswordVerification.java # Implementa a validação da senha
├── PasswordResults.java     # Armazena o resultado (válido/inválido e mensagem)
└── README.md
```

## Exemplo de uso

```
Enter a password to test:
123456
Password is common
Password: 123456
Is Valid: false
Message: Password is not valid
```

## Observações

- A lista de senhas comuns está definida em `CommonPassword.java`.
- A senha digitada é exibida no console junto com o resultado.
- O projeto não possui testes automatizados no momento.
