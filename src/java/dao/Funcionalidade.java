package dao;

public class Funcionalidade
{private String idc;
 private String nomec;
 private String classec;
 public Funcionalidade(){}
 public Funcionalidade(String v_idc, String v_nomec, String v_classec){
   this.idc=v_idc;
   this.nomec=v_nomec;
   this.classec=v_classec;}
 public void setIdc(String v_idc){
   this.idc=v_idc;}
 public void setNomec(String v_nomec){
   this.nomec=v_nomec;}
 public void setSiglac(String v_classec){
   this.classec=v_classec;}
 public String getIdc(){
   return idc; }
 public String getNomec(){
   return nomec; }
 public String getSiglac(){
   return classec; }
  
}
