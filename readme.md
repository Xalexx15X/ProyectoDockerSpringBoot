# Proyecto de Front-Back dockercompose

Este proyecto esta compuesto por 3 contenedores, uno de PHP otro de spring boot y otro de MySQL para la base de datos. Este proyecto se trata de que podamos comunicarnos con un archivo php que lo que hace es de comunicador entre el back (springboot) y el front (php) y que nos permita ver lo que queramos a traves de consultas
## Estructura del Proyecto

### 1. Crear el proyecto

```sh
mkdir contenedor-principal
cd contenedor-principal
```

### 2. Crear los contenedores

```sh
docker-compose up --build
```

### 3. Acceder a la aplicación productos

```sh
http://localhost:9000
```

### 4. Acceder a la aplicación php

```sh
http://localhost:9000/api/customers/{id}.

```
aqui verias el id del cliente en el formato json 
para ver el php tendremos que poner el la ruta donde se encuentra el proyecto en la url
### 5. Detener el proyecto

```sh
docker-compose down
``` 
