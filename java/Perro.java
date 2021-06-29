


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class Perro extends Animal {
    private String nombre; 
    private String raza;
    private String sonido;
    private String consulta;

    public Perro() {
    }

    public Perro(String nombre, String raza, String sonido, String consulta) {
        this.nombre = nombre;
        this.raza = raza;
        this.sonido = sonido;
        this.consulta = consulta;
    }

    public Perro(String nombre, String raza, String sonido, String consulta, int numeroPatas, String peso, int edad) {
        super(numeroPatas, peso, edad);
        this.nombre = nombre;
        this.raza = raza;
        this.sonido = sonido;
        this.consulta = consulta;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", sonido=" + sonido + ", consulta=" + consulta+'}';
    }
    
 
   
}
