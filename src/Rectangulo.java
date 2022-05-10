public class Rectangulo extends Formas{
    private double ancho;
    private double altura;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo(String color, boolean relleno, double ancho, double altura) {
        super(color, relleno);
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return ancho * altura;
    }

    @Override
    public double obtenerPerimetro() {
        return ancho+altura+ancho+altura;
    }
}
