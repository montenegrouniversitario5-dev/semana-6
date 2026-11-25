
public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("     SISTEMA DE CONTROL DE ASCENSORES");
        System.out.println("======================================");

        // Crear el sistema con 5 pisos
        SistemaControl sistema = new SistemaControl(5);

        System.out.println("\n[SISTEMA] Ascensor iniciado correctamente.");

        // Registrar solicitudes de los pisos
        System.out.println("\n========== SOLICITUDES ==========");

        sistema.solicitarAscensor(2, "SUBIDA");
        sistema.solicitarAscensor(4, "BAJADA");
        sistema.solicitarAscensor(3, "SUBIDA");

        // Procesar todas las solicitudes
        System.out.println("\n========== MOVIMIENTO ==========");

        sistema.procesarSolicitudes();

        // Registrar nuevas solicitudes
        System.out.println("\n========== NUEVAS SOLICITUDES ==========");

        sistema.solicitarAscensor(5, "BAJADA");
        sistema.solicitarAscensor(1, "SUBIDA");

        // Procesar las nuevas solicitudes
        sistema.procesarSolicitudes();

        // Simular una falla
        System.out.println("\n========== PRUEBA DE SEGURIDAD ==========");

        sistema.reportarFalla(
            "Puerta del ascensor",
            "Se detectó una posible falla en el sistema de puertas."
        );

        // Mostrar reporte de mantenimiento
        System.out.println("\n========== MANTENIMIENTO ==========");

        sistema.mostrarReporteMantenimiento();

        System.out.println("\n======================================");
        System.out.println("       FIN DE LA SIMULACIÓN");
        System.out.println("======================================");
    }
}
