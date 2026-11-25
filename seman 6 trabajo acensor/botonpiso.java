
public class BotonPiso {

    // Atributos privados
    private int numeroPiso;
    private String direccion;
    private boolean iluminado;
    private boolean funcionando;

    // Constructor
    public BotonPiso(int numeroPiso, String direccion) {
        this.numeroPiso = numeroPiso;
        this.direccion = direccion;
        this.iluminado = false;
        this.funcionando = true;
    }

    // Presionar boton para solicitar el ascensor
    public void presionar() {

        if (!funcionando) {
            System.out.println("Error: El boton del piso "
                    + numeroPiso + " no funciona.");
            return;
        }

        iluminado = true;

        System.out.println("Solicitud registrada en el piso "
                + numeroPiso);

        System.out.println("Direccion solicitada: "
                + direccion);

        System.out.println("Indicador luminoso encendido.");

        System.out.println("Sonido: Solicitud recibida correctamente.");
    }

    // Apagar indicador luminoso
    public void apagarIndicador() {
        iluminado = false;
        System.out.println("Indicador del piso "
                + numeroPiso + " apagado.");
    }

    // Simular falla del boton
    public void detectarFalla() {
        funcionando = false;
        iluminado = false;

        System.out.println("ALERTA: Falla detectada en el boton del piso "
                + numeroPiso);

        System.out.println("Notificar al equipo de mantenimiento.");
    }

    // Reparar boton
    public void reparar() {
        funcionando = true;
        System.out.println("El boton del piso "
                + numeroPiso + " ha sido reparado.");
    }

    // Consultar estado del boton
    public boolean estaIluminado() {
        return iluminado;
    }

    public boolean estaFuncionando() {
        return funcionando;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public String getDireccion() {
        return direccion;
    }
}
