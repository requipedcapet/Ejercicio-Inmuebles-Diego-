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
public class Cuenta_Bancaria {
    private String saldo;
    private String deudor;
    private String fecha;
    
    
    private Listado_General listado_General1;
    public void setListado_General(Listado_General listado_General1p)
    {
        this.listado_General1=listado_General1p;
    }
            public Listado_General getListado_General1()
            {
                return listado_General1;
            }


   private Informe Informe1;
   public void setInforme1(Informe Informe1p)
   {
       this.Informe1=Informe1p;
   }

   public Informe getInforme1()
   {
       return Informe1;
   }


}