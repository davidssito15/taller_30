
package unach.trabajogrupal.vistas;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import unach.trabajogrupal.rnegocio.dao.*;
import unach.trabajogrupal.rnegocio.impl.*;
import unach.trabajogrupal.rnegocio.entidades.*;
import java.util.ArrayList;
import java.util.List;
public class FrmListaAutobus  extends JInternalFrame{
    
    JLabel lblTitulo;
    JTable tabla;
    DefaultTableModel modelo;
    JScrollPane jacTabla;

    public FrmListaAutobus() {
         this.setSize(800, 300);
        setTitle("AUTOBUS....");
        this.setLayout(new BorderLayout());
        this.setClosable(true);
        lblTitulo=new JLabel("                                                  Listado del Autobus....");
        tabla=new JTable();
        jacTabla=new JScrollPane(tabla);
        this.add(lblTitulo,BorderLayout.NORTH);
        this.add(jacTabla,BorderLayout.CENTER);
        cargarTabla();
        
    }
    
    public void cargarTabla(){
           modelo=new DefaultTableModel();
           modelo.addColumn("Codigo");
           modelo.addColumn("Nombre de la compania");
           modelo.addColumn("Placa");
           modelo.addColumn("Chofer");
           
//           
          
           List<Autobus> lista=new ArrayList<>();
           try{
               IAutobus autobusDao=new AutobusImpl();
               lista=autobusDao.obtener();
           }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage(),"Error",
                JOptionPane.ERROR_MESSAGE);
    }
            
           for(Autobus est:lista){
              modelo.addRow(new Object[]{est.getCod_bus(),
              est.getNombreCompania(),est.getN_placa(),est.getNom_Chofer()});
      
    }
           tabla.setModel(modelo);
    }
    
}
