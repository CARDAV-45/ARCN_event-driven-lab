# Event-Driven Lab — RabbitMQ con Spring Boot

Arquitectura event-driven con un productor y un consumidor Spring Boot comunicados a través de RabbitMQ, desplegados con Docker Compose.

## Servicios

| Servicio | Puerto | Descripción |
|---|---|---|
| producer-service | 8080 | API REST que publica mensajes |
| consumer-service | — | Listener que procesa mensajes |
| rabbitmq | 5672 / 15672 | Broker + Management UI |

## Ejecutar

```bash
git clone https://github.com/CARDAV-45/ARCN_event-driven-lab
cd ARCN_event-driven-lab
docker-compose up -d
```

Enviar un mensaje:
```bash
curl -X POST "http://localhost:8080/api/messages/send?message=Hola"
```

## Evidencia

### 1. Imágenes publicadas en Docker Hub
![Docker Hub](capturas/Captura%20de%20pantalla%202026-04-21%20195000.png)

### 2. Contenedores levantados con Docker Compose
![Docker Compose up](capturas/Captura%20de%20pantalla%202026-04-21%20193921.png)

### 3. Pull de imágenes y arranque en Killercoda
![Killercoda pull](capturas/Captura%20de%20pantalla%202026-04-21%20193945.png)

### 4. Mensaje enviado y procesado por el consumer
![Consumer logs](capturas/Captura%20de%20pantalla%202026-04-21%20194122.png)

### 5. Mensaje enviado vía curl
![Curl send](capturas/Captura%20de%20pantalla%202026-04-21%20195130.png)

### 6. RabbitMQ Management — cola activa con consumer conectado
![RabbitMQ queue](capturas/Captura%20de%20pantalla%202026-04-21%20194807.png)
