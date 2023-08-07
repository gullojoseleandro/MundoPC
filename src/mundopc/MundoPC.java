package mundopc;
import com.jlg.mundopc.Computadora;
import com.jlg.mundopc.Monitor;
import com.jlg.mundopc.Orden;
import com.jlg.mundopc.Raton;
import com.jlg.mundopc.Teclado;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 19);
        Teclado tecladoHP = new Teclado("USB", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        Orden ordenUno = new Orden();
        ordenUno.agregarComputadora(computadoraHP);
        Computadora computadoraGamer = new Computadora("Gamer", monitorHP, tecladoHP, ratonHP);
        ordenUno.agregarComputadora(computadoraGamer);
        ordenUno.mostrarOrden();
    }
}
