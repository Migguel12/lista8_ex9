public class App {
    public static void main(String[] args) throws Exception {
        Retangulo r1 = new Retangulo(4,2);
        Retangulo r2 = new Retangulo(6,3);
        Retangulo r3 = new Retangulo(8,4);

        Ponto p1 = new Ponto(2,2);
        Ponto p2 = new Ponto(6,1);
        Ponto p3 = new Ponto(3,2);

        System.out.print(p1.encontrarCentro(r1));
        System.out.print(p1.verPonto());

        
    }
}
