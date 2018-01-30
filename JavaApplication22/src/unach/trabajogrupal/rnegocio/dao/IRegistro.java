/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unach.trabajogrupal.rnegocio.dao;

import java.util.List;
import unach.trabajogrupal.rnegocio.entidades.Registro;

/**
 *
 * @author Segovia
 */
public interface IRegistro {
   public int insertar(Registro registro) throws Exception;
   public List<Registro> obtener() throws Exception;
    
}
