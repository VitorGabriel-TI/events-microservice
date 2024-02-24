# Event Microservice

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

Este projeto é um microsserviço para cadastro de eventos e participantes construída usando **Java, Spring, H2 como banco de dados.**

Sempre que um participante for cadastrado será acionado o microsserviço de envio de emails para enviar um email de confirmação de inscrição para o participante cadastrado.

## Conteúdo

- [Instalação](#instalação)
- [Uso](#uso)
- [API Endpoints](#api-endpoints)
- [Database](#database)

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/VitorGabriel-TI/events-microservice.git
```
2. Instale as dependências com o Maven

3. Clone o repositório [Email Service](https://github.com/VitorGabriel-TI/email-service) e siga seu processo de instalação.

```bash
git clone https://github.com/VitorGabriel-TI/email-service/.git
```

4. Ajuste o arquivo application.properties do email-service para rodar na porta `8090`

```yaml
server.port=8090
```

5. Rode os dois microsserviços

## Uso

1. Instale as dependências com o Maven e inicie a aplicação
2. A API será acessível na porta http://localhost:8080

## API Endpoints
A API fornece os seguintes endpoints:

**GET EVENTS**
```markdown
GET /events - Busca uma lista de todos os produtos.
```
```json
[
  {
    "id": "ae413540-515d-4add-8cd1-1702c7d280d7",
    "maxParticipants": 100,
    "registeredParticipants": 0,
    "date": "30/03/2024",
    "title": "Evento 1",
    "description": "Teste de exemplo 1"
  }
]
```

**GET UPCOMING EVENTS**
```markdown
GET /events/upcoming - Liste todos os próximos eventos (cuja data é maior que a data atual).
```

```json
[
  {
    "id": "ae413540-515d-4add-8cd1-1702c7d280d7",
    "maxParticipants": 100,
    "registeredParticipants": 0,
    "date": "30/03/2024",
    "title": "Evento 1",
    "description": "Teste de exemplo 1"
  }
]
```

**POST EVENT**
```markdown
POST /events - Registra um novo evento no sistema.
```
```json
{
	  "maxParticipants": 100,
    "registeredParticipants": 0,
    "date": "30/03/2024",
    "title": "Evento 1",
    "description": "Teste de exemplo 1"
}
```

**POST REGISTRATION**
```markdown
POST /events/${id} - Registre um usuário em um evento se o evento não estiver cheio.
```

```json
{
  "participantEmail": "exemplodeemail@gmail.com"
}
```

## Database
O projeto utiliza o [H2 Database](https://www.h2database.com/html/tutorial.html) como banco de dados.
