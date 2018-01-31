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
import unach.trabajogrupal.rnegocio.dao.ITerminal;
import unach.trabajogrupal.rnegocio.entidades.Terminal;
import unach.trabajogrupal.rnegocio.impl.TerminalImpl;

public class TerminalTest {

    public TerminalTest() {
    }
     @Test
    public void control(){
        //              INSERTAR
 
        int filasAfectadas =0;
        ITerminal terminalDao = new TerminalImpl();
        Terminal terminal = new Terminal(1,"Quitumbe"," Sucre","Quito","3988200");
        try{
            filasAfectadas = terminalDao.insertar(terminal);
            System.out.println("Terminal ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE TERMINALES TERRESTRES
        List<Terminal> lista = new ArrayList<>();
        try {
            lista = terminalDao.obtener();
            for (Terminal es:lista){
                System.out.println("Datos del Terminal Terrestre");
                System.out.println("Codigo :"+es.getCod_terminal());
                System.out.println("Nombre :"+es.getNombre());
                System.out.println("Direccion              :"+es.getDireccion());
                System.out.println("Ciudad :"+es.getCiudad());
                System.out.println("Telefono :"+es.getTelefono());
            }
        
      } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }
}
