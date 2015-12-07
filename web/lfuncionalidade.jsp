<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Funcionalidades</title>
    </head>
    <body>
       <center><font size="6">
        Formulário para Consulta Funcionalidades sistema
        <form action="ServList?l=f" method="POST">
          Id da Funcionalidade: <input type="text" name="id" value="" /><br>
          Nome da Funcionalidade: <input type="text" name="nome" value="" /><br>
          Para listar todas as funcionalidades, deixe todos os campos em branco.
          <input type="submit" value="Enviar" />        
        </form>
        </font></center>
</body>
</html>