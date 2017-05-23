/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_inmuebles;

/**
 *
 * @author Familia
 */
public class Inquilino {
    
    private String tipoGarantia;
    private String nombre;
    private String documento;
    private String edad;
    private String sexo;
    private String fotografia;
    
    
    private Listado_General Listado_General1;
    public void setListado_General1(Listado_General Listado_General1p)
    {
        this.Listado_General1=Listado_General1p;
    }
     public Listado_General getListado_General1()
     {
         return Listado_General1;
     }
    
     
     private Inmuebles Inmuebles1;
     public void setInmuebles1(Inmuebles Inmuebles1p)
     {
         this.Inmuebles1=Inmuebles1p;
     }
      public Inmuebles getInmuebles1()
      {
          return Inmuebles1;
      }
     
     
}
