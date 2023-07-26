<h1 align="center">Desafio validação e segurança</h1>

### Diagrama de classes:

#### Este é um sistema de eventos e cidades com uma relação N-1 entre eles:

###

![dvs](https://github.com/maririb749/desafio_validacao_seguranca/assets/85500087/f2bccc4b-6872-4e17-ab65-5193a578db85)


###

### O desafio consiste em implementar as funcionalidades necessárias para que os testes do projeto passem.

###


###



###

### Regras de controle de acesso: 
<ul>
  <ul>
  <li>Somente rotas de leitura (GET) de eventos e cidades são públicas (não requer login).</li>
  <li>Usuários CLIENT e/ou ADMIN podem inserir novos eventos (POST).</li>
  <li>Os demais acessos são permitidos apenas a usuários ADMIN.</li>
 </ul>
</ul>

###

### Regras de validação de City:

<ul>
  <ul>
    <li>Nome não pode ser vazio.</li>
   </ul>
</ul>

###

### Regras de validação de Event:

<ul>
  <ul>
    <li>Nome não pode ser vazio.</li>
    <li>Data não pode ser passada.</li>
     <li>Cidade não pode ser nula.</li>
   </ul>
</ul>

###

###  Critérios de correção:

###

<ul>
  <ul>
    <li>POST /events deve retornar 401 Unauthorized para usuário não logado</li>
    <li>POST /events deve retornar 201 Created para CLIENT logado e dados corretos</li>
    <li>POST /events deve retornar 201 Created para ADMIN logado e dados corretos</li>
     <li>POST /events deve retornar 422 Unproccessable Entity para ADMIN logado e nome em branco</li>
      <li>POST /events deve retornar 422 Unproccessable Entity para ADMIN logado e data no passado</li>
       <li>POST /events deve retornar 422 Unproccessable Entity para ADMIN logado e cidade nula</li>
       <li>GET /events deve retornar 200 Ok com página de recursos</li>
       <li>POST /cities deve retornar 401 Unauthorized para usuário não logado</li>
       <li>POST /cities deve retornar 403 Forbidden para CLIENT logado</li>
        <li>POST /cities deve retornar 201 Created para ADMIN logado e dados corretos</li>
          <li>POST /cities deve retornar 422 Unprocessable Entity para ADMIN logado e nome em branco</li>
           <li>GET /cities deve retornar 200 Ok com todos recursos ordenados por nome</li>

   </ul>
</ul>

###

### O que aprendi com esta atividade:

<ul>
  <ul>
    <li>Desenvolvimento TDD de API Rest com Java e Spring Boot.</li>
    <li>Implementação de segurança com Spring Security e OAuth2.</li>
     <li>Controle de acesso por rotas e perfis de usuário.</li>
    <li>Validação de dados com Bean Validation.</li>
   </ul>
</ul>




