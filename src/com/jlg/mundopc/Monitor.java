package com.jlg.mundopc;

public class Monitor {

    public static int getContadorMonitor() {
        return contadorMonitor;
    }

    public static void setContadorMonitor(int aContadorMonitor) {
        contadorMonitor = aContadorMonitor;
    }
    private int idMonitor;
    private static int contadorMonitor;
    private double tamaño;
    private String nombre;
    
    private Monitor(){
        idMonitor = ++Monitor.contadorMonitor;
    }
    
    public Monitor(String nombre, double tamaño){
        this();
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", tama\u00f1o=").append(tamaño);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
