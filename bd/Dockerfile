# Usar la imagen base de MySQL
FROM mysql:8.0

# Establecer variables de entorno
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=springboot

# Copiar scripts de inicialización
COPY ./init.sql /docker-entrypoint-initdb.d/