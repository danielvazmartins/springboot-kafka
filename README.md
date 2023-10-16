# Spring Boot - Kafka (producer/consumer)

Projeto criado para aplicar os conhecimentos adquiridos através do curso ministrador pelo `Rodrigo Tavares`, sobre a utilização do Kakfa em um projeto de microserviços em Java com Spring Boot

## Estrutura do Projeto
* **Kafka** - Utilize o Docker Compose para subir o servidor do Kafka
* **Producer** - Aplicação usando Java SpringBoot para enviar uma mensagem no tópico do Kafka
* **Consumer** - Aplicação usando Java SpringBoot para consumir as mensagens armazenadas no tópico do Kafka

## Executar o projeto
1. Inicializar o docker. Na raiz do projeto rodar o comando
```bash
docker-compose.exe up -d
```
2. Subir a aplicação do producer que está rodando na porta padrão 8080
3. Subir a aplicação do consumer que está na porta 8081
4. Enviar um post para o endpoint `/users` do producer, com o objeto do usuário. Na pasta `postman` está a collection que pode ser importada
5. Verificar nos logs do consumer a informação do usuário registrado

## Próximos passos - TO DO
Configurar um banco de dados e fazer a persistência dos dados
Criar um FrontEnd para enviar os dados para registrar e mostrar na tela os cadastros recebidos

## Referências
* Linkedin [Rodrigo Tavares](https://www.linkedin.com/in/rgtavares/)
* Curso [Arquitetura Orientada a Eventos com Java, Spring Boot e Kafka]()
* [GitHub da DIO](https://github.com/expertos-tech/dio-tutorial-kafka/tree/main/tutorial-microsservico-kafka)
