/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unach.trabajogrupal.rnegocio.dao;

import java.util.ArrayList;
import java.util.List;
import unach.trabajogrupal.rnegocio.entidades.Terminal;

/**
 *
 * @author Segovia
 */
public interface ITerminal {
      public int insertar(Terminal terminal) throws Exception;
     public List<Terminal> obtener() throws Exception;
         public Terminal obtener(int cod_terminal) throws Exception;
}
