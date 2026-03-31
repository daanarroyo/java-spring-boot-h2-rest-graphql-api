# Spring Boot CRUD + MySQL + H2 + GraphQL

Proyecto base en **Spring Boot** con:

- REST CRUD para `products`
- búsqueda por **GraphQL**
- **DTOs**
- **JPA + Hibernate**
- perfil **local** con **H2**
- perfil **docker** con **MySQL**
- `docker-compose` para levantar todo

## Estructura

```text
src/main/java/com/example/catalog
├── config
├── controller
├── dto
├── entity
├── exception
├── graphql
├── mapper
├── repository
└── service
```

## Tabla usada

La tabla es `products` con estos campos:

- `id`
- `name`
- `description`
- `price`
- `stock`
- `createdAt`
- `updatedAt`

## Ejecutar en local con H2

```bash
mvn spring-boot:run
```

La app arranca con el perfil `local` por defecto.

### URLs útiles

- REST base: `http://localhost:8080/api/products`
- GraphQL endpoint: `http://localhost:8080/graphql`
- GraphiQL: `http://localhost:8080/graphiql`
- H2 Console: `http://localhost:8080/h2-console`

### Datos H2

- JDBC URL: `jdbc:h2:mem:catalogdb`
- User: `sa`
- Password: vacío

## Ejecutar con Docker + MySQL

```bash
docker compose up --build
```

Esto levanta:

- MySQL en `localhost:3307`
- aplicación Spring Boot en `localhost:8080`

## Endpoints REST

### Crear producto

```bash
curl -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Monitor 27",
    "description": "4K monitor for development",
    "price": 299.99,
    "stock": 12
  }'
```

### Listar productos

```bash
curl http://localhost:8080/api/products
```

### Obtener por id

```bash
curl http://localhost:8080/api/products/1
```

### Actualizar

```bash
curl -X PUT http://localhost:8080/api/products/1 \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Monitor 27 Updated",
    "description": "4K monitor with USB-C",
    "price": 319.99,
    "stock": 10
  }'
```

### Eliminar

```bash
curl -X DELETE http://localhost:8080/api/products/1
```

## Query GraphQL de búsqueda

```graphql
query {
  searchProducts(keyword: "mouse") {
    id
    name
    description
    price
    stock
  }
}
```

### Ejemplo con curl

```bash
curl -X POST http://localhost:8080/graphql \
  -H "Content-Type: application/json" \
  -d '{
    "query": "query { searchProducts(keyword: \"mouse\") { id name description price stock } }"
  }'
```

## Notas

- El código está en inglés.
- Los comentarios explicativos están en español.
- Se incluyeron datos de ejemplo para probar rápido.
