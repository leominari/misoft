/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import api.ConexaoMysql;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tipos.TUsuario;

/**
 *
 * @author leo_m
 */
public class MLogin {

    public TUsuario getUsuario(String usuario) throws SQLException {
        TUsuario user = new TUsuario();
        ResultSet rs ;
        String query = "SELECT * FROM usuario WHERE usuario='" + usuario + "';";
        ConexaoMysql banco = new ConexaoMysql();
        try {
           rs = banco.exQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao servidor.");
            return null;
        }

        if (rs.next()) {
            user.setId(rs.getString("id"));
            user.setUsuario(rs.getString("usuario"));
            user.setSenha(rs.getString("senha"));
        }
        return user;
    }

    //    public boolean novoDoador(Doador doador) throws SQLException {
//        doador.leDoador();
//        query = "INSERT INTO `doador`(`nome`, `dataNascimento`, `sexo`, `nomeMae`, `nomePai`, `documento`, `endereco`, `bairro`, `numero`, `complemento`) VALUES ('" + doador.getNomeCompleto() + "','" + doador.getDataNascimento() + "', '" + doador.getSexo() + "','" + doador.getNomeMae() + "', '" + doador.getNomePai() + "','" + doador.getDocumento() + "', '" + doador.getEndereco() + "', '" + doador.getBairro() + "'," + doador.getNumero() + ", '" + doador.getComplemento() + "');";
//        ConexaoMysql banco = new ConexaoMysql();
//        return banco.upQuery(query);
//    }
//
//    public boolean novaTriagem(Triagem triagem) {
//        query = "INSERT INTO `triagem`(`idDoador`,`anemia`, `hepatiteb`, `sifilis`, `htlv`, `hepatitec`, `chagas`, `aids`) VALUES (" + triagem.getIdDoador() + ",'" + triagem.isAnemia() + "', '" + triagem.isHepatiteB() + "','" + triagem.isSifilis() + "', '" + triagem.isHtlv() + "','" + triagem.isHepatiteC() + "', '" + triagem.isChagas() + "', '" + triagem.isAids() + "');";
//        ConexaoMysql banco = new ConexaoMysql();
//        return banco.upQuery(query);
//    }
//
//    public boolean novaDoacao(Doador doador) {
//        Date dia = new Date();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String datual = dateFormat.format(dia);
//        query = "INSERT INTO doacoes(idDoador, dataDoacao, idTriagem) VALUES (" + doador.getIdDoador() + ",'" + datual + "',(SELECT idTriagem FROM triagem WHERE triagem.idDoador = " + doador.getIdDoador() + " order by triagem.idTriagem desc limit 1));";
//        ConexaoMysql banco = new ConexaoMysql();
//        return banco.upQuery(query);
//    }
}
