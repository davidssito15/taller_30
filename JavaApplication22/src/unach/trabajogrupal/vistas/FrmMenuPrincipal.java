/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unach.trabajogrupal.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FrmMenuPrincipal {

    JMenuBar mnbPrincipal;
    JMenu mnInicio;
    JMenuItem mniLogin;
    JMenuItem mniSalir;

    JMenu mnTerminal;
    JMenuItem mniNuevoTerminal;
    JMenuItem mniModificaTerminal;
    JMenuItem mniListaTerminal;
    JMenu mnAutobus;
    JMenuItem mniNuevoAutobus;
    JMenuItem mniModificaAutobus;
    JMenuItem mniListaAutobus;
    JMenu mnRegistro;
    JMenuItem mniNuevoRegistro;
    JMenuItem mniModificaRegistro;
    JMenuItem mniListaReistro;

    JDesktopPane dkpEscritorio;

    public FrmMenuPrincipal() {

        dkpEscritorio = new JDesktopPane();
        dkpEscritorio.setBackground(new Color(240, 240, 240));
        mnbPrincipal = new JMenuBar();
        mnInicio = new JMenu("Inicio");
        mniLogin = new JMenuItem("Iniciar Secion");
        mniSalir = new JMenuItem("Salir");
        mniSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mniSalirActionPerformed(e);
            }
        });
    }

}
