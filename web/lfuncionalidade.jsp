<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Campus</title>
    </head>
    <body>
       <center><font size="6">
        Formulário para Consulta Funcionalidades sistema
        <form action="ServList?l=f" method="POST">
          Id da Funcionalidade: <input type="text" name="id" value="" /><br>
          Nome da Funcionalidade: <input type="text" name="nome" value="" /><br>
          Classe da Funcionalidade: <input type="text" name="classe" value="" /><br>
          Com os campos em branco, lista todos os campus.
          <input type="submit" value="Enviar" />        
        </form>
        </font></center>
</body>
</html>