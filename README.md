# API de CRUD de Produtos usando Spring Boot 3

Esta é uma API simples desenvolvida em Spring Boot 3 para realizar operações CRUD (Create, Read, Update, Delete) em produtos. É uma ótima maneira de aprender sobre os conceitos básicos do Spring Boot 3 e como criar uma aplicação RESTful.

## Requisitos

- Java JDK 17 ou superior
- Maven 3.6.x ou superior
- Spring Boot 3

## Instalação

1. Clone este repositório em sua máquina local:

```bash
git clone https://github.com/RFS-Junior/SpringBoot3.git
```

2. Navegue até o diretório do projeto:

```bash
cd SpringBoot3
```

3. Compile o projeto usando Maven:

```bash
mvn clean package
```

4. Execute a aplicação:

```bash
java -jar target/[nome-do-arquivo].jar
```

## Uso

Após a instalação, você pode acessar a API através de endpoints REST para realizar as seguintes operações:

- **POST /api/products**: Cria um novo produto.
  - Payload: Deve ser um JSON contendo os dados do produto a ser criado.
  
- **GET /api/products**: Retorna todos os produtos.
  - Cada produto é retornado com um link para acessar detalhes individuais.

- **GET /api/products/{id}**: Retorna um produto específico pelo ID.
  - Além dos dados do produto, o resultado inclui um link para retornar à lista de produtos.

- **PUT /api/products/{id}**: Atualiza um produto existente pelo ID.
  - Payload: Deve ser um JSON contendo os dados atualizados do produto.

- **DELETE /api/products/{id}**: Exclui um produto pelo ID.

Certifique-se de usar um cliente REST (como Postman ou Insomnia) para interagir com a API.

## Estrutura do Projeto

- **ProductController**: Este controlador Spring gerencia todas as requisições relacionadas aos produtos, incluindo criar, ler, atualizar e excluir.

- **ProductModel**: Esta classe representa o modelo de dados de um produto.

- **ProductRecordDto**: Este é um DTO (Data Transfer Object) usado para receber dados ao criar ou atualizar um produto.

- **ProductRepository**: Interface para acesso aos dados do produto. 

## Referências

Michelli Brito: https://www.youtube.com/watch?v=wlYvA2b1BWI
