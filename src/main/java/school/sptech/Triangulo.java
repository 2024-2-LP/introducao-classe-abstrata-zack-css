package school.sptech;

public class Triangulo extends Figura{

    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){}

    @Override
    public Double calcularArea(){
        Double valorArea = (getAltura() * getBase()) /2;
        return valorArea;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
