FROM php:8.0-apache

# Instalar la extensión mysqli
RUN docker-php-ext-install mysqli

# Copiar el contenido del directorio actual al directorio raíz de Apache
COPY src/ /var/www/html/