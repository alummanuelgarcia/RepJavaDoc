/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;
/**
 * 
 * @author manuel
 */

public class CCuenta {


  
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

   /* Constructor sin argumentos
    */
    public CCuenta ()
    {
    }
   /*
    @param nom Nombre del titular de la cuenta
    @param cue Cuenta de banco
    @param sal Salario de la cuenta
    @param tipo Tipo de interés que tiene la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  
    /*
    @param nom Asignamos un nombre
    */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /*
    @return nombre Obtenemos el nombre
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /*
    @return saldo Nos muestra el estado del saldo
    */
     public double estado ()
    {
        return saldo;
    }

    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 
  public double getTipoInterés() {
    return tipoInterés;
  }

  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
