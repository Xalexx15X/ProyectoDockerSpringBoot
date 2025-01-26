CREATE DATABASE IF NOT EXISTS springboot;
USE springboot;

CREATE TABLE IF NOT EXISTS customer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

INSERT INTO customer (nombre) VALUES ('John Doe');
INSERT INTO customer (nombre) VALUES ('pepe');
INSERT INTO customer (nombre) VALUES ('antonia Smith');
INSERT INTO customer (nombre) VALUES ('Alberto Martinez');
INSERT INTO customer (nombre) VALUES ('Juan Perez');
INSERT INTO customer (nombre) VALUES ('Maria Garcia');
INSERT INTO customer (nombre) VALUES ('Carlos Hernandez');
INSERT INTO customer (nombre) VALUES ('David Rodriguez');
INSERT INTO customer (nombre) VALUES ('Rafael Rodriguez');