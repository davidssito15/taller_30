
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
    
    JMenu mnAutobus;
    JMenuItem mniNuevoAutobus;
    JMenuItem mniModificaAutobus;
    JMenuItem mniEliminaAutobus;
    JMenuItem mniBuscaAutobus;
    JMenuItem mniListaAutobus;
        

        
    JMenu mnRegistro;
    JMenuItem mniNuevoRegistro;
    JMenuItem mniModificaRegistro;
    JMenuItem mniEliminaRegistro;
    JMenuItem mniBuscaRegistro;
    JMenuItem mniListaRegistro;
    
    
    JMenu mnTerminal;
    JMenuItem mniNuevoTerminal;
    JMenuItem mniModificaTerminal;
    JMenuItem mniEliminaTerminal;
    JMenuItem mniBuscaTerminal;
    JMenuItem mniListaTerminal;
    
    
    
    JDesktopPane dkpEscritorio;
    public FrmMenuPrincipal() {
        dkpEscritorio= new JDesktopPane();
        dkpEscritorio.setBackground(new Color(240, 240, 240));
        
        setTitle("***** BASE DE DATOS TRASPORTE****");
        dkpEscritorio.setBackground(Color.GRAY);
        
        mnbPrincipal = new JMenuBar();
        mnInicio = new JMenu("Inicio");
        mniLogin = new JMenuItem("Iniciar Sesión");
        mniSalir = new JMenuItem("Salir");
        mniSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniSalirActionPerformed(e);
            }
        });
        mnAutobus= new JMenu("Autobus");
        mniNuevoAutobus= new JMenuItem("Nuevo");
        mniNuevoAutobus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoAutobusActionPerformed(e);
            }
        });
        mniModificaAutobus= new JMenuItem("Modifica");
        mniEliminaAutobus= new JMenuItem("Elimina");
        mniBuscaAutobus= new JMenuItem("Busca");
        mniListaAutobus= new JMenuItem("Lista");
        mniListaAutobus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // mniListeAutobusActionPerformed(e);
            }
        });
        
        
        mnAutobus.add(mniNuevoAutobus);
        mnAutobus.add(mniModificaAutobus);
        mnAutobus.add(mniEliminaAutobus);
        mnAutobus.addSeparator();
        mnAutobus.add(mniBuscaAutobus);
        mnAutobus.add(mniListaAutobus);
        
        
         mnRegistro= new JMenu("Registro");
        mniNuevoRegistro= new JMenuItem("Nuevo");
        mniNuevoRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //    mniNuevoRegistroActionPerformed(e);
            }
        });
        mniModificaRegistro= new JMenuItem("Modifica");
        mniEliminaRegistro= new JMenuItem("Elimina");
        mniBuscaRegistro= new JMenuItem("Busca");
        mniListaRegistro= new JMenuItem("Lista");
        mniListaRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //   mniListaRegistroActionPerformed(e);
            }
        });
        
        
        mnRegistro.add(mniNuevoRegistro);
        mnRegistro.add(mniModificaRegistro);
        mnRegistro.add(mniEliminaRegistro);
        mnRegistro.addSeparator();
        mnRegistro.add(mniBuscaRegistro);
        mnRegistro.add(mniListaRegistro);
        
        
        
        mnTerminal=new JMenu("Terminal");
        mniNuevoTerminal=new JMenuItem("Nuevo");
        mniNuevoTerminal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoTerminalActionPerformed(e);
                }
        });
        
        mniModificaTerminal=new JMenuItem("Modifica");
        mniEliminaTerminal=new JMenuItem("Elimina");
        mniBuscaTerminal=new JMenu("Buscar");
        mniListaTerminal=new JMenu("Lista");
        
        mnTerminal.add(mniNuevoTerminal);
        mnTerminal.add(mniModificaTerminal);
        mnTerminal.add(mniEliminaTerminal);
        mnTerminal.addSeparator();
        mnTerminal.add(mniBuscaTerminal);
        mnTerminal.add(mniListaTerminal);
        
                
        
        mnbPrincipal.add(mnInicio);
        mnbPrincipal.add(mnAutobus);
        mnbPrincipal.add(mnRegistro);
        mnbPrincipal.add(mnTerminal);
     
        mnInicio.add(mniLogin);
        mnInicio.add(mniSalir);
        
        this.setLayout(new BorderLayout());
        this.add(mnbPrincipal, BorderLayout.NORTH);
        this.add(dkpEscritorio, BorderLayout.CENTER);
        this.setExtendedState(MAXIMIZED_BOTH); //Para maximizar
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Para terminar el programa
    }
    
//    public void mniListaDocenteActionPerformed(ActionEvent e){
//        FrmListaDocente frmD=new FrmListaDocente();
//        dkpEscritorio.add(frmD);
//        frmD.setVisible(true);
//     } 
//    public void mniListaEstudianteActionPerformed(ActionEvent e){
//        FrmListaEstudiante frmLE=new FrmListaEstudiante();
//        dkpEscritorio.add(frmLE);
//        frmLE.setVisible(true);
//     }
      
    
    public void mniNuevoTerminalActionPerformed(ActionEvent e){
        FrmNuevoTerminal frmM=new FrmNuevoTerminal();
        dkpEscritorio.add(frmM);
        frmM.setVisible(true);
     }    
//     public void mniNuevoRegistroActionPerformed(ActionEvent e){
//        FrmNuevoRegistro frm = new FrmNuevoRegistro();
//        dkpEscritorio.add(frm);
//        frm.setVisible(true);
//    }
    public void mniNuevoAutobusActionPerformed(ActionEvent e){
        FrmNuevoAutobus frm = new FrmNuevoAutobus();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }
    public void mniSalirActionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    public static void main(String[] args) {
        FrmMenuPrincipal frm = new FrmMenuPrincipal();
        frm.setVisible(true);
    }
}
