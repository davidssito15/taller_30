/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unach.trabajogrupal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import unach.trabajogrupal.rnegocio.dao.*;
import unach.trabajogrupal.rnegocio.entidades.*;
import unach.trabajogrupal.rnegocio.impl.*;


public class RegistroTest {

    public RegistroTest() {
    }
    
    @Test
    public void pruebageneral() throws Exception{
        IRegistro recDao=new RegistroImpl();
       
//TEST INSERTAR
//TEST INSERTAR

        int filas = 0;
        Autobus aut=new Autobus(1, "Patria", "abc123", "PEPE");
        Terminal nter = new Terminal(1, "QUITUMBE", "SUCRE", "QUITO","123456");
        Registro nRegistro=new Registro(aut, nter, "2017-01-01", "2018-01-01");
        try {
            filas = recDao.insertar(nRegistro);
            System.out.println("filas Insertadas:" + filas);
        } catch (Exception e) {
        }
        assertEquals(filas > 0, true);
        
//       
////TEST OBTENER POR CODIGO
//
//        Etiquetas_Publicaciones etiqPubli = new Etiquetas_Publicaciones();
//        try {
//            etiqPubli = etiqPublicDao.obtener(1,1);
//            System.out.println(etiqPubli.getEtiqueta().getId()+ "    " + etiqPubli.getPublicacion().getId()+ "    " + etiqPubli.getCreado()+ "    " + etiqPubli.getActualizado()+ "\n\n");
//        } catch (Exception e) {
//        }
//       assertEquals(etiqPubli != null, true);
        
//TEST LISTADO
        
        List<Registro> regis = new ArrayList<>();
        try {
            regis = recDao.obtener();
            for (Registro etiPubli : regis) {
                System.out.println(etiPubli.getAutobus().getCod_bus()+ "\t\t\t" + etiPubli.getTerminal().getCod_terminal()+ "\t\t\t" + etiPubli.getFecha()+ "\t\t\t" + etiPubli.getHora());
            }
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }
        assertTrue(regis.size() > 0);
    }
}
    
//        //              INSERTAR
//        int filasAfectadas =0;
//        IRegistro registroDao = new RegistroImpl();
//        IAutobus autobusDao = new AutobusImpl();
//        Autobus autobus = autobusDao.obtener(2);          
//        ITerminal terminalDao = new TerminalImpl();
//        Terminal terminal = terminalDao.obtener(2);        
//        Registro registro = new Registro(autobus,terminal,"enero","4am");
//        try{
//            filasAfectadas = registroDao.insertar(registro);
//            System.out.println("Registro ingresado!!!\n");
//        }catch(Exception e){
//            System.out.println("Error:.. "+e.getMessage());
//        }
//        assertEquals(filasAfectadas>0, true);
//        
//        //              LISTADO DE PEdido
//        List<Registro> lista = new ArrayList<>();
//        try {
//            lista = registroDao.obtener();
//            for (Registro pe:lista){
//                System.out.println("Codigo del bus :"+pe.getAutobus().getCod_bus());
//                System.out.println("Codigo del terminal Terrestre :"+pe.getTerminal().getCod_terminal());
//                System.out.println("Fecha Llegada  :"+pe.getFecha());
//                System.out.println("Hora  :"+pe.getHora());
//            }
//        } catch (Exception e) {
//            System.out.println("Error:" + e.getMessage());
//        }
//        assertTrue(lista.size()>0);
//    }

   