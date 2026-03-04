# 📦 API de Gerenciamento de Estoque

Esta é uma API REST desenvolvida em Java com Spring Boot para o gerenciamento de produtos em um estoque. O projeto demonstra a evolução de um sistema simples para uma arquitetura moderna e escalável.

## 🚀 Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot 3.5.11**: Framework base para a construção da API.
* **Spring Data JPA**: Para abstração da camada de dados e persistência.
* **MySQL**: Banco de dados relacional para armazenamento das informações.
* **Lombok**: Para redução de código boilerplate (Getters/Setters).
* **Maven**: Gerenciador de dependências e automação de build.

## 🛠️ Funcionalidades

- [x] **Cadastro de Produtos**: Envio de dados via POST para salvar no MySQL.
- [x] **Listagem de Estoque**: Recuperação de todos os itens cadastrados via interface REST.
- [x] **Persistência Automática**: Utilização do Hibernate para criação e atualização das tabelas no banco de dados.

## 📂 Estrutura do Projeto

O projeto segue o padrão de camadas para melhor organização e manutenção:
* `model`: Representação da entidade Produto no banco de dados.
* `repository`: Interface de comunicação com o banco via JPA.
* `controller`: Exposição dos endpoints da API para acesso Web.

## 🏁 Como Executar

1. Clone o repositório.
2. Configure suas credenciais do MySQL no arquivo `src/main/resources/application.properties`.
3. Execute a classe `DemoApplication.java`.
4. Acesse `http://localhost:8080/produtos` no seu navegador ou ferramenta de testes (Postman/cURL).