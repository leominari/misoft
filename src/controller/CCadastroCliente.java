/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
public class CCadastroCliente {

    public CEndereco completaCep(String cep) {
        CEndereco cliente = new CEndereco();
        cliente.buscaCep(cep);
        return cliente;
    }
}
