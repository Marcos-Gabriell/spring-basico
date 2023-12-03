# Projeto de Estudo ecossistema Spring 

Este repositório é destinado ao estudo do ecossistema Java e Spring, fornecendo uma base simples para aprender conceitos essenciais, como configurações do JDK, Maven, injeção de dependência e anotações Spring.

## Configurações do Projeto

### Pré-requisitos

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html): Certifique-se de ter o Java Development Kit instalado. Você pode verificar a instalação digitando `java -version` no seu terminal.
- Uma IDE (Ambiente de Desenvolvimento Integrado) ou um editor de código: Você pode escolher entre várias opções populares, como:

  - [Eclipse](https://www.eclipse.org/downloads/): Uma IDE poderosa e amplamente utilizada para desenvolvimento Java.
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/): Uma IDE popular com uma gama de recursos avançados.
  - [Visual Studio Code](https://code.visualstudio.com/download): Um editor de código leve e altamente personalizável, com extensões para Java.

## Estrutura do Projeto

O projeto segue uma estrutura padrão Maven, com os diretórios principais:

- `src/main/java`: Código-fonte Java.
- `src/main/resources`: Recursos como arquivos de configuração.
- `src/test/java`: Testes unitários.

## Injeção de Dependência e Anotações

O projeto demonstra o uso de injeção de dependência e várias anotações Spring, incluindo:

- `@Autowired`: Para injeção de dependência.
- `@Controller`, `@Service`, `@Repository`: Para indicar componentes Spring.
- `@RequestMapping`: Para mapeamento de URLs.
- `@Value`: Para injetar valores de propriedades.
- `@Configuration`: Indica que a classe contém métodos de configuração do Spring.
- `@Bean`: Indica que um método cria e configura um objeto gerenciado pelo Spring.

