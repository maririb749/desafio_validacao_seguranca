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
