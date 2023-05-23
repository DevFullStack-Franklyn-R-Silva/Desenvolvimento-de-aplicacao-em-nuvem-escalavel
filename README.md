# Desenvolvimento de aplicação em nuvem escalável

[![Continuous Integration with Github](https://github.com/hadesfranklyn/Desenvolvimento-de-aplicativo-em-nuvem-escal-vel/actions/workflows/docker-publish.yml/badge.svg)](https://github.com/hadesfranklyn/Desenvolvimento-de-aplicativo-em-nuvem-escal-vel/actions/workflows/docker-publish.yml)

## Visão Geral
Projeto envolve o desenvolvimento de uma aplicação/sistema para uma livraria online que possui alcance mundial. Alto desempenho e capacidade de escalabilidade são demandas cruciais para lidar com um cenário de escala mundial. Para atender a essas necessidades, a modelo arquitetural de microsserviços é adotada.

Imagine que temos um cliente que quer informações sobre um livro, como o título, o autor, a data de lançamento e o preço. Mas, o preço está em dólar e precisamos vender em diferentes mercados. Para isso, precisamos fazer um cálculo para converter o preço em moeda local e considerar impostos e outras coisas que podem afetar o preço final.

O projeto é composto por dois serviços: Book Service e Câmbio Service.

<img align="center" alt="Frank-gif" height="600" width="800" src="/imgs/image1.jpeg">

O Book Service é responsável por fornecer informações detalhadas sobre um livro, como o título, o autor, a data de lançamento e o preço. 

<img align="center" alt="Frank-gif" height="600" width="800" src="/imgs/image4.jpeg">
<img align="center" alt="Frank-gif" height="600" width="800" src="/imgs/image3.jpeg">
O Câmbio Service é responsável por fornecer informações sobre as taxas de câmbio e converter o preço do livro para a moeda local do cliente, levando em consideração impostos e outras taxas aplicáveis.

<img align="center" alt="Frank-gif" height="600" width="800" src="/imgs/image2.jpeg">

O projeto usa Spring Boot para gerenciar os microsserviços e Spring Cloud para gerenciar a comunicação entre os serviços. O Eureka é utilizado como servidor de descoberta de serviços.

# Estrutura do projeto
<img align="center" alt="Frank-gif" height="600" width="800" src="/imgs/image6.jpeg">

Spring Cloud: É um conjunto de bibliotecas que ajudam a criar sistemas distribuídos baseados em microsserviços. Ele fornece soluções para problemas comuns, como balanceamento de carga, descoberta de serviços, configuração, monitoramento e muito mais. Informações sobre o Spring Cloud podem ser encontradas: [Clicando aqui](https://spring.io/projects/spring-cloud)

Spring Cloud LoadBalancer: É uma biblioteca que fornece uma abstração para balanceamento de carga em sistemas distribuídos. Ele pode ser usado para implementar balanceadores de carga em nível de serviço ou em nível de aplicação. Informações sobre o Spring Cloud LoadBalancer podem ser encontradas: [Clicando aqui](https://spring.io/projects/spring-cloud-loadbalancer)

Spring Cloud Gateway: É uma biblioteca que fornece uma solução para a criação de gateways de API. Ele permite que os desenvolvedores criem proxies de API personalizados para seus serviços, onde podem gerenciar o tráfego e aplicar políticas de segurança e autorização. Informações sobre o Spring Cloud Gateway podem ser encontradas: [Clicando aqui](https://spring.io/projects/spring-cloud-gateway)

Netflix Eureka: É uma biblioteca de registro e descoberta de serviços. Ele permite que os microsserviços se registrem em um registro centralizado, onde podem ser descobertos e consumidos por outros serviços. Informações sobre o Netflix Eureka podem ser encontradas: [Clicando aqui](https://github.com/Netflix/eureka)

Resilience4j: É uma biblioteca que fornece recursos para tornar aplicativos resilientes e tolerantes a falhas, por meio da implementação de padrões de design, como Circuit Breaker, Retry, Rate Limiter, Bulkhead e TimeLimiter. Informações sobre o Resilience4j podem ser encontradas : [Clicando aqui](https://resilience4j.readme.io/)

Feign: É uma biblioteca que permite aos desenvolvedores criar clientes HTTP declarativamente em Java. É uma solução eficaz para chamar serviços RESTful e pode ser usado em conjunto com outras bibliotecas do ecossistema Spring. Informações sobre o Feign podem ser encontradas: [Clicando aqui](https://github.com/OpenFeign/feign)

Spring Boot Actuator: É uma biblioteca que fornece recursos para monitorar e gerenciar a aplicação em tempo de execução. Ele expõe endpoints HTTP que fornecem informações sobre a aplicação, como saúde, métricas, estado do thread e muito mais. Os desenvolvedores podem usar esses endpoints para monitorar e gerenciar a aplicação em tempo real. O Spring Boot Actuator é muito útil em ambientes de produção, pois fornece informações valiosas sobre o estado da aplicação e ajuda os desenvolvedores a diagnosticar problemas em tempo hábil. Informações sobre o Spring Boot Actuator podem ser encontradas: [Clicando aqui](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)

Spring Rabbit: É uma biblioteca que fornece uma abstração para o uso do protocolo AMQP (Advanced Message Queuing Protocol) em aplicativos Spring. Ele permite que os desenvolvedores enviem e recebam mensagens de forma assíncrona entre os serviços. Informações sobre o Spring Rabbit podem ser encontradas: [Clicando aqui](https://spring.io/projects/spring-amqp)

Spring Cloud Starter Sleuth: É uma biblioteca que fornece recursos de rastreamento distribuído para microsserviços. Ele gera um ID de rastreamento exclusivo para cada solicitação de serviço e permite que os desenvolvedores vejam todo o caminho de execução da solicitação em todos os serviços envolvidos. Informações sobre o Spring Cloud Starter Sleuth podem ser encontradas: [Clicando aqui](https://spring.io/projects/spring-cloud-sleuth)

OpenAPI UI: É uma biblioteca que gera documentação interativa para APIs RESTful, usando a especificação OpenAPI (anteriormente conhecida como Swagger, que é uma biblioteca que fornece uma estrutura para criar documentação e clientes para APIs RESTful. Ele permite que os desenvolvedores criem documentação clara e legível para suas APIs e gere clientes para várias plataformas). Basicamente ele ajuda os desenvolvedores a criar documentação clara e legível para suas APIs. Informações sobre o OpenAPI UI podem ser encontradas: [Clicando aqui](https://swagger.io/tools/swagger-ui/)

MySQL Connector/J: É uma biblioteca que fornece um driver JDBC para o banco de dados MySQL. Ele permite que os desenvolvedores se conectem ao banco de dados MySQL e executem consultas e operações. Informações sobre o MySQL Connector/J podem ser encontradas: [Clicando aqui](https://dev.mysql.com/downloads/connector/j/)

Flyway: É uma biblioteca de migração de banco de dados que permite que os desenvolvedores gerenciem a evolução do esquema do banco de dados de forma programática. Ele automatiza o processo de aplicação de alterações de esquema em um banco de dados e fornece um controle de versão dos scripts de migração. Com o Flyway, os desenvolvedores podem aplicar e reverter facilmente alterações de esquema em um banco de dados sem se preocupar com a sincronização manual de vários bancos de dados. Ele também é compatível com vários bancos de dados, o que o torna uma ferramenta muito útil para equipes que trabalham com vários bancos de dados diferentes. Informações sobre o Flyway podem ser encontradas: [Clicando aqui](https://flywaydb.org/)

Zipkin: É uma biblioteca que fornece recursos de rastreamento distribuído usando o Zipkin, um sistema de rastreamento distribuído de código aberto. Ele permite que os desenvolvedores vejam o caminho de execução de uma solicitação em todos os serviços envolvidos em uma interface visual. Com a utilização da biblioteca Zipkin, torna-se mais fácil detectar gargalos em sistemas distribuídos, pois é possível identificar quais serviços estão consumindo mais recursos ou causando lentidão na transação. Além disso, a biblioteca permite a identificação de erros em um ambiente distribuído, tornando mais fácil a depuração e resolução de problemas. Informações sobre o Zipkin podem ser encontradas: [Clicando aqui](https://zipkin.io/)

<img align="center" alt="Frank-gif" height="600" width="800" src="/imgs/image9.jpeg">

<img align="center" alt="Frank-gif" height="600" width="800" src="/imgs/image8.jpeg">

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

<img align="center" alt="Frank-gif" height="600" width="1000" src="/imgs/image5.jpeg">

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

docker run -p 8761:8761 -d hadesfranklyn/naming-server:0.0.1-SNAPSHOT

docker-compose up -d docker-compose down

ERROR BY HAVING DOCKER CLIENT STOPPED: .docker.errors.DockerException: Error while fetching server API version: (2, 'CreateFile', 'The system cannot find the file specified.') .[1052] Failed to execute script docker-compose

cd .\10-api-gateway
mvn spring-boot:build-image -DskipTests cd ..

SPRING.ZIPKIN.BASEURL: http://zipkin-server:9411 EUREKA.CLIENT.SERVICEURL.DEFAULTZONE: http://localhost:8761/eureka

docker-compose down --remove-orphans

RabbitMQ

Repository Settings Add Secret DOCKER_USERNAME/DOCKER_PASSWORD Continuous Integration with Github Github action: Publish Docker Container Catching Variables Github Actions ${{secrets.DOCKER_USERNAME}}
