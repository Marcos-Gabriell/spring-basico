# Projeto de Estudo ecossistema Spring 

Este repositório é destinado ao estudo do ecossistema Java e Spring, fornecendo uma base simples para aprender conceitos essenciais, como configurações do JDK, Maven, injeção de dependência e anotações Spring.

## Configurações do Projeto

### Pré-requisitos

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html): Certifique-se de ter o Java Development Kit instalado. Você pode verificar a instalação digitando `java -version` no seu terminal.
- Um compilador Java: Geralmente, o compilador Java já está incluído no Java JDK. Você pode verificar a instalação digitando `javac -version` no terminal.
- Uma IDE (Ambiente de Desenvolvimento Integrado) ou um editor de código: Você pode escolher entre várias opções populares, como:

  - [Eclipse](https://www.eclipse.org/downloads/): Uma IDE poderosa e amplamente utilizada para desenvolvimento Java.
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/): Uma IDE popular com uma gama de recursos avançados.
  - [Visual Studio Code](https://code.visualstudio.com/download): Um editor de código leve e altamente personalizável, com extensões para Java.

### Configuração do JDK
Certifique-se de ter o JDK 11 instalado. Se necessário, faça o download e instalação [aqui](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Configuração do Maven
Este projeto utiliza o Maven como gerenciador de dependências. Certifique-se de ter o Maven instalado. Se necessário, faça o download e instalação [aqui](https://maven.apache.org/download.cgi).

## Estrutura do Projeto

O projeto segue uma estrutura padrão Maven, com os diretórios principais:

- `src/main/java`: Código-fonte Java.
- `src/main/resources`: Recursos como arquivos de configuração.
- `src/test/java`: Testes unitários.

## Injeção de Dependência e Anotações

O projeto demonstra o uso de injeção de dependência e anotações Spring. Algumas anotações notáveis incluem:

- `@Autowired`: Para injeção de dependência.
- `@Controller`, `@Service`, `@Repository`: Para indicar componentes Spring.
- `@RequestMapping`: Para mapeamento de URLs.
- `@Value`: Para injetar valores de propriedades.

## Executando o Projeto

Certifique-se de ter o JDK e o Maven instalados. Clone o repositório e execute o seguinte comando na raiz do projeto:

```bash
mvn spring-boot:run
