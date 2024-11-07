package school.sptech;

public class Quadrado extends Figura {

    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public Quadrado(){}

    @Override
    public Double calcularArea(){
        Double valorArea = getLado() * getLado();
        return valorArea;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
