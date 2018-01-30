
package unach.trabajogrupal.vistas;
import unach.trabajogrupal.rnegocio.dao.*;
import unach.trabajogrupal.rnegocio.entidades.*;
import unach.trabajogrupal.rnegocio.impl.*;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class FrmNuevoAutobus extends JFrame{
     private int Cod_bus;
    private String NombreCompania; 
    private String N_placa;
    private String Nom_Chofer;

    JLabel lblTitulo0;
    
     JLabel lblCodigo;
    JLabel lblNombre;
    JLabel lblPlaca;
    JLabel lblChofer;
    
    JTextField txtCodigo;
    JTextField txtNombre;
    JTextField txtPlaca;
    JTextField txtChofer;
    
    
    
    JButton btnLimpiar;
    JButton btnAceptar;
    
    JPanel pnlCentral;
    JPanel pnlPie;

    public FrmNuevoAutobus() {
        
        
         this.setSize(300, 300);
        setTitle("AUTOBUS....");
	
        this.setLayout(new BorderLayout());
        
        pnlCentral= new JPanel();
        pnlPie= new JPanel();
        pnlCentral.setLayout(new GridLayout(10, 2, 5, 5));
        pnlPie.setLayout(new GridLayout(1,2,5,5));
        
        lblTitulo0 = new JLabel("Datos Estudiante");
        
        lblCodigo= new JLabel("Código:");
        lblNombre= new JLabel("Nombre de la compania:");
        lblPlaca= new JLabel("Placa:");
        lblChofer= new JLabel("Chofer:");      
        
        
        txtCodigo = new JTextField(2);
        txtNombre= new JTextField(2);
        txtPlaca= new JTextField(2);
        txtChofer= new JTextField(2);
        
        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlCentral.setBackground(Color.CYAN);
        
        pnlCentral.add(lblCodigo);
        pnlCentral.add(txtCodigo);
        pnlCentral.add(lblNombre);
        pnlCentral.add(txtNombre);
        pnlCentral.add(lblPlaca);
        pnlCentral.add(txtPlaca);
        pnlCentral.add(lblChofer);
        pnlPie.add(btnLimpiar);
        pnlPie.add(btnAceptar);
        
        this.add(lblTitulo0, BorderLayout.NORTH);
        this.add(pnlCentral, BorderLayout.CENTER);
        this.add(pnlPie, BorderLayout.SOUTH); 
        
        
        btnAceptar.addActionListener(new ActionListener() {           
             @Override
             public void actionPerformed(ActionEvent e) {
                  try {
                      btnAceptarActionListener(e);
                } catch (Exception ex) {
                    System.out.println("Error:"+ex.getMessage());
                }
             }

             
        });
    }
    
    public static void main(String[] args) {
        FrmNuevoAutobus frmMenu= new FrmNuevoAutobus();
        frmMenu.setVisible(true);
    } 
  
     public void btnAceptarActionListener(ActionEvent e){
        IAutobus terminalDao=new AutobusImpl();
        Autobus autobus =new Autobus();

        autobus.setCod_bus(Integer.parseInt(txtCodigo.getText()));
        autobus.setNombreCompania(txtNombre.getText());
        autobus.setN_placa(txtPlaca.getText());
        autobus.setNom_Chofer(txtChofer.getText());
        
         try{
            if(terminalDao.insertar(autobus)>0){
                JOptionPane.showMessageDialog(this,"Guardado correctamente",
                "transaccion", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,"Error desconocido",
                "error", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
             JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
   
    }
}





