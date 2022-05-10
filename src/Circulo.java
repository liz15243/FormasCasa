public class Circulo extends Formas{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;


    }


    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double obtenerPerimetro() {
        return Math.PI*radio*2;
    }
}
