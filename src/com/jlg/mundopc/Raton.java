package com.jlg.mundopc;

public class Raton extends DispositivoEntrada{
    private int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append('}');
        return sb.toString();
    }
    
    
}
