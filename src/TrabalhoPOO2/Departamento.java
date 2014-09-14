/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoPOO2;

/**
 *
 * @author Gilvan
 */
public class Departamento {
    private int codigoDepartamento;
    private String descricaoDepartamento;
    
    public Departamento(int codigo, String descricao){
        this.codigoDepartamento = codigo;
        this.descricaoDepartamento = descricao;
    }
    public void setCodigoDepartamento (int codigo){
        this.codigoDepartamento = codigo;
    }
    public int getCodigoDepartamento(){
        return codigoDepartamento;
    }
    public void setDescricaoDepartamento (String descricao){
        this.descricaoDepartamento = descricao;
    }
    public String getDescricaoDepartamento(){
        return descricaoDepartamento;
    }
    
}
