/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unach.trabajogrupal;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import unach.trabajogrupal.rnegocio.dao.IAutobus;
import unach.trabajogrupal.rnegocio.entidades.Autobus;
import unach.trabajogrupal.rnegocio.impl.AutobusImpl;

public class AutobusTest {

    public AutobusTest() {
    }
     @Test
    public void control(){
        //              INSERTAR
        int filasAfectadas =0;
        IAutobus autobusDao = new AutobusImpl();
        Autobus autobus = new Autobus(1,"Patria","FRS756","Franco");
        try{
            filasAfectadas = autobusDao.insertar(autobus);
            System.out.println("Autobus ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE AUTOBUSES
        List<Autobus> lista = new ArrayList<>();
        try {
            lista = autobusDao.obtener();
            for (Autobus es:lista){
                System.out.println("Datos de la Unidad de Transporte");
                System.out.println("Matricula :"+es.getCod_bus());
                System.out.println("Nombre de la Compania :"+es.getNombreCompania());
                System.out.println("Numero de la Placa              :"+es.getN_placa());
                System.out.println("Nombres del Chofer :"+es.getNom_Chofer());
            }
        
      } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }
}
