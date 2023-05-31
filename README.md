# EAD_MICROSERVICO

<h1 align="left">EAD_MICROSERVICO</h1>

Este repositório contém o projeto "EAD_MICROSERVICO", que é um sistema de ensino a distância baseado em microserviços. O sistema é composto por três microserviços distintos: Authuser, Course, Notification e Service Registry. Cada microserviço é responsável por uma funcionalidade específica do sistema.

## Microserviços

### Authuser

    O microserviço Authuser é responsável pela autenticação e gerenciamento de usuários do sistema. Ele lida com a criação, autenticação e autorização de usuários.

### Course

    O microserviço Course é responsável pela gestão dos cursos oferecidos pelo sistema. Ele gerencia informações sobre os cursos, como nome, descrição, instrutores e conteúdo.

### Notification

    O microserviço Notification é responsável pelo envio de notificações aos usuários. Ele lida com o envio de mensagens, notificações push e e-mails para manter os usuários atualizados sobre eventos importantes do sistema.

### Service Registry

    O microserviço Service Registry é responsável pelo registro e descoberta de serviços dentro da arquitetura de microserviços. Ele permite que os microserviços se registrem e se comuniquem entre si de forma dinâmica.

| :placard: Vitrine.Dev |                                                                                                                                                                                                                                                                                                                                                                                                                 |
| --------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| :sparkles: Nome       | **EAD_MICROSERVICOS**                                                                                                                                                                                                                                                                                                                                                                                           |
| :label: Tecnologias   | java, springboot, spring-mvc, spring-data-jpa, API Rest com spring-web, jsonView (Multipas Visualizações), spring Validation, lombok, paginação, Filtros com Specification, dto, exceptionHandler, hateoas, comunicação sincrona, API composition Partern, Service Registry com Spring Cloud Neflix Eureka, base de dados compartilhadas por microserviços, Eureka Clients nos Microservices de Negócio, Log4J2 |
| :rocket: URL          | https://localhost                                                                                                                                                                                                                                                                                                                                                                                               |
| :fire: Desafio        | https://www.decoderproject.com/lista-espera                                                                                                                                                                                                                                                                                                                                                                     |

<!-- Inserir imagem com a #vitrinedev ao final do link -->

![](https://github.com/hvivox/EAD_MICROSERVICO/blob/main/DIAG_PROJETO_EAD.png?raw=true?text=srealizacao#vitrinedev)

<!-- ############################################################################## -->

# Detalhes do projeto

## Requisitos do Sistema

- Java 11 ou superior
- Spring Boot 2.5.0 ou superior
- Banco de dados MySQL

## Configuração do Ambiente de Desenvolvimento

1. Clone este repositório: `git clone https://github.com/hvivox/EAD_MICROSERVICO.git`
2. Navegue até o diretório de cada microserviço: `cd Authuser`, `cd Course`, `cd Notification`, `cd Service-Registry`.
3. Importe cada microserviço em sua IDE de desenvolvimento preferida.
4. Configure as dependências do Maven.
5. Configure as informações de conexão com o banco de dados MySQL em cada microserviço, no arquivo `application.properties`.

## Instalação e Execução

1. Certifique-se de ter configurado corretamente o ambiente de desenvolvimento.
2. Para cada microserviço, execute o comando `mvn clean install` para baixar as dependências e construir o projeto.
3. Em cada microserviço, execute o comando `java -jar target/{NOME_DO_JAR}.jar` para iniciar o microserviço.

## Uso

1. Cada microserviço possui sua própria funcionalidade e endpoints específicos.
2. Interaja com os microserviços através de suas APIs para gerenciar usuários, cursos e notificações.
