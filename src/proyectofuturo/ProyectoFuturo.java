package proyectofuturo;

public class ProyectoFuturo {
    public static void main(String[] args) {
        System.out.println("Estudiante: " + args[0]);
        System.out.println("Módulos matriculados: " + args[1]);
        System.out.println("Horas de estudio: " + args[2]);
        String respuesta = veredicto(args[1], args[2]);
        System.out.println("Criterio: " + respuesta);
    }

    public static String veredicto(String valor1, String valor2) {
        String criterio;
        if (Integer.valueOf(valor2) > Integer.valueOf(valor1)) {
            criterio = "¡Fantástico! Seguro que lo apruebas todo.";
        } else if (Integer.valueOf(valor2) >= 5) {
            criterio = "No está mal, aunque deberías estudiar algo más.";
        } else {
            criterio = "Necesitas aumentar tus horas de estudio.";
        }

        return criterio;
    }
}