
public class PuertaAscensor {

    private boolean abierta;
    private boolean obstaculo;
    private boolean mantenerAbierta;

    // Constructor
    public PuertaAscensor() {
        this.abierta = false;
        this.obstaculo = false;
        this.mantenerAbierta = false;
    }

    // Abrir puerta del ascensor
    public void abrir() {
        abierta = true;
        System.out.println("La puerta del ascensor está abierta.");
    }

    // Cerrar puerta con sensor de seguridad
    public void cerrar() {
        if (obstaculo) {
            System.out.println("Alerta: Hay un obstáculo. No se puede cerrar la puerta.");
            return;
        }

        if (mantenerAbierta) {
            System.out.println("La puerta permanecerá abierta.");
            return;
        }

        abierta = false;
        System.out.println("La puerta del ascensor está cerrada.");
    }

    // Detectar obstáculos
    public void detectarObstaculo(boolean detectado) {
        obstaculo = detectado;

        if (obstaculo) {
            System.out.println("Sensor activado: Obstáculo detectado.");
        } else {
            System.out.println("No hay obstáculos.");
        }
    }

    // Mantener puerta abierta
    public void mantenerPuertaAbierta(boolean estado) {
        mantenerAbierta = estado;

        if (estado) {
            abrir();
            System.out.println("Función mantener puerta abierta activada.");
        } else {
            System.out.println("Función mantener puerta abierta desactivada.");
        }
    }

    // Consultar estado
    public boolean estaAbierta() {
        return abierta;
    }

    public boolean hayObstaculo() {
        return obstaculo;
    }
}
