package com.jlg.mundopc;

public class Computadora {
    private int idComputadora;
    private static int contadorComputadora;
    private String nombre;
    private Teclado teclado;
    private Raton raton;
    private Monitor monitor;
    
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadora;
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{");
        sb.append("idComputadora=").append(idComputadora);
        sb.append(", nombre=").append(nombre);
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        sb.append(", monitor=").append(monitor);
        sb.append('}');
        return sb.toString();
    }
    
    
}
