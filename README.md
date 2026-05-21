# JavaBank — Backend Bancário com Spring Boot


## Visão Geral

JavaBank é um projeto backend desenvolvido com Java e Spring Boot com foco em aprendizado de APIs REST e arquitetura backend.

Atualmente o projeto possui uma estrutura inicial funcional com criação e listagem de contas bancárias.

---

# Objetivo

Este projeto foi criado para praticar desenvolvimento backend com Spring Boot, APIs REST e organização em camadas.

---

# Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Gradle
* Banco H2
* Git/GitHub

---

# Estrutura do Projeto

```txt
src/main/java/com/pcdev/bank
│
├── controller
├── service
├── repository
├── model
└── BankApplication
```

---

# Funcionalidades Atuais

* Criar contas bancárias
* Listar contas
* API REST funcional
* Integração com banco H2

---

# Endpoints

## Criar Conta

```http
POST /accounts
```

### Body

```json
{
  "owner": "Paulo",
  "balance": 1000
}
```


## Listar Contas

```http
GET /accounts
```

---

# Como Executar

## Clonar o projeto

```bash
git clone https://github.com/PauloRegisss/javabank.git
```


## Entrar na pasta

```bash
cd javabank
```


## Rodar aplicação

Windows:

```bash
.\\gradlew bootRun
```


## Acessar API

```txt
http://localhost:8080/accounts
```

---

