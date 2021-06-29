/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class Animal {

    private int numeroPatas;
    private String peso;
    private int edad;

    public Animal() {
    }

    public Animal(int numeroPatas, String peso, int edad) {
        this.numeroPatas = numeroPatas;
        this.peso = peso;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Herencia{" + "numeroPatas=" + numeroPatas + ", peso=" + peso + ", edad=" + edad + '}';
    }

    public static void main(String[] args) {
    
        Animal animal1 = new Animal(4, "16 kilos", 6);
        System.out.println(animal1);
        
        Perro perro1= new Perro("Firulais", "Pastor", "ladrido", "corte de pelo", 4, "25 kilos", 5);
        System.out.println(perro1);
    
        Gato gato1= new Gato("Pepe", "Persa", "maullido", "Revisión", 4, "5 kilos", 3);
        System.out.println(gato1);
    }

}
