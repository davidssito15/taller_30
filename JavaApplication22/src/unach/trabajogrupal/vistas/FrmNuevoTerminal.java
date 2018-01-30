
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
public class FrmNuevoTerminal extends JFrame{
    
//     private int Cod_terminal;
//    private String Nombre;
//    private String Direccion;
//    private String Ciudad;
//    private String Telefono;
       
    JLabel lblCodigo;
    JLabel lblNombre;
    JLabel lblDireccion;
    JLabel lblCiudad;
    JLabel lblTelefono;
    JLabel lblTitulo0;
    
    JTextField txtCodigo;
    JTextField txtNombre;
    JTextField txtDireccion;
    JTextField txtCiudad;
    JTextField txtTelefono;    
  
    
   
    
    JButton btnLimpiar;
    JButton btnAceptar;
    
    JPanel pnlCentral;
    JPanel pnlPie;
    
    public FrmNuevoTerminal() {
        this.setSize(300, 300);
        setTitle("TERMINAL....");
	
        this.setLayout(new BorderLayout());
        //this.setClosable(true);
        pnlCentral= new JPanel();
        pnlPie= new JPanel();
        pnlCentral.setLayout(new GridLayout(10, 2, 5, 5));
        pnlPie.setLayout(new GridLayout(1,2,5,5));
        
        lblTitulo0 = new JLabel("Datos Estudiante");
        
        lblCodigo= new JLabel("Código:");
        lblNombre= new JLabel("Nombres:");
        lblDireccion= new JLabel("Direccion:");
        lblCiudad= new JLabel("Ciudad:");      
        lblTelefono= new JLabel("Teléfono:");
        
        txtCodigo = new JTextField(2);
        txtNombre= new JTextField(2);
        txtDireccion= new JTextField(2);
        txtCiudad= new JTextField(2);
        txtTelefono= new JTextField(2);
      
        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlCentral.setBackground(Color.green);
        
        pnlCentral.add(lblCodigo);
        pnlCentral.add(txtCodigo);
        pnlCentral.add(lblNombre);
        pnlCentral.add(txtNombre);
        pnlCentral.add(lblDireccion);
        pnlCentral.add(txtDireccion);
        pnlCentral.add(lblCiudad);
        pnlCentral.add(txtCiudad);
        pnlCentral.add(lblTelefono);
        pnlCentral.add(txtTelefono);
        
        
                
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
              //      btnAceptarActionListener(e);
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
        FrmNuevoTerminal frmMenu= new FrmNuevoTerminal();
        frmMenu.setVisible(true);
//    } 
//    public void cargarCursos(){
//        ICurso cursoDao = new CursoImpl();
//        try {
//            lstCurso = cursoDao.obtener();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this,"Error al cargar los cursos!!",
//                "Error"+e.getMessage(), JOptionPane.ERROR_MESSAGE);
//        }
//        
//    }
//    public void btnAceptarActionListener(ActionEvent e){
//        IEstudiante estudianteDao=new EstudianteImpl();
//        Estudiante estudiante =new Estudiante();
//
//        estudiante.setCodigo(Integer.parseInt(txtCodigo.getText()));
//        estudiante.setCedula(txtCedula.getText());
//        estudiante.setNombres(txtNombres.getText());
//        estudiante.setApellidos(txtApellidos.getText());
//        
//        DateFormat formatoFecha=new SimpleDateFormat("yyy-mm-dd");
//        try{
//            estudiante.setFecha_nac(formatoFecha.parse(txtFechaNac.getText()));
//            estudiante.setFecha_ing(formatoFecha.parse(txtFechaIng.getText()));
//        }catch(Exception ex){
//        JOptionPane.showMessageDialog(this,"Error en La fecha",
//                "error", JOptionPane.INFORMATION_MESSAGE);
//        }
//        
//        estudiante.setTelefono(txtTelefono.getText());
//        estudiante.setSexo(cmbSexo.getSelectedIndex()==0?"m":"f");
//        estudiante.setCurso((Curso)cmbCurso.getSelectedItem());
//        
//        try{
//            if(estudianteDao.insertar(estudiante)>0){
//                JOptionPane.showMessageDialog(this,"Guardado correctamente",
//                "transaccion", JOptionPane.INFORMATION_MESSAGE);
//            }else{
//                JOptionPane.showMessageDialog(this,"Error desconocido",
//                "error", JOptionPane.INFORMATION_MESSAGE);
//            }
//        }catch(Exception ex){
//             JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
//                    "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
}
 
    
}
