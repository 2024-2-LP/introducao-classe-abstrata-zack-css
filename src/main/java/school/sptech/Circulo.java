package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Circulo(){}

    @Override
    public Double calcularArea(){
        Double valorArea = 0.0;

        valorArea = Math.pow(getRaio(),2) * Math.PI;

        return  valorArea;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
