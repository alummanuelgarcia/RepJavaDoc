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

   /** Constructor sin argumentos
    */
    public CCuenta ()
    {
    }
   /**
    * Constructor
    @param nom Nombre del titular de la cuenta seleccionado
    @param cue Cuenta de banco seleccionado
    @param sal Salario de la cuenta seleccionado
    @param tipo Tipo de interés que tiene la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  
    /**
     * Metodo asignar nombre
    @param nom Nombre del titular
    */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
    * Metodo que devuelve el nombre del titular
    @return <code>nombre</code> nombre del titular
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * Metodo que me decuelve el saldo disponible
    @return <code>saldo</code> saldo disponible
    */
     public double estado ()
    {
        return saldo;
    }

    /**
     Metodo para ingresar una cantidad de dinero
     @param cantidad cantidad que el cliente va a depositar
     @throws Exception No se introducen cantidades en negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
     Metodo para retirar una cantidad de dinero
     @param cantidad La cantidad que el cliente va a retirar
     @throws Exception Evita que se retiren cantidades negativas ni superiores al saldo
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /** Devuelve el numero de cuenta
    @return <code>cuenta</code> El numero de la cuenta bancaria
    */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
     Asignamos el numero de la cuenta bancaria
     @param cuenta La cuenta que teniamos principalmente
    */
 
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }
  
  /**
     Asignamos el valor al saldo 
     @param saldo Saldo actual
    */  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

    /**
     Obtenemos el tipo de interés de la cuenta bancaria
     @return <code>tipoInterés</code> Porcentaje de interes. 
    */  
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
     Asignamos el valor del tipo de interés 
     @param tipoInterés Porcentaje de interes 
    */  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
