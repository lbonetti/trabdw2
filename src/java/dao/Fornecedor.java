package dao;

public class Fornecedor
{private String idc;
 private String nomec;
 private String cnpj;
 public Fornecedor(){}
 public Fornecedor(String v_idc, String v_nomec, String v_cnpj){
   this.idc=v_idc;
   this.nomec=v_nomec;
   this.cnpj=v_cnpj;}
 public void setIdc(String v_idc){
   this.idc=v_idc;}
 public void setNomec(String v_nomec){
   this.nomec=v_nomec;}
 public void setCnpj(String v_cnpj){
   this.cnpj=v_cnpj;}
 public String getIdc(){
   return idc; }
 public String getNomec(){
   return nomec; }
 public String getCnpj(){
   return cnpj; }
  
}
