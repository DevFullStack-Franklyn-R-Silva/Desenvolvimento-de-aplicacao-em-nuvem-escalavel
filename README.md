# Desenvolvimento de aplicação em nuvem escalável

[![Continuous Integration with Github](https://github.com/hadesfranklyn/Desenvolvimento-de-aplicativo-em-nuvem-escal-vel/actions/workflows/docker-publish.yml/badge.svg)](https://github.com/hadesfranklyn/Desenvolvimento-de-aplicativo-em-nuvem-escal-vel/actions/workflows/docker-publish.yml)

## Visão Geral
Imagine que temos um cliente que quer informações sobre um livro, como o título, o autor, a data de lançamento e o preço. Mas, o preço está em dólar e precisamos vender em diferentes mercados. Para isso, precisamos fazer um cálculo para converter o preço em moeda local e considerar impostos e outras coisas que podem afetar o preço final.

O projeto é composto por dois serviços: Book Service e Câmbio Service.

O Book Service é responsável por fornecer informações detalhadas sobre um livro, como o título, o autor, a data de lançamento e o preço. O Câmbio Service é responsável por fornecer informações sobre as taxas de câmbio e converter o preço do livro para a moeda local do cliente, levando em consideração impostos e outras taxas aplicáveis.

O projeto usa Spring Boot para gerenciar os microsserviços e Spring Cloud para gerenciar a comunicação entre os serviços. O Eureka é utilizado como servidor de descoberta de serviços.

## Arquitetura
O projeto segue uma arquitetura de microsserviços, em que cada serviço é independente e se comunica com outros serviços por meio de APIs RESTful. Cada serviço tem sua própria base de dados para armazenar e gerenciar seus dados.

# Stack do projeto

Stack necessária desse projeto para desenvolvimento de microsserviços com Spring Boot, Spring Cloud e Docker:

- Java (conhecimento básico)
- Spring Boot (conhecimento básico)
- Spring Cloud (conhecimento básico)
- Feign
- Netflix Eureka (Service Discovery e Service Registry)
- Spring Cloud LoadBalancer (Load Balancing)
- Spring Cloud Gateway (API Gateway e RouteLocator)
- Resilience4j (Circuit Breaker)
- Spring Cloud Config Server (configuração centralizada)
- SQL e banco de dados relacional (conhecimento básico)
- Linux (conhecimento básico)
- Docker (conhecimento básico)
- Github (conta necessária)

Além disso, é abordados conceitos de Distributed Tracing com Docker, Zipkin, Eureka e Sleuth e a configuração do Swagger OpenAPI nos microsserviços. É recomendado estar familiarizado e confortável com a linha de comando e ter noções básicas de API's RESTful.

O projeto foi desenvolvido na versão 2.7.10 das dependências.


# Como executar o projeto:

- Java 16+ [Clique aqui](https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html)
- Maven 3.9.0+ [Clique aqui](https://maven.apache.org/download.cgi) 
- Colocar as variáveis de ambiente do JAVA e MAVEN [Clique aqui](https://www.jdevtreinamento.com.br/variaveis-de-ambiente-configuracao/#:~:text=No%20menu%20%C3%A0%20esquerda%20clique,em%20%5BVARI%C3%81VEIS%20DE%20AMBIENTE%5D.)
- MySQL server Community [Clique aqui](https://dev.mysql.com/downloads/mysql/)
- MySQL Workbench [Clique aqui](https://dev.mysql.com/downloads/workbench/) ou HeidiSQL [Clique aqui](https://www.heidisql.com/download.php)
- Spring Tools 4 [Clique aqui](https://spring.io/blog/2021/06/21/spring-tools-4-11-0-released)
- Docker [Clique aqui](https://www.docker.com/)

# Endpoints
Os endpoints abaixo estão disponíveis nos serviços do projeto:

### Acessar os endpoints via Gateway
 - Book service - http://localhost:8765/book-service/14/BRL;
 - Cambio service - http://localhost:8765/cambio-service/8/USD/CLP;
### Caminhos(padrão) para acessar a documentação em JSON (Swagger) das aplicações sem GATEWAY:
 - Book service - http://localhost:8100/v3/api-docs;
 - Cambio service - http://localhost:8000/v3/api-docs
### Caminhos para acessar a documentação GRÁFICA (Swagger) das aplicações:
 - Book service - http://localhost:8100/swagger-ui.html
 - Cambio service - http://localhost:8000/swagger-ui.html
### Caminho para acessar a documentação dos serviços via GATEWAY
 - http://localhost:8765/swagger-ui.html
### Caminho padrão de acesso ao Zipkin
 - http://localhost:9411/zipkin
### Caminho padrão de acesso ao Eureka
http://localhost:8761
### Configuração para buildar uma imagem da aplicação direto do Intellij
 - Utilizar o plugin registry ao invés do local repository em Modify options, e executar como Maven Project; ou
 - Executar o comando mvn spring-boot:build-image -DskipTests, na pasta do projeto (projeto api-gateway por exemplo)
 
# Alguns comandos 

Para este projeto de microsserviço é necessário JRE, Maven, Java IDE, MySQL, Docker.

docker run -p 9411:9411 -d openzipkin/zipkin:2.23.2

```java
<build>
	<plugins>
		<plugin>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-maven-plugin</artifactId>
			<configuration>
				<image>
					<name>hadesfranklyn/${project.artifactId}:${project.version}</name>
				</image>
				<pullPolicy>IF_NOT_PRESENT</pullPolicy>
			</configuration>
		</plugin>
	</plugins>
</build>
```
RunAs -> Maven build Goals: spring-boot:build-image -DskipTests

docker run -p 8761:8761 -d jacksoncalixto/naming-server:0.0.1-SNAPSHOT

docker-compose up -d docker-compose down

ERROR BY HAVING DOCKER CLIENT STOPPED: .docker.errors.DockerException: Error while fetching server API version: (2, 'CreateFile', 'The system cannot find the file specified.') .[1052] Failed to execute script docker-compose

cd .\10-api-gateway
mvn spring-boot:build-image -DskipTests cd ..

SPRING.ZIPKIN.BASEURL: http://zipkin-server:9411 EUREKA.CLIENT.SERVICEURL.DEFAULTZONE: http://localhost:8761/eureka

docker-compose down --remove-orphans

RabbitMQ

Repository Settings Add Secret DOCKER_USERNAME/DOCKER_PASSWORD Continuous Integration with Github Github action: Publish Docker Container Catching Variables Github Actions ${{secrets.DOCKER_USERNAME}}
