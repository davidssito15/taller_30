
package unach.trabajogrupal.vistas;
import unach.trabajogrupal.rnegocio.dao.*;
import unach.trabajogrupal.rnegocio.impl.*;
import unach.trabajogrupal.rnegocio.entidades.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FrmListaRegistro extends JInternalFrame{
    JLabel lblTitulo;
    JTable tabla;
    DefaultTableModel modelo;
    public FrmListaRegistro(){
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        this.setClosable(true);
        lblTitulo = new JLabel("Listado Registro");
        tabla= new JTable();
        this.add(lblTitulo, BorderLayout.NORTH);
        this.add(tabla, BorderLayout.CENTER);
        cargarTabla();
    }
        public void cargarTabla(){
        modelo= new DefaultTableModel();
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
        for(Registro est : lista){
            modelo.addRow(new Object[]{ est.getFecha(), est.getHora(),toString()});
        }
        tabla.setModel(modelo);
    }
       
}