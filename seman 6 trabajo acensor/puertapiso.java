
public class PuertaPiso {

    private int numeroPiso;
    private boolean abierta;
    private boolean obstaculo;

    // Constructor
    public PuertaPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
        this.abierta = false;
        this.obstaculo = false;
    }

    // Abrir puerta del piso
    public void abrir() {
        abierta = true;
        System.out.println("La puerta del piso " + numeroPiso + " está abierta.");
    }

    // Cerrar puerta del piso
    public void cerrar() {
        if (obstaculo) {
            System.out.println("Alerta: Obstáculo detectado en el piso " + numeroPiso);
            return;
        }

        abierta = false;
        System.out.println("La puerta del piso " + numeroPiso + " está cerrada.");
    }

    // Detectar obstáculos
    public void detectarObstaculo(boolean detectado) {
        obstaculo = detectado;

        if (obstaculo) {
            System.out.println("Sensor: Obstáculo detectado en el piso " + numeroPiso);
        } else {
            System.out.println("Piso " + numeroPiso + ": No hay obstáculos.");
        }
    }

    // Consultar estado de la puerta
    public boolean estaAbierta() {
        return abierta;
    }

    // Obtener número del piso
    public int getNumeroPiso() {
        return numeroPiso;
    }
}
