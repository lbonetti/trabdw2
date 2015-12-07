<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Campus</title>
    </head>
    <body>
       <center><font size="6">
        Formulário para Consulta Campus
        <form action="ServList?l=c" method="POST">
          Id do Campus: <input type="text" name="id" value="" /><br>
          Nome do Campus: <input type="text" name="nome" value="" /><br>
          Para listar todos os campus, deixe todos os campos em branco.
          <input type="submit" value="Enviar" />        
        </form>
        </font></center>
</body>
</html>