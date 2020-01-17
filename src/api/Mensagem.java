/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import javax.swing.JOptionPane;

/**
 *
 * @author leo_m
 */
public class Mensagem {

    public void erroCadastro() {
        JOptionPane.showMessageDialog(null, "Erro ao Cadastrar, entre em contato com a equipe técnica.");
    }

    public void sucessoCadastroCliente() {
        JOptionPane.showMessageDialog(null, "Cliente cadastrao com sucesso.");
    }

    public void cadastroClienteExistente() {
        JOptionPane.showMessageDialog(null, "Cliente já cadastrado.");
    }
}
