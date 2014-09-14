/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoPOO2;



/**
 *
 * @author Gilvan
 */
public class DeltaZ123 {
    public static void main (String args[]){
        Equipamento E1 = new Equipamento(001, "Core 15", "3.40 Ghz", "DDR3", 
                "Fixo", "Coletivo");
        System.out.println(E1.getCodigoEquipamento());
        System.out.println(E1.getNomeEquipamento());
        System.out.println(E1.getVelocidadeEquipamento());
        System.out.println(E1.getMemoriaEquipamento());
        System.out.println(E1.getTipoEquipamento());
        System.out.println(E1.getUsoEquipamento());
        
 
        }
    
}
