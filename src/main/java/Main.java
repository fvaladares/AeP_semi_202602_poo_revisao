public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        p1.setCoordX(10);
        p1.setCoordY(5);
        Ponto p2 = new Ponto(20, 10);
        Ponto p3 = new Ponto(p2);

        System.out.printf("Coordenadas do ponto P2 (%.2f, %.2f)",
                p2.getCoordX(),
                p2.getCoordY());

        System.out.println();
        System.out.println(p3);
    }
}
