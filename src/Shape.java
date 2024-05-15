public abstract class Shape {
    protected String nome;

    public Shape(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}