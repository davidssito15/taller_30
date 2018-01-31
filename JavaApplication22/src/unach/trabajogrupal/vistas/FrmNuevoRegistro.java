package unach.trabajogrupal.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
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
    List<Autobus> lstAutobus;
    JComboBox<Autobus> cmbAutobus;
    
    List<Terminal> lstTerminal;
    JComboBox<Terminal> cmbTerminal;
    
    JLabel lblAutobus;
    JLabel lblTerminal;
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
        this.setSize(300, 300);
        setTitle("REGISTRO....");
	
        this.setLayout(new BorderLayout());
        this.setClosable(true);
        pnlCentral= new JPanel();
        pnlPie= new JPanel();
        pnlCentral.setLayout(new GridLayout(10, 2, 5, 5));
        pnlPie.setLayout(new GridLayout(1,2,5,5));
        
        lblTitulo0 = new JLabel("Datos del Registro");
        
        lblAutobus= new JLabel("Autobus:");
        lblTerminal= new JLabel("Terminal:");
        lblFecha= new JLabel("Fecha:");
        lblHora= new JLabel("Hora:");
        
        cargarAutobus();
        cmbAutobus= new JComboBox(lstAutobus.toArray());
        cargarTerminal();
        cmbTerminal= new JComboBox(lstTerminal.toArray());
        txtFecha = new JTextField(2);
        txtHora= new JTextField(2);
        
        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlCentral.setBackground(Color.CYAN);
        
        pnlCentral.add(lblAutobus);
        pnlCentral.add(cmbAutobus);
        pnlCentral.add(lblTerminal);
        pnlCentral.add(cmbTerminal);
        pnlCentral.add(lblFecha);
        pnlCentral.add(txtFecha);
        pnlCentral.add(lblHora);
        pnlCentral.add(txtHora);
        
        
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
        this.setClosable(true);
    }
    
    public static void main(String[] args) {
        FrmNuevoRegistro frm= new FrmNuevoRegistro();
        frm.setVisible(true);
    } 
    
    public void cargarAutobus(){
        IAutobus autobusDao = new AutobusImpl();
        try {
            lstAutobus = autobusDao.obtener();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Error al cargar los Registros!!",
                "Error"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    public void cargarTerminal(){
        ITerminal terminalDao = new TerminalImpl();
        try {
            lstTerminal = terminalDao.obtener();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error al cargar el Terminal!!",
                "Error"+e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void btnAceptarActionListener(ActionEvent e){
        IRegistro registroDao=new RegistroImpl();
        Registro nregistro =new Registro();

        nregistro.setAutobus((Autobus)cmbAutobus.getSelectedItem());
        nregistro.setTerminal((Terminal)cmbTerminal.getSelectedItem());
        nregistro.setFecha(txtFecha.getText());
        nregistro.setHora(txtHora.getText());
        
        
        try{
            if(registroDao.insertar(nregistro)>0){
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
 