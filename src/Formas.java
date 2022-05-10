public abstract class Formas {
    protected String color;
    protected boolean relleno;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public Formas(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public abstract double obtenerArea();

    public abstract double obtenerPerimetro();

}

