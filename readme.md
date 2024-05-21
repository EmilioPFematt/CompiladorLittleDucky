# Proyecto compilador 

#### Proyecto escolar, crear un compilador del lenguaje littleducky

Para este proyecto estoy utilizando java para las acciones semanticas y antlr para generar codigo para el parser y lexer. 

Para correr instala antlr: https://www.antlr.org/ 
y agrega las librerias a tu path, junto con las herramientas para correr comandos. 

Despues, puedes compilar los archivos .java de este repo y utilizar alguno de los archivos en ejemplos para probar.
ejemplo de ejecucion en mi maquina.
``` shell
>/parser/ antlr4 littleDuck.g4
>/parser/ javac *.java
>/parser/ grun LittleDuck programa ejemplos/ejemploCorrecto.txt
```