# Integrando Azure Spring Cloud com Azure Security Center

## Autenticação com Spring Boot e Auth0

### JWT - JSON Web Token
<p>Para manter a segurança de APIs, uma das formas mais comuns de autenticação com Spring Boot é o JWT, gerando chave (toke), que ao ser gerado é utilizado nos demais APIs por tempo determinado.</p><br/>

<img src="img/jwtex.png" height="530" width="750">

<p><p><br/>
### Auth0
<p>Implementa regras para geração do JWT de maneira simples.</p>

<p>Este componente possui a implementação de diversos algoritmos para simplificar a geração e leitura do token.</p><br/>

<img src="img/springboot.png" height="530" width="850">

### Lombok
<p>Apos gerar o arquivo Spring Boot, foi-se estruturado o projeto inicial no IntelliJ importando o arquivo Spring Boot Baixado como um modulo existente.</p>
<p>Partiu-se entao para produçao do codigo para autenticar usuario e codigo para processar as requisicoes.</p><br/>
<p>Pacotes criados: data, service, security*</p>

 
### Criando Modelo view-controller
<p>Neste ponto foi criado testes de autenticacao do usuario e desenvolvi codigo de login. Ao final deste processo, foi utilizado o Postman para realizar testes.</p>
<p>Pacotes criados: controller, security.</p>

## Spring Boot Azure 
<p>Criar conta - 30 dias grátias com 930 reais</p>
<p>Ir para o portal da Azure -> Azure Active Directory</p>
<p>Create tenant - nome do projeto, description OBS: Guardar as chaves</p>
<p>Criar Secret key e Permissoes da API(nesse caso Directory -> Directory.AccessasUser.All)</p>
<p>Criar conta - 30 dias grátias com 930 reais</p>



criar directory - criar aplicacao - criar permissoes - criar segredos - criar usuarios - criar grupos - adicionar usuarios no grupo -





























References

https://dzone.com/articles/securing-spring-boot-microservices-with-json-web-t