
# 📦 pedidos-api

**API RESTful para gerenciamento de pedidos**, desenvolvida com Spring Boot 3.5. A aplicação permite **cadastrar, consultar (com paginação e por ID), editar e excluir pedidos**.

---

## 🚀 Tecnologias utilizadas

- [Spring Boot 3.5](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [ModelMapper](http://modelmapper.org/)
- [Bean Validation (Jakarta Validation)](https://jakarta.ee/specifications/bean-validation/)
- [Swagger/OpenAPI (Springdoc)](https://springdoc.org/)
- [Docker](https://www.docker.com/)

---

## 🧱 Estrutura do Projeto

O projeto está organizado seguindo boas práticas, utilizando separação por responsabilidades:

```
src/
├── main/
│   ├── java/
│   │   └── br.com.seuprojeto.pedidosapi/
│   │       ├── controllers/        # Controladores (camada de entrada da API)
│   │       ├── dtos/               # Data Transfer Objects
│   │       ├── entities/           # Entidades JPA
│   │       ├── repositories/       # Interfaces JPA para acesso a dados
│   │       ├── services/           # Lógica de negócio
│   │       ├── handlers/           # Tratamento global de exceções
│   │       └── configurations/     # Configurações gerais (Swagger, ModelMapper, etc.)
│   └── resources/
│       └── application.properties
```

---

## 🔧 Como executar o projeto localmente

### Pré-requisitos

- Java 17 ou superior
- Maven 3.8+
- Docker (opcional, mas recomendado)

### Executando com Maven

```bash
./mvnw spring-boot:run
```

### Executando com Docker

```bash
docker build -t pedidos-api .
docker run -p 8080:8080 pedidos-api
```

---

## 📚 Documentação da API

Após iniciar o projeto, acesse:

```
http://localhost:8080/swagger-ui.html
```

Ou (com Springdoc):

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🧪 Funcionalidades

- ✅ Criar novo pedido
- ✅ Listar pedidos com paginação
- ✅ Buscar pedido por ID
- ✅ Atualizar pedido existente
- ✅ Remover pedido

---

## 📂 Exemplos de endpoints

```http
POST /api/pedidos
GET  /api/pedidos?page=0&size=10
GET  /api/pedidos/{id}
PUT  /api/pedidos/{id}
DELETE /api/pedidos/{id}
```

---

## ✅ Validações

As entradas da API são validadas com **Bean Validation**, garantindo que os dados estejam corretos antes de serem processados.

---

## 🧰 Configurações adicionais

- **ModelMapper**: Conversão automática entre entidades e DTOs.
- **Handler Global**: Tratamento consistente de erros com mensagens customizadas e status HTTP apropriados.
- **Swagger**: Documentação interativa com testes de requisições.

---

## 📦 Docker

### Build da imagem

```bash
docker build -t pedidos-api .
```

### Executar o container

```bash
docker run -p 8080:8080 pedidos-api
```

---

## 👨‍💻 Autor

Desenvolvido por **[Seu Nome Aqui]**

---

## 📝 Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
