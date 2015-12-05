package servlets;

import dao.Campus;
import dao.Mlista;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** @author Rolando */
@WebServlet(name = "ServList", urlPatterns =
{
  "/ServList"
})
public class ServList extends HttpServlet
{

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    response.setContentType("text/html;charset=UTF-8");
    String l = request.getParameter("l");
    String msg="";
    PrintWriter out = response.getWriter();
    try 
    { 
      if ("c".equals(l))
         {
          dao.Campus cmp = new dao.Campus(request.getParameter("id"), request.getParameter("uasg"),
                       request.getParameter("nome"), request.getParameter("sigla"));
          ResultSet rs = Mlista.lcampus(cmp); 
          if (rs==null) msg="Nada Encontrado";
          else {out.println("<table border='1'>");
                rs.first();
                do {out.println("<tr><td>"+rs.getString("id")+
                    "</td><td>"+rs.getString("uasg")+
                    "</td><td>"+rs.getString("nome")+
                    "</td><td>"+rs.getString("sigla")+"</td></tr>");
                   }while (rs.next());
                out.println("</table>");
               } 
         }
      
      else if ("f".equals(l))
         {
          dao.Funcionalidade fmp = new dao.Funcionalidade(request.getParameter("id"),
                       request.getParameter("nome"), request.getParameter("classe"));   
          ResultSet rs = Mlista.lfuncionalidade(fmp); 
          if (rs==null) msg="Nada Encontrado";
          else {out.println("<table border='1'>");
                rs.first();
                do {out.println("<tr><td>"+rs.getString("id")+
                    "</td><td>"+rs.getString("nome")+
                    "</td><td>"+rs.getString("classe")+"</td></tr>");
                   }while (rs.next());
                out.println("</table>");
               } 
         }
      
      else if ("u".equals(l))
         {
          dao.Usuario fmp = new dao.Usuario(request.getParameter("id"), request.getParameter("prontuario"),
                       request.getParameter("nome"), request.getParameter("email"));   
          ResultSet rs = Mlista.lusuario(fmp); 
          if (rs==null) msg="Nada Encontrado";
          else {out.println("<table border='1'>");
                rs.first();
                do {out.println("<tr><td>"+rs.getString("id")+
                    "</td><td>"+rs.getString("nome")+
                    "</td><td>"+rs.getString("prontuario")+    
                    "</td><td>"+rs.getString("email")+"</td></tr>");
                   }while (rs.next());
                out.println("</table>");
               } 
         }
      
       else if ("fo".equals(l))
         {
          dao.Fornecedor fmp = new dao.Fornecedor(request.getParameter("id"),
                       request.getParameter("nome"), request.getParameter("cnpj"));   
          ResultSet rs = Mlista.lfornecedor(fmp); 
          if (rs==null) msg="Nada Encontrado";
          else {out.println("<table border='1'>");
                rs.first();
                do {out.println("<tr><td>"+rs.getString("id")+
                    "</td><td>"+rs.getString("nome")+    
                    "</td><td>"+rs.getString("cnpj")+"</td></tr>");
                   }while (rs.next());
                out.println("</table>");
               } 
         }
          
    }
     catch (Exception ex){msg="Erro: "+ex; out.println(msg); }
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo()
  {
    return "Short description";
  }// </editor-fold>

}
