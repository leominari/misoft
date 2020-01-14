/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

/**
 *
 * @author leo_m
 */
public class TCadastroJuridica extends TCadastro{
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String fundacao;
    private String capitalSocial;

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the fundacao
     */
    public String getFundacao() {
        return fundacao;
    }

    /**
     * @param fundacao the fundacao to set
     */
    public void setFundacao(String fundacao) {
        this.fundacao = fundacao;
    }

    /**
     * @return the capitalSocial
     */
    public String getCapitalSocial() {
        return capitalSocial;
    }

    /**
     * @param capitalSocial the capitalSocial to set
     */
    public void setCapitalSocial(String capitalSocial) {
        this.capitalSocial = capitalSocial;
    }
}
