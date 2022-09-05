Este servidor foi desenvolvido para rodar junto ao Apache Tomcat v.10;
Baixe o apache e adicione o arquivo server_LP.war no caminho: ..\apache-tomcat-10.0.23\webapps;

Após isso no terminal vá para o path cd ..\apache-tomcat-10.0.23\bin e rode o comando
startup.bash (windows) ou startup.sh (linux) para abrir o servidor;

Agora basta abrir o browser e digitar o caminho: http://localhost:8080/server_LP

Após conferir o servidor você deve desligá-lo para que não continue rodando em segundo
plano na sua máquina. Para isso, execute no terminal shutdown.bash (windows) ou
shutdown.sh (linux).

NOTA: Talvez a tabela não apareça no navegador por haver alguma configuração dele que
bloqueie a exibição das saídas Java. Consulte o console apertando F12 para conferir se
há alguma mensagem referente a bloqueio de recursos da aplicação.
Você também pode conferir o código da aplicação e apontar erros no console no caminho
Source, analisando as classes Aluno.java e index.jsp