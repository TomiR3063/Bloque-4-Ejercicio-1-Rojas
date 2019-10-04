package domain;

public class Empleado {
    private double comision;

    public Empleado() {
        this.comision=0;
    }

    public double getComision() {
        return comision;
    }

    public void setcomision(double comision) {
        this.comision+=comision;
    }
}
