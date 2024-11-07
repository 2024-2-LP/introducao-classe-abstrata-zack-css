package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura>figuras = new ArrayList<>();

    public Imagem(List<Figura> figuras) {
        this.figuras = figuras;
    }
    public Imagem(){}

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double soma = 0.0;
        for (Figura figura : figuras) {
            soma += figura.calcularArea();
        }

        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figuras1 = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20.0){
                figuras1.add(figura);
            }
        }
        return figuras1;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> figuraQuadrada = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado){
                figuraQuadrada.add(figura);
            }
        }
        return figuraQuadrada;
    }



    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }
}
