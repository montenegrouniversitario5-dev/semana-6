public class BotonAscensor extends Boton {
    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        super("ASCENSOR - Piso " + pisoDestino);
        this.pisoDestino = pisoDestino;
    }

    @Override
    public void presionar() {
        super.presionar(); // Ejecuta la luz y el sonido
        System.out.println("   -> Destino fijado internamente hacia el Piso " + pisoDestino);
    }

    public int getPisoDestino() {
        return pisoDestino;
    }
}