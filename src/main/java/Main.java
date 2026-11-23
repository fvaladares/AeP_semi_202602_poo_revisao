public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        p1.setCoordX(1);
        p1.setCoordY(2);
        Ponto p2 = new Ponto(4, 6);
        Ponto p3 = new Ponto(p2);

        System.out.printf("Coordenadas do ponto P2 (%.2f, %.2f)",
                p2.getCoordX(),
                p2.getCoordY());

        System.out.println();
        System.out.println(p3);

        System.out.println();
        System.out.println("Distância entre P1 e P2 = "
                + p1.calcularDistancia(p2));
    }
}
