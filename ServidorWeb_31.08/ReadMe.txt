Este servidor foi desenvolvido para rodar junto ao Apache Tomcat v.10;
Baixe o apache e adicione o arquivo server_LP.war no caminho: ..\apache-tomcat-10.0.23\webapps;

Ap�s isso no terminal v� para o path cd ..\apache-tomcat-10.0.23\bin e rode o comando
startup.bash (windows) ou startup.sh (linux) para abrir o servidor;

Agora basta abrir o browser e digitar o caminho: http://localhost:8080/server_LP

Ap�s conferir o servidor voc� deve deslig�-lo para que n�o continue rodando em segundo
plano na sua m�quina. Para isso, execute no terminal shutdown.bash (windows) ou
shutdown.sh (linux).

NOTA: Talvez a tabela n�o apare�a no navegador por haver alguma configura��o dele que
bloqueie a exibi��o das sa�das Java. Consulte o console apertando F12 para conferir se
h� alguma mensagem referente a bloqueio de recursos da aplica��o.
Voc� tamb�m pode conferir o c�digo da aplica��o e apontar erros no console no caminho
Source, analisando as classes Aluno.java e index.jsp