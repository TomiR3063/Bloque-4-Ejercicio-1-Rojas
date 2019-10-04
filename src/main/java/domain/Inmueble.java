package domain;

public class Inmueble {
    private double unosMetrosCuadrados;
    private int unaCantidadDeAmbientes;
    private Zona zona;
    private Operacion operacion;
    private int precio;

    public Inmueble(double unosMetrosCuadrados, int unaCantidadDeAmbientes, Zona zona, Operacion operacion) {
    }

    public int getPrecio() {
        return precio;
    }

    public double getUnosMetrosCuadrados() {
        return unosMetrosCuadrados;
    }

    public int getUnaCantidadDeAmbientes() {
        return unaCantidadDeAmbientes;
    }

    public double CalcularPrecio(){
        return 0;
    }
}

