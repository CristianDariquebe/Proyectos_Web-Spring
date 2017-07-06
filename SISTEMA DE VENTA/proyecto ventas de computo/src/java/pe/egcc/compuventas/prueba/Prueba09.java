/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.compuventas.prueba;

import java.util.List;
import pe.egcc.compuventas.model.Producto;
import pe.egcc.compuventas.service.espec.ProductoServiceEspec;
import pe.egcc.compuventas.service.impl.ProductoServiceImpl;

/**
 *
 * @author Carlos
 */
public class Prueba09 {
    public static void main(String[] args) {
         try {
      // Datos
      Producto bean = new Producto();
      bean.setNombre("");
      // Proceso
      ProductoServiceEspec service;
      service = new ProductoServiceImpl();
      List<Producto> lista = service.leer(bean);
      // Reporte
      for (Producto o : lista) {
        System.out.println(o.getIdprod()+ " | " 
                + o.getIdcat()+ " | " + o.getNombre());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    }
    
}
