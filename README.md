# Automação

Este projeto de automação de testes visa cobrir a regressão de testes para garantir a confiança no sistema após incluir novas funcionalidades

## detalhes
o projeto eh estruturado como page object adivanced na divisao de pacotes
utiliza Selenium com java versao 8.</br>
cenarios de testes escritos em gerkin.</br>
o pacote uiMap existe apenas para descrição da existencia do page object advanced, nao sendo utilizado neste exemplo e estando sem classes. 

## pre requisitos
os cenarios escritos estao no diretorio Features
para execução é necessario baixar o driver na versao do navegador que voce possui instalado em sua maquina local, no diretorio driver/

## executando
executar os arquivos do pacote runner

caso seja necessario evitar algum cenario basta adicionar '@skip' no inicio do cenario no arquivo feature.

## *importante*

validar versao de driver e extensao do mesmo, caso seja necessario atualizar o arquivo "BaseTest" presente no pacote core. 
