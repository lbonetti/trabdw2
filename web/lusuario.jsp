<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Usuários</title>
    </head>
    <body>
       <center><font size="6">
        Formulário para Consulta Usuários
        <form action="ServList?l=u" method="POST">
          Prontuário do Usuário: <input type="text" name="prontuario" value="" /><br>
          Nome do Usuário: <input type="text" name="nome" value="" /><br>
          Para listar todos os usuários, deixe todos os campos em branco.
          <input type="submit" value="Enviar" />        
        </form>
        </font></center>
</body>
</html>