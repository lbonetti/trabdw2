package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mlista
{/* ------Inclusão de Tipos -----------*/
 public static ResultSet lcampus(Campus lc){
  Connection conn = null;
  try { conn=Conexao.getConexao();
        String sql="SELECT * FROM campus ";
        if (!"".equals(lc.getIdc()))
            sql += "WHERE id='"+lc.getIdc()+"'";
        else if (!"".equals(lc.getNomec()))
            sql += "WHERE nome='"+lc.getNomec()+"'";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.last();
        int n = rs.getRow();
        if (n==0) return null;
        else return rs;       
  } catch (Exception e){return null;}
  }
 
 public static ResultSet lfuncionalidade(Funcionalidade lf){
  Connection conn = null;
  try { conn=Conexao.getConexao();
        String sql="SELECT * FROM funcionalidade ";
        if (!"".equals(lf.getIdc()))
            sql += "WHERE id='"+lf.getIdc()+"'";
        else if (!"".equals(lf.getNomec()))
            sql += "WHERE nome='"+lf.getNomec()+"'";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.last();
        int n = rs.getRow();
        if (n==0) return null;
        else return rs;       
  } catch (Exception e){return null;}
  }
 
 public static ResultSet lusuario(Usuario lf){
  Connection conn = null;
  try { conn=Conexao.getConexao();
        String sql="SELECT * FROM usuario ";
        if (!"".equals(lf.getProntuario()))
            sql += "WHERE prontuario='"+lf.getProntuario()+"'";
        else if (!"".equals(lf.getNomec()))
            sql += "WHERE nome='"+lf.getNomec()+"'";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.last();
        int n = rs.getRow();
        if (n==0) return null;
        else return rs;       
  } catch (Exception e){return null;}
  }
}
