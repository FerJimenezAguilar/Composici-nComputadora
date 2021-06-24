/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Fernando
 */
public class Computadora {
    private String marca;
    private String modelo;
    private CPU CPU;
    private Teclado Teclado;
    private Mouse Mouse;
    private Monitor Monitor;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, CPU CPU, Teclado Teclado, Mouse Mouse, Monitor Monitor) {
        this.marca = marca;
        this.modelo = modelo;
        this.CPU = CPU;
        this.Teclado = Teclado;
        this.Mouse = Mouse;
        this.Monitor = Monitor;
    }

    public Monitor getMonitor() {
        return Monitor;
    }

    public void setMonitor(Monitor Monitor) {
        this.Monitor = Monitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CPU getCPU() {
        return CPU;
    }

    public void setCPU(CPU CPU) {
        this.CPU = CPU;
    }

    public Teclado getTeclado() {
        return Teclado;
    }

    public void setTeclado(Teclado Teclado) {
        this.Teclado = Teclado;
    }

    public Mouse getMouse() {
        return Mouse;
    }

    public void setMouse(Mouse Mouse) {
        this.Mouse = Mouse;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", CPU=" + CPU + ", Teclado=" + Teclado + ", Mouse=" + Mouse + ", Monitor=" + Monitor + '}';
    }
    
    
    
    
}
