
package unach.trabajogrupal.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


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
        //this.setClosable(true);
        pnlCentral= new JPanel();
        pnlPie= new JPanel();
        pnlCentral.setLayout(new GridLayout(10, 2, 5, 5));
        pnlPie.setLayout(new GridLayout(1,2,5,5));
        
        lblTitulo0 = new JLabel("Datos Estudiante");
        
        lblCodigo= new JLabel("Código:");
        lblNombre= new JLabel("Nombres:");
        lblPlaca= new JLabel("Direccion:");
        lblChofer= new JLabel("Ciudad:");      
        
        
        txtCodigo = new JTextField(2);
        txtNombre= new JTextField(2);
        txtPlaca= new JTextField(2);
        txtChofer= new JTextField(2);
        
        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlCentral.setBackground(Color.blue);
        
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
    }
    
    public static void main(String[] args) {
        FrmNuevoAutobus frmMenu= new FrmNuevoAutobus();
        frmMenu.setVisible(true);
//    } 
    

    }

}

