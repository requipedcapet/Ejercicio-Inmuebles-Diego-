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
public class Movimiento_Bancario {
    
    
            
            private Listado_General Listado_Genral1;
            public void setListado_General1(Listado_General Listado_General1p)
            {
                this.Listado_Genral1=Listado_General1p;
                        
                        
            }
             public Listado_General getListado_General()
             {
                 return Listado_Genral1;
             }

             
             
             
             private Banco Banco1;
             public void setBanco1 (Banco Banco1p)
             {
                 this.Banco1=Banco1p;
             }
             
             public Banco getBanco1()
             {
                 return Banco1;
             }
             
             
             
             
             
}


