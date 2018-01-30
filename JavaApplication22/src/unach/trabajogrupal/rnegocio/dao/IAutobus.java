/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unach.trabajogrupal.rnegocio.dao;

import java.util.List;
import unach.trabajogrupal.rnegocio.entidades.Autobus;

/**
 *
 * @author Segovia
 */
public interface IAutobus {
     public int insertar(Autobus autobus) throws Exception;
     public List<Autobus> obtener() throws Exception;
         public Autobus obtener(int Cod_bus) throws Exception;
}
