# README - Sistema de Gerenciamento de Agendamentos

## Visão Geral

Este projeto é um sistema desktop desenvolvido em Java para gerenciar agendamentos, clientes e atendentes de uma loja ou serviço. Utiliza interface gráfica Netbeens e segue princípios de Programação Orientada a Objetos (POO), com separação clara entre as entidades e suas operações.

## Funcionalidade Principal

- Cadastro, edição e consulta de **Clientes**.
- Cadastro, edição e consulta de **Atendentes**.
- Cadastro, edição e consulta de **Agendamentos**.
- Relatórios gerais, de clientes e de atendentes.
- Controle de gastos dos clientes e comissões dos atendentes.
- Interface gráfica intuitiva com menus para navegação entre funcionalidades.

## Estrutura de Dados Utilizadas

- **List\<Cliente\>**: Armazena todos os clientes cadastrados.
- **List\<Atendente\>**: Armazena todos os atendentes cadastrados.
- **List\<Agendamento\>**: Armazena todos os agendamentos realizados.
- Classes principais: [`Cliente`](src/main/java/Cliente.java), [`Atendente`](src/main/java/Atendente.java), [`Agendamento`](src/main/java/Agendamento.java), [`Servico`](src/main/java/Servico.java).
- Gerenciadores: [`GerCli`](src/main/java/GerCli.java), [`GerAtend`](src/main/java/GerAtend.java), [`GerAgend`](src/main/java/GerAgend.java).
- Interface de cálculo financeiro: [`Financeiro`](src/main/java/Financeiro.java).

## Como Compilar

1. Certifique-se de ter o **Java JDK** instalado.
2. Navegue até a pasta do projeto (`PrimProj`).
3. Compile usando Netbeens (recomendado) ou Maven :

## Autor

- **Nome:** Lucas Bruck
  
  [Linkedin](https://www.linkedin.com/in/lucas-bruck-1b0707261/)
