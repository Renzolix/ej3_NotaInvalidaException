public class Evaluacion {
    private double nota;

    public void asignarNota(double nota) throws NotaInvalidaException {
        if (nota < 0.0 || nota > 10.0) {
            throw new NotaInvalidaException("La nota asignada está fuera del rango válido [0.0, 10.0]", nota);
        }
        this.nota = nota;
        System.out.println("Nota asignada correctamente: " + this.nota);
    }

    public static void main(String[] args) {
        Evaluacion eval = new Evaluacion();

        try {
            System.out.println("Intentando asignar nota 11.5...");
            eval.asignarNota(11.5);
        } catch (NotaInvalidaException e) {
            System.err.println("Excepción capturada: " + e.getMessage());
            System.err.println("Valor recibido rechazado: " + e.getNotaErronea());
        }
    }
}