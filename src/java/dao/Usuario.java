package dao;

public class Usuario
{private String idc;
 private String prontuario;
 private String nomec;
 private String email;
 public Usuario(){}
 public Usuario(String v_idc, String v_prontuario, String v_nomec, String v_email)
{
   this.idc=v_idc;
   this.prontuario=v_prontuario;
   this.nomec=v_nomec;
   this.email=v_email;}
 public void setIdc(String v_idc){
   this.idc=v_idc;}
 public void setProntuario(String v_prontuario){
   this.prontuario=v_prontuario;}
 public void setNomec(String v_nomec){
   this.nomec=v_nomec;}
 public void setEmail(String v_email){
   this.email=v_email;}
 public String getIdc(){
   return idc; }
  public String getProntuario(){
   return prontuario; }
 public String getNomec(){
   return nomec; }
 public String getEmail(){
   return email; }
  
}
