<h1>Cadastro API</h1>
<p>Api de cadasto de clientes e vendedores</p>

<h3>Status do Projeto</h3>
<p align="center"> Cadastro API 💻 Em construção... </p>

<h3>Features</h3>

- [x] Criar Cliente<br>
- [x] LIstar Clientes<br>
- [x] Deletar Clientes<br>
- [x] Criar Vendedor<br>
- [x] LIstar Vendedores<br>
- [x] Deletar Vendedores<br>

<h3>Demostração da Aplicação</h3>
<p>Antes de começar, você precisará ter instalado em sua máquina as seguintes ferramentas:</p>
<table>
<tr>
	<th>Ferramenta</th>
	<th>Versão</th>
</tr>
<tr>
	<td>Java JDK</td>
	<td>8+</td>
</tr>
<tr>
	<td>Git</td>
	<td>2.**</td>
</tr>
<tr>
	<td>Maven</td>
	<td>7.**</td>
</tr>
<tr>
	<td>Insomnia</td>
	<td>Versão mais recente</td>
</tr>
<tr>
	<td>Docker-Desktop</td>
	<td>versão mais recente lts</td>
</tr>
<tr>
	<td>Spring Boot</td>
	<td>2.7.5</td>
</tr>
</table>
<h4>** Visando facilitar a demostração da aplicação, recomendo instalar apenas o IntelliJ IDEA e rodar o projeto através da IDE **</h4>

No Terminal/Console:
<ol>
	<li>Faça um clone do projeto na sua máquina: <code>git clone https://github.com/THONWELLING/cadastro</code></li>
	<li>Entre na pasta raiz do projeto: <code>cd Cadastro</code></li> 
    <li>Inicie o Docker Desktop</li>
	<li>Na Raiz do projeto Rode o comando: <code>docker-compose up</code></li>
    <li>Localize a classe <code>src/main/java/com/example/cadastro/CadastroApplication.java</code></li>
    <li>Abra a classe no Intellij e execute clicando no botão RUN</li>
	<li>Com a aplicação "de pé", Abra o seu postman ou insomnia</li>
</ol>
                   <h3 align="center">Rotas de Client </h3>
<ol>
<li> A url base é<code>http://localhost:8080</code></li>
<li>Rota para criar clientes =><code>http://localhost:8080/clients</code>
utilizando o método <code>POST</code>
<code>Content-Type application/json</code></li>
<li>A rota para Listar os Clientes é => <code>http://localhost:8080/clients</code> utilizando o método <code>GET</code></li>
<li>A rota para Deletar os Clientes é => <code>http://localhost:8080/clients/id</code> utilizando o método <code>DELETE</code><br>
utilizando o <code>Form Url Encoded</code> e passando o parâmetro ==> <code>clientId</code> com o valor do ID que deseja deletar</li><br><br>
<h3 align="center">Rotas de Vendedores </h3><br>
<li>Rota para criar Vendedores é =><code>http://localhost:8080/sellers</code>
utilizando o método <code>POST</code>
<code>Content-Type application/json</code></li>
<li>A rota para Listar  Vendedores é => <code>http://localhost:8080/sellers</code> utilizando o método <code>GET</code></li>
<li>A rota para Deletar  Vendedores é => <code>http://localhost:8080/sellers/id</code> utilizando o método <code>DELETE</code><br>
utilizando o <code>Form Url Encoded</code> e passando o parâmetro ==> <code>sellerId</code> com o valor do ID que deseja deletar</li>
</ol>
<h3>Tecnologias Utilizadas</h3>

<table>
<tr>
	<th>Dependência</th>
	<th>Versão</th>
</tr>
<tr>
	<td>spring initialzr</td>
	<td><a href="https://start.spring.io/">https://start.spring.io/</a></td>
</tr>
<tr>
	<td>spring-boot-starter-web</td>
	<td>2.7.4</td>
</tr>
<tr>
	<td>spring-boot-starter-data-jpa</td>
	<td>2.7.4</td>
</tr>
<tr>
	<td>Hibernate</td>
	<td></td>
</tr>

</table>

<h3>Autor</h3>

<a href="https://www.linkedin.com/in/wellington-sousa-6494a6179/">
 <img style="border-radius: 50%;" src="https://media-exp1.licdn.com/dms/image/D4D35AQEhRkbJZScnLw/profile-framedphoto-shrink_200_200/0/1666859259122?e=1667466000&v=beta&t=vGqfXXnd9HtN2NFTAFFm3tcC_07j5sIGHqa2diRTfaE" width="100px;" alt=""/>
 <br />
 <sub><b>Thonwelling</b></sub></a> <a href="https://www.instagram.com/camimi_la/" title="Instagram"></a>

Feito com ❤️ por Thonwelling 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thonwelling-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/wellington-sousa-6494a6179/)](https://www.linkedin.com/in/wellington-sousa-6494a6179/)

<hr>
<h3>Contribuindo</h3>


Se possível:

⭐️  Star o projeto

🐛 Encontrar e relatar issues