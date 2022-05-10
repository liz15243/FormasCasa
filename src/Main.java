public class Main {
    //ToDo Clase padre Figura, sera abstracta
    //color string, relleno de booleano
    //constructor para los dos parametros
    //getters y setters
    //obtenerArea -> abstracto, que retorne doble
    //obtenerPerimetro -> abstracto, que retorne doble

    //ToDo clase Circulo
    //radio doble
    //constructor hereda suoer e incluye el radio
    // get y set
    //implementar obtenerArea
    //implementar obtenerPerimetro

    //ToDo clase Rectangulo
    //ancho doble
    //alto doble
    //constructor -> hereda  super, alto,ancho
    //get y set
    //implementar obtenerArea
    //implementar obtenerPerimetro

    public static void main(String[] args) {
        Circulo circulo = new Circulo("Amarillo",true,4.5);
        System.out.println(circulo.obtenerArea());
        System.out.println(circulo.obtenerPerimetro());

        Rectangulo rectangulo = new Rectangulo("Azul",false,5,10);
        System.out.println(rectangulo.obtenerPerimetro());
        System.out.println(rectangulo.obtenerPerimetro());
    }

}

