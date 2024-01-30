##Maven: Build e Dependencias

####Linha de comando para gerar um projeto Maven via CMD
#####Com o Maven é possível gerar um projeto a partir de uma linha de comando no CMD, para isso podemos utilizar o comando abaixo:
    mvn archetype:generate -DgroupId=mavenStart -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false

####Principais comandos do Maven via CMD
	mvn compile -> Compila o projeto 
	mvn test -> Executa os testes do projeto
	mvn package -> Empacota o projeto
	mvn clean -> Exclui a pasta target onde foram gerados os comandos acima