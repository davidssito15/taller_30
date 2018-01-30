package ec.edu.unach.trabajogrupal.vistas;




import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import unach.trabajogrupal.rnegocio.dao.*;
import unach.trabajogrupal.rnegocio.impl.*;
import unach.trabajogrupal.rnegocio.entidades.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class FrmNuevoRegistro extends JInternalFrame{    
    JLabel lblFecha;
    JLabel lblHora;
    JLabel lblTitulo0;
   
    
    JTextField txtFecha;
    JTextField txtHora;
    
   
    
    JButton btnLimpiar;
    JButton btnAceptar;
    
    JPanel pnlCentral;
    JPanel pnlPie;
    public FrmNuevoRegistro() {
        this.setSize(400, 400);
        this.setLayout(new BorderLayout());
        this.setClosable(true);
        pnlCentral= new JPanel();
        pnlPie= new JPanel();
        pnlCentral.setLayout(new GridLayout(11, 2, 5, 5));
        pnlPie.setLayout(new GridLayout(1,2,5,5));
        
        lblTitulo0 = new JLabel("Datos Registro");
        
        lblFecha= new JLabel("Fecha:");
        lblHora= new JLabel("Hora:");
           
       
 

        txtFecha= new JTextField(2);
        txtHora= new JTextField(2);
             
       
               
        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlCentral.add(lblFecha);
        pnlCentral.add(txtFecha);
        pnlCentral.add(lblHora);
        pnlCentral.add(txtHora);       
      ;
                   
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
        pnlPie.add(btnLimpiar);
        pnlPie.add(btnAceptar);
        
        this.add(lblTitulo0, BorderLayout.NORTH);
        this.add(pnlCentral, BorderLayout.CENTER);
        this.add(pnlPie, BorderLayout.SOUTH);        
    }
    public static void main(String[] args) {
        FrmNuevoRegistro frmMenu= new FrmNuevoRegistro();
        frmMenu.setVisible(true);
    }    
    public void btnAceptarActionListener(ActionEvent e){
        IRegistro registroDao = new RegistroImpl();
        Registro registro = new Registro();
       registro.setFecha(txtFecha.getText());
        registro.setHora(txtHora.getText());
      
       
     
             
              
        try {
            if(registroDao.insertar(registro)>0){
                JOptionPane.showMessageDialog(this,"Guaradado correctamente!!",
                "Transacción", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,"Error desconocido!!",
                "Transacción", JOptionPane.INFORMATION_MESSAGE);
            }           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Error al guardar!!: " + ex.getMessage(),
                "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
}
 