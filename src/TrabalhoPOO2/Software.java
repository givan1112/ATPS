package TrabalhoPOO2;

import java.util.Date;

/**
 *
 * @author Jorge Freitas
 */
 
 
public class Software {
    private String nomeSoftware;
    private String fabricanteSoftware;
    private String versaoSoftware;
    private String chaveLicenciamentoSoftware;
    private String classificacaoSoftware;
    private int notaFiscalSoftware;
    private Date dataAquisicaoSoftware;
    private Date validadeChaveLicenciamentoSoftware;
    
    public Software(String nome, String fabricante, String versao, 
            String chaveLicenciamento,String classificacao, int notaFiscal, 
            Date dataAquisicao, Date validadeChaveLicenciamento){
        this.nomeSoftware = nome;
        this.fabricanteSoftware = fabricante;
        this.versaoSoftware = versao;
        this.chaveLicenciamentoSoftware = chaveLicenciamento;
        this.classificacaoSoftware = classificacao;
        this.notaFiscalSoftware = notaFiscal;
        this.dataAquisicaoSoftware = dataAquisicao;
        this.validadeChaveLicenciamentoSoftware = validadeChaveLicenciamento;
        }
        public void setNomeSoftware (String nome){
            this.nomeSoftware = nome;
        }
        public String getNomeSoftware(){
            return nomeSoftware;
        }  
        public void setFabricanteSoftware (String fabricante){
            this.fabricanteSoftware = fabricante;
        }
        public String getFabricanteSoftware(){
            return fabricanteSoftware;
        }
        public void setVersaoSoftware (String versao){
            this.versaoSoftware = versao;
        }
        public String getVersaoSoftware (){
            return versaoSoftware;
        }
        public void setChaveLicenciamentoSoftware(String chaveLicenciamento){
            this.chaveLicenciamentoSoftware = chaveLicenciamento;
        }
        public String getChaveLicenciamentoSoftware(){
            return chaveLicenciamentoSoftware;
        }
        public void setClassificacaoSoftware (String classificacao){
            this.classificacaoSoftware = classificacao;
        }
        public String getClassificacaoSoftware(){
            return classificacaoSoftware;
        }
        public void setNotaFiscalSoftware (int notaFiscal){
            this.notaFiscalSoftware = notaFiscal;
        }
        public int getNotaFiscalSoftware(){
            return notaFiscalSoftware;
        }
        public void setDataAquisicaoSoftware (Date dataAquisicao){
            this.dataAquisicaoSoftware = dataAquisicao;
        }
        public Date getDataAquisicaoSoftware(){
            return dataAquisicaoSoftware;
        }
        public void setValidadeChaveLicenciamentoSoftware (Date validadeChaveLicenciamento){
            this.validadeChaveLicenciamentoSoftware = validadeChaveLicenciamento;
        }
        public Date getValidadeChaveLicenciamentoSoftware(){
            return validadeChaveLicenciamentoSoftware;
        }       
}
