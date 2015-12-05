package dao;

public class Campus
{private String idc;
 private String uasgc;
 private String nomec;
 private String siglac;
 public Campus(){}
 public Campus(String v_idc, String v_uasgc, String v_nomec, String v_siglac){
   this.idc=v_idc;
   this.nomec=v_nomec;
   this.uasgc=v_uasgc;
   this.siglac=v_siglac;}
 public void setIdc(String v_idc){
   this.idc=v_idc;}
 public void setNomec(String v_nomec){
   this.nomec=v_nomec;}
 public void setUasgc(String v_uasgc){
   this.uasgc=v_uasgc;}
 public void setSiglac(String v_siglac){
   this.siglac=v_siglac;}
 public String getIdc(){
   return idc; }
 public String getNomec(){
   return nomec; }
 public String getUasgc(){
   return uasgc; }
 public String getSiglac(){
   return siglac; }
  
}