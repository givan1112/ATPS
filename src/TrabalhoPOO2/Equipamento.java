/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoPOO2;

/**
 *
 * @author Gilvan
 */
 public class Equipamento {
     private int codigoEquipamento;
     private int matriculaColaboradorEquipamento;
     private String nomeEquipamento;
     private String velocidadeEquipamento;
     private String memoriaEquipamento;
     private String tipoEquipamento;
     private String usoEquipamento;
     
     public Equipamento(int codigo, String nome, String velocidade,
             String memoria, String tipo, String uso){
         this.codigoEquipamento = codigo;
         this.nomeEquipamento = nome;
         this.velocidadeEquipamento = velocidade;
         this.memoriaEquipamento = memoria;
         this.tipoEquipamento = tipo;
         this.usoEquipamento = uso;
     }
     
     public void setCodigoEquipamento (int codigo){
         this.codigoEquipamento = codigo;
     }
     public int getCodigoEquipamento(){
         return codigoEquipamento;
     }
     public void setNomeEquipamento (String nome){
         this.nomeEquipamento = nome;
     }
     public String getNomeEquipamento(){
         return nomeEquipamento;
     }
     public void setVelocidadeEquipamento(String velocidade){
         this.velocidadeEquipamento = velocidade;
     }
     public String getVelocidadeEquipamento(){
         return velocidadeEquipamento;
     }
     public void setMemoriaEquipamento (String memoria){
         this.memoriaEquipamento = memoria;
     }
     public String getMemoriaEquipamento(){
         return memoriaEquipamento;
     }
     public void setTipoEquipamento (String tipo){
         this.tipoEquipamento = tipo;
        
     }
     public String getTipoEquipamento(){
         return tipoEquipamento;
     }
     public void setUsoEquipamento (String uso){
         this.usoEquipamento = uso;
     }
     public String getUsoEquipamento(){
         return usoEquipamento;
     }
    
    
}
