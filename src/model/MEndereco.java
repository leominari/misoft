/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import api.ConexaoMysql;
import tipos.TCidade;
import tipos.TEstado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leo_m
 */
public class MEndereco {

    public List<TEstado> listaEstados() throws SQLException {
        List<TEstado> estados = new ArrayList<>();
        String query = "SELECT * FROM estado;";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            estados.add(new TEstado(rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("uf"))
            );
        }
        return estados;
    }

    public List<TCidade> listaCidadePorEstado(String idEstado) throws SQLException {
        List<TCidade> cidades = new ArrayList<>();
        TCidade est = new TCidade();
        String query = "SELECT * FROM cidade WHERE estado=" + idEstado + ";";
        ConexaoMysql banco = new ConexaoMysql();
        ResultSet rs = banco.exQuery(query);
        while (rs.next()) {
            cidades.add(new TCidade(rs.getString("id"),
                    rs.getString("nome")
            ));
        }
        return cidades;
    }

}
