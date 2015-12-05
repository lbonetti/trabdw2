<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Fornecedor</title>
    </head>
    <body>
       <center><font size="6">
        Formulário para Consulta Fornecedor
        <form action="ServList?l=fo" method="POST">
          ID do Fornecedor <input type="text" name="id" value="" /><br>
          Nome do Fornecedor: <input type="text" name="nome" value="" /><br>
          Com os campos em branco, lista todos os campus.
          <input type="submit" value="Enviar" />        
        </form>
        </font></center>
</body>
</html>