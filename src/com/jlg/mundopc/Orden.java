package com.jlg.mundopc;

public class Orden {
    private int idOrden;
    private static int contadorOrden;
    private Computadora computadoras[];
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        idOrden = ++Orden.contadorOrden;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];//inicializamos el arreglo colocando la cantidad de elementos que tendrá
    }
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
        }
        
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Especifique la marca del monitor: ");
        String marcaMonitor = sc.nextLine();
        System.out.println("Especifique el tamaño del monitor: ");
        double tamañoMonitor = sc.nextDouble();
        Monitor monitor = new Monitor(marcaMonitor, tamañoMonitor);
        System.out.println("Especifique marca del ratón: ");
        String marcaRaton = sc.nextLine();
        System.out.println("Especifique el tipo de entrada del ratón: ");
        String tipoEntradaRaton = sc.nextLine();
        Raton raton = new Raton(marcaRaton, tipoEntradaRaton);
        System.out.println("Especifique marca del teclado: ");
        String marcaTeclado = sc.nextLine();
        System.out.println("Especifique tipo de entrada del teclado: ");
        String tipoEntradaTeclado = sc.nextLine();
        Teclado teclado = new Teclado(marcaTeclado, tipoEntradaTeclado);
        this.computadoras[Orden.contadorComputadoras] = new Computadora(nombre, monitor, teclado, raton);
        ++contadorComputadoras;*/
        }
    
    public void mostrarOrden(){
        System.out.println("Orden N°: " + this.idOrden);
        System.out.println("Computadoras de la orden: " + this.contadorComputadoras);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
            
        }
    }
}

