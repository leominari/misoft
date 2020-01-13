/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import api.ConexaoMysql;
import controller.Cidade;
import controller.Estado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leo_m
 */
public class MEndereco {

    public List<Estado> listaEstados() throws SQLException {
        List<Estado> estados = new ArrayList<>();
        String query = "SELECT * FROM estado;";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            estados.add(new Estado(rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("uf"))
            );
        }
        return estados;
    }

    public List<Cidade> listaCidadePorEstado(String idEstado) throws SQLException {
        List<Cidade> cidades = new ArrayList<>();
        Cidade est = new Cidade();
        String query = "SELECT * FROM cidade WHERE estado=" + idEstado + ";";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            cidades.add(new Cidade(rs.getString("id"),
                    rs.getString("nome")
            ));
        }
        return cidades;
    }

}
