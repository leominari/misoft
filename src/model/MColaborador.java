/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import api.ConexaoMysql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tipos.TPessoaJuridica;

/**
 *
 * @author leo_m
 */
public class MColaborador {

    public List<TPessoaJuridica> listaClientes() throws SQLException {
        List<TPessoaJuridica> clientes = new ArrayList<>();
        String query = "SELECT id, razaosocial, documento FROM colaborador ORDER BY razaosocial;";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            clientes.add(new TPessoaJuridica(
                    rs.getString("id"),
                    rs.getString("razaosocial"),
                    rs.getString("documento")));
        }
        return clientes;
    }
}
