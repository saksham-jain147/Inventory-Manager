# Inventory-Manager

## Description

This project is a Spring Boot-based REST API for managing an inventory of products. It provides endpoints to retrieve, add, update, and delete products from the inventory. The data is stored in a MySQL database.

## Usage
To interact with the API, you can use tools like **Postman** or **curl**. The following sections detail the available API endpoints.

### API Endpoints :

### 1. Get Products

- **Endpoint:** `/products`
- **Method:** GET
- **Description:** Get a list of all products.
- **Example:** `GET http://localhost:9090/products`

### 2. Get Product by ID

- **Endpoint:** `/products/{product_id}`
- **Method:** GET
- **Description:** Get a product by its ID.
- **Example:** `GET http://localhost:9090/products/1`

### 3. Add Product

- **Endpoint:** `/products`
- **Method:** POST
- **Description:** Add a new product.
- **Example:** `POST http://localhost:9090/products`


### 4. Update Product

- **Endpoint:** `/products`
- **Method:** PUT
- **Description:** Update an existing product.
- **Example:** `POST http://localhost:9090/products`

### 5. Delete Product

- **Endpoint:** `/products/{product_id}`
- **Method:** DELETE
- **Description:** Delete a product by its ID.
- **Example:** `DELETE http://localhost:9090/products/1`


