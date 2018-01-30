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

public class FrmMenuPrincipal extends JFrame {

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
    JMenuItem mniListaRegistro;

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
                mniSalirActionPerformed(e);
            }
        });
        mnTerminal = new JMenu("TERMINAL");
        mnTerminal = new JMenu("Terminal");
        mnAutobus = new JMenu("Autobus");
        mnRegistro = new JMenu("Registro");
        mniNuevoTerminal = new JMenuItem("Nuevo");
        mniNuevoTerminal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoTerminalActionPerformed(e);
            }
        });
        mniModificaTerminal = new JMenuItem("Modifica");
        mniListaTerminal = new JMenuItem("Lista");

        mniListaTerminal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  mniListaTerminalPerdormed(e);
            }
        });

        mniNuevoAutobus = new JMenuItem("Nuevo");
        mniNuevoAutobus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //    mniNuevoAutobus ActionPerformed(e
            
            }
        });
        mniNuevoAutobus = new JMenuItem("Modifica");
        mniNuevoAutobus = new JMenuItem("Lista");

        mniNuevoRegistro = new JMenuItem("Nuevo");
        mniNuevoRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  mniNuevoRegistroActionPerformed(e);
            }
        });
        mniModificaRegistro = new JMenuItem("Modifica");

        mniListaRegistro = new JMenuItem("Lista");

        mniListaRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // mniListaRegistroActionPerdormed(e);
            }
        });

        mnTerminal.add(mniNuevoTerminal);
        mnTerminal.add(mniModificaTerminal);
        mnTerminal.addSeparator();

        mnTerminal.add(mniListaTerminal);
        mnbPrincipal.add(mnInicio);
        mnbPrincipal.add(mnTerminal);
        mnbPrincipal.add(mnAutobus);
        mnbPrincipal.add(mnRegistro);

        mnInicio.add(mniLogin);
        mnInicio.add(mniSalir);

        mnAutobus.add(mniNuevoAutobus);
        mnAutobus.add(mniModificaAutobus);

        mnAutobus.addSeparator();

        mnAutobus.add(mniListaAutobus);

        mnRegistro.add(mniNuevoRegistro);
        mnRegistro.add(mniModificaRegistro);

        mnRegistro.addSeparator();

        mnRegistro.add(mniListaRegistro);

        this.setLayout(new BorderLayout());
        this.add(mnbPrincipal, BorderLayout.NORTH);
        this.add(dkpEscritorio, BorderLayout.CENTER);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void mniSalirActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    public void mniNuevoTerminalActionPerformed(ActionEvent e) {
        FrmNuevoTerminal frm = new FrmNuevoTerminal();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }

//    public void mniNuevoAutobusActionPerformed(ActionEvent e) {
//        FrmNuevoAutobus frm = new FrmNuevoAutobus();
//        dkpEscritorio.add(frm);
//        frm.setVisible(true);
//    }

//    public void mniNuevoRegistrotrActionPerformed(ActionEvent e) {
//        FrmNuevoRegistro frm = new FrmNuevoRegistro();
//        dkpEscritorio.add(frm);
//        frm.setVisible(true);
//    }
    
    public static void main(String[] args) {
        FrmMenuPrincipal frmMEnu = new FrmMenuPrincipal();
        frmMEnu.setVisible(true);

    }
}
