package com.jlg.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idTeclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append('}');
        return sb.toString();
    }
    
    
}
