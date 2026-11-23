/**
 * Ponto
 * Classe que representa um ponto no plano cartesiano.
 */

public class Ponto {
    private double coordX;
    private double coordY;

    /**
     * Construtor padrão
     */
    public Ponto() {
        this.coordX = 0.0;
        this.coordY = 0.0;
    }

    /**
     * Construtor parametrizado (recebe coordenadas x e y)
     * @param coordX
     * @param coordY
     */
    public Ponto(double coordX,
                 double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    /**
     * Construtor parametrizado (recebe um ponto)
     * @param origem
     */
    public Ponto(Ponto origem) {
        this.coordX = origem.coordX;
        this.coordY = origem.coordY;
    }

    /**
     * Calculo da distância entre dois pontos
     * @param destino
     * @return
     */
    public double calcularDistancia(Ponto destino) {
        double deltaX = Math.pow((destino.coordX - this.coordX), 2);
        double deltaY = Math.pow((destino.coordY - this.coordY), 2);
        double distancia = Math.sqrt(deltaX + deltaY);

        return distancia;
    }

    /**
     * Calculo da distância entre esse ponto e outra coordenada;
     * @return
     */

    /**
     * Deslocamento do ponto atual, para novas corredenadas (delta x e delta y)
     * Deve alterar a coordenada atual, com base nos deltas.
     * @return
     */


    // region: Getters and Setters (métodos acessores)
    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    //endregion

    @Override
    public String toString() {
        return "Ponto{" +
                "coordX= " + coordX +
                ", coordY= " + coordY +
                '}';

//        return "Ponto(" + coordX + ", " + coordY + ")";
    }
}
