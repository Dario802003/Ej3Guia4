package ej3guia4;

public class Rectangulo extends figurasDosDimensiones implements calculosFormas {

    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
//        super(area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    
    
    @Override
    public void calcularArea() {
        setArea(base * altura);
        return getArea();
    }

    @Override
    public void calcularPrerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
