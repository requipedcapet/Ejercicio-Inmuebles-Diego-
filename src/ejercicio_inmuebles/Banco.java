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
public class Banco {
    
    private Informe Informe1;
    public void setInforme1(Informe Informe1p)
    {
        this.Informe1=Informe1p;
    }
    public Informe getInforme1()
    {
        return Informe1;
    }
    
    
    private Cuenta_Bancaria Cuenta_Bancaria1;
    public void setCuenta_Bancaria1 (Cuenta_Bancaria cuenta_Bancaria1p)
    {
        this.Cuenta_Bancaria1=cuenta_Bancaria1p;    }
      

    public Cuenta_Bancaria getCuenta_Bancaria()
    {
      return Cuenta_Bancaria1;
      }
    
    
    private Listado_General listado_General1;
     public void setListado_General1(Listado_General listado_General1p)
     {
         this.listado_General1=listado_General1p;
     }
       
     public Listado_General getListado_General1()
     {
         return listado_General1;
     }
    
}

