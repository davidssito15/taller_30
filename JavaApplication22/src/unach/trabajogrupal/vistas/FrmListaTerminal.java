
package unach.trabajogrupal.vistas;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import unach.trabajogrupal.rnegocio.dao.*;
import unach.trabajogrupal.rnegocio.impl.*;
import unach.trabajogrupal.rnegocio.entidades.*;
import java.util.ArrayList;
import java.util.List;

public class FrmListaTerminal extends JInternalFrame{
     JLabel lblTitulo;
    JTable tabla;
    DefaultTableModel modelo;
    JScrollPane jacTabla;
    
    public FrmListaTerminal(){    
        this.setSize(800, 600);
        setTitle("TERMINAL....");
        this.setLayout(new BorderLayout());
        this.setClosable(true);
        lblTitulo=new JLabel("Listado de TERMINAL.");
        tabla=new JTable();
        jacTabla=new JScrollPane(tabla);
        this.add(lblTitulo,BorderLayout.NORTH);
        this.add(jacTabla,BorderLayout.CENTER);
        cargarTabla();
        
    }
    public void cargarTabla(){
           modelo=new DefaultTableModel();
           modelo.addColumn("Codigo");
           modelo.addColumn("Nombre");
           modelo.addColumn("Direccion");
           modelo.addColumn("Ciudad");
           modelo.addColumn("Telefono");
//           
          
           List<Terminal> lista=new ArrayList<>();
           try{
               ITerminal terminalDao=new TerminalImpl();
               lista=terminalDao.obtener();
           }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage(),"Error",
                JOptionPane.ERROR_MESSAGE);
    }
            
           for(Terminal est:lista){
              modelo.addRow(new Object[]{est.getCod_terminal(),
              est.getNombre(),est.getDireccion(),est.getCiudad(),est.getTelefono()});
      
    }
           tabla.setModel(modelo);
    }
    
}
