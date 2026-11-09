public class NotaInvalidaException extends Exception {
    private double notaErronea;

    public NotaInvalidaException(String mensaje, double notaErronea) {
        super(mensaje);
        this.notaErronea = notaErronea;
    }

    public double getNotaErronea() {
        return notaErronea;
    }
}