/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import tipos.TEndereco;

public class CCadastroCliente {

    public TEndereco completaCep(String cep) {
        TEndereco cliente = new TEndereco();
        cliente.buscaCep(cep);
        return cliente;
    }
}
