package TrabalhoPOO2;

/**
 *
 * @author Jorge Freitas
 */
 
public class Usuario {
    private int matriculaColaborador;
    private String nomeColaborador;
    private String localTrabalhoColaborador;
    
    public Usuario(int matricula, String nome, String localTrabalho){
        this.matriculaColaborador = matricula;
        this.nomeColaborador = nome;
        this.localTrabalhoColaborador = localTrabalho;
    }    
    public void setMatriculaColaborador (int matricula){
        this.matriculaColaborador = matricula;
    }
    public int getMatriculaColaborador(){
        return matriculaColaborador;
    }
    public void setNomeColaborador (String nome){
        this.nomeColaborador = nome;
    }
    public String getNomeColaborador(){
        return nomeColaborador;
    }
    public void setlocalTrabalhoColaborador(String localTrabalho){
        this.localTrabalhoColaborador = localTrabalho;
    }
    public String getlocalTrabalhoColaborador(){
        return localTrabalhoColaborador;
    }
}
