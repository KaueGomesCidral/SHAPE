public class Retangulo extends Shape {
    private double ladoA;
    private double ladoB;

    public Retangulo(String nome, double ladoA, double ladoB) {
        super(nome);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        return ladoA * ladoB;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}