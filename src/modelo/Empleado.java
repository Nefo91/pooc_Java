/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Dell Gaming
 */
public class Empleado extends Personas {
    private String cod_emp,puesto;

    public Empleado(){}
    public Empleado(String cod_emp, String puesto, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.cod_emp = cod_emp;
        this.puesto = puesto;
    }

    public String getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(String cod_emp) {
        this.cod_emp = cod_emp;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public void agregar(){
    System.out.println("Codigo Empleado:" + getCod_emp());
    System.out.println("Puesto:" + getPuesto());
    System.out.println("Nombres:" + getNombres());
    System.out.println("Apellidos:" + getApellidos());
    System.out.println("Direccion:" + getDireccion());
    System.out.println("Telefono:" + getTelefono());
    System.out.println("Fecha Nacimiento:" + getFecha_nacimiento());
    System.out.println("__________________________________________");
    
    }
  
    
}
