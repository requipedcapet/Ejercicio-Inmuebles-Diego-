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
public class Recibo {
    private String numeroRecibo;
    private String fechaEmision;
    private String rentaAgua;
    private String rentaLuz;
    private String ipcAnual;
    private String porteria;
    private String iva;
    private String covrado;
    
  
    private Secretaria Secretaria1;
    public void setSecretaria1(Secretaria Secretaria1p)
    {
        this.Secretaria1=Secretaria1p;
    }
            
    public Secretaria getSecretaria1()
    {
        return Secretaria1;
    }
            
    
    
    private Listado_General Listado_General1;
    public void setListado_General1(Listado_General Listado_General1p)
    {
        this.Listado_General1=Listado_General1p;
    }
    public Listado_General getListado_General()
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

