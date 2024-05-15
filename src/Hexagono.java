public class Hexagono extends Shape {
    private double lado;

    public Hexagono(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }
}