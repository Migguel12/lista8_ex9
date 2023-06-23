public class Retangulo {
    double altura;
    double largura;
    private double centroAltura;
    private double centroLargura;
    private double centro[] = {centroLargura, centroAltura};

    public Retangulo(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
    }


    public double[] encontrarCentro(Retangulo r1){
        centroLargura = largura/2;
        centroAltura = altura/2;
        return centro;

    }
}
