/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import api.Erro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.MEndereco;
import tipos.TEndereco;

public class CCadastroCliente {

    private TEndereco endereco;
    private JTextField tfCapitalSocial;
    private JTextField tfContribuinte;
    private JTextField tfEmail;
    private JTextField tfInscricaoMunicipal;
    private JTextField tfNomeFantasia;
    private JTextField tfRazaoSocial;
    private JTextField tfTelefone;
    private JTextArea taObservacoes;
    private JFormattedTextField ftfFund;
    private JFormattedTextField ftfInscricaoEstadual;
    private JFormattedTextField ftfCnpj;

    public TEndereco completaCep(String cep) {
        TEndereco cliente = new TEndereco();
        cliente.buscaCep(cep);
        return cliente;
    }

    public void verificaCampos() {
        if (tfNomeFantasia.getText().trim().equals("")) {
            setTfNomeFantasia(null);
        }
        if (tfContribuinte.getText().trim().equals("")) {
            setTfNomeFantasia(null);

        }
        if (tfEmail.getText().trim().equals("")) {
            setTfNomeFantasia(null);

        }
        if (tfInscricaoMunicipal.getText().trim().equals("")) {
            setTfNomeFantasia(null);

        }
        if (tfTelefone.getText().trim().equals("")) {
            setTfNomeFantasia(null);

        }
        if (taObservacoes.getText().trim().equals("")) {
            setTfNomeFantasia(null);

        }
        if (ftfFund.getText().trim().equals("")) {
            setTfNomeFantasia(null);

        }
        if (tfEmail.getText().trim().equals("")) {
            setTfNomeFantasia(null);

        }

    }

    public void cadastraCliente() {
        verificaCampos();
        try {
            getEndereco().setId(new MEndereco().novoEndereco(endereco));
            if (getEndereco().getId().equals("-1")) {
                new Erro().erroCadastro();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the endereco
     */
    public TEndereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(TEndereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the tfCapitalSocial
     */
    public JTextField getTfCapitalSocial() {
        return tfCapitalSocial;
    }

    /**
     * @param tfCapitalSocial the tfCapitalSocial to set
     */
    public void setTfCapitalSocial(JTextField tfCapitalSocial) {
        this.tfCapitalSocial = tfCapitalSocial;
    }

    /**
     * @return the tfContribuinte
     */
    public JTextField getTfContribuinte() {
        return tfContribuinte;
    }

    /**
     * @param tfContribuinte the tfContribuinte to set
     */
    public void setTfContribuinte(JTextField tfContribuinte) {
        this.tfContribuinte = tfContribuinte;
    }

    /**
     * @return the tfEmail
     */
    public JTextField getTfEmail() {
        return tfEmail;
    }

    /**
     * @param tfEmail the tfEmail to set
     */
    public void setTfEmail(JTextField tfEmail) {
        this.tfEmail = tfEmail;
    }

    /**
     * @return the tfInscricaoMunicipal
     */
    public JTextField getTfInscricaoMunicipal() {
        return tfInscricaoMunicipal;
    }

    /**
     * @param tfInscricaoMunicipal the tfInscricaoMunicipal to set
     */
    public void setTfInscricaoMunicipal(JTextField tfInscricaoMunicipal) {
        this.tfInscricaoMunicipal = tfInscricaoMunicipal;
    }

    /**
     * @return the tfNomeFantasia
     */
    public JTextField getTfNomeFantasia() {
        return tfNomeFantasia;
    }

    /**
     * @param tfNomeFantasia the tfNomeFantasia to set
     */
    public void setTfNomeFantasia(JTextField tfNomeFantasia) {
        this.tfNomeFantasia = tfNomeFantasia;
    }

    /**
     * @return the tfRazaoSocial
     */
    public JTextField getTfRazaoSocial() {
        return tfRazaoSocial;
    }

    /**
     * @param tfRazaoSocial the tfRazaoSocial to set
     */
    public void setTfRazaoSocial(JTextField tfRazaoSocial) {
        this.tfRazaoSocial = tfRazaoSocial;
    }

    /**
     * @return the tfTelefone
     */
    public JTextField getTfTelefone() {
        return tfTelefone;
    }

    /**
     * @param tfTelefone the tfTelefone to set
     */
    public void setTfTelefone(JTextField tfTelefone) {
        this.tfTelefone = tfTelefone;
    }

    /**
     * @return the taObservacoes
     */
    public JTextArea getTaObservacoes() {
        return taObservacoes;
    }

    /**
     * @param taObservacoes the taObservacoes to set
     */
    public void setTaObservacoes(JTextArea taObservacoes) {
        this.taObservacoes = taObservacoes;
    }

    /**
     * @return the ftfFund
     */
    public JFormattedTextField getFtfFund() {
        return ftfFund;
    }

    /**
     * @param ftfFund the ftfFund to set
     */
    public void setFtfFund(JFormattedTextField ftfFund) {
        this.ftfFund = ftfFund;
    }

    /**
     * @return the ftfInscricaoEstadual
     */
    public JFormattedTextField getFtfInscricaoEstadual() {
        return ftfInscricaoEstadual;
    }

    /**
     * @param ftfInscricaoEstadual the ftfInscricaoEstadual to set
     */
    public void setFtfInscricaoEstadual(JFormattedTextField ftfInscricaoEstadual) {
        this.ftfInscricaoEstadual = ftfInscricaoEstadual;
    }

    /**
     * @return the ftfCnpj
     */
    public JFormattedTextField getFtfCnpj() {
        return ftfCnpj;
    }

    /**
     * @param ftfCnpj the ftfCnpj to set
     */
    public void setFtfCnpj(JFormattedTextField ftfCnpj) {
        this.ftfCnpj = ftfCnpj;
    }

}
