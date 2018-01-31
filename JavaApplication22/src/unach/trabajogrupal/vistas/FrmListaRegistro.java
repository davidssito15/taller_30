
package unach.trabajogrupal.vistas;
import unach.trabajogrupal.rnegocio.dao.*;
import unach.trabajogrupal.rnegocio.impl.*;
import unach.trabajogrupal.rnegocio.entidades.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FrmListaRegistro extends JInternalFrame{
    JLabel lblTitulo;
    JTable tabla;
    DefaultTableModel modelo;
    JScrollPane jscTabla;
    
    public FrmListaRegistro(){
        this.setSize(800, 300);
        this.setLayout(new BorderLayout());
        this.setClosable(true);
        setTitle("REGISTRO....");
        lblTitulo = new JLabel("                                          Listado de Registro...");
        
        tabla=new JTable();
        jscTabla=new JScrollPane(tabla);
        this.add(lblTitulo,BorderLayout.NORTH);
        this.add(jscTabla,BorderLayout.CENTER);
        cargarTabla();
        
    }
        public void cargarTabla(){
        modelo= new DefaultTableModel();
        
        modelo.addColumn("Autobus");
        modelo.addColumn("Terminal");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        
        List<Registro> lista = new ArrayList<>();
        try{
            IRegistro registroDao = new RegistroImpl();
            lista = registroDao.obtener();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        for(Registro r : lista){
            modelo.addRow(new Object[]{ r.getAutobus().getCod_bus(),
        r.getTerminal().getCod_terminal(),r.getFecha(),r.getHora()});
        }
        tabla.setModel(modelo);
    }
       
}