/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import view.VCadastroClienteJuridica;
import view.VCadastroProduto;
import view.VLogin;
import view.VMenu;

/**
 *
 * @author leo_m
 */
public class Janela {

    public void btnBarra(VCadastroClienteJuridica vm) {
        vm.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        vm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                vm.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }

    public void btnBarra(VCadastroProduto vm) {
        vm.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        vm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                vm.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }

    public void btnBarra(VMenu vm) {
        vm.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        vm.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                vm.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

    }
}
