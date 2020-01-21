/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import api.Mensagem;
import model.MProduto;
import tipos.TProduto;

/**
 *
 * @author leo_m
 */
public class CProduto {

    public CProduto() {
    }

    public void cadastraProduto(TProduto produto) {
        MProduto model = new MProduto();
        Mensagem msg = new Mensagem();
        if (model.verificaCadastroExiste(produto.getNome())) {
            if (model.novoCadastro(produto)) {
                msg.sucessoCadastro();
            } else {
                msg.erroCadastro();
            }
        }else{
            msg.cadastroExistente("Produto");
        }
    }
}
