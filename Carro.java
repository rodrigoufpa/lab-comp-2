// Declaração da classe "Carro"
public class Carro {

    // Atributos da classe, representando características do carro
    private String modelo;  // Nome do modelo do carro
    private String cor;     // Cor do carro
    private int ano;        // Ano de fabricação
    private double preco;   // Preço do carro
    private boolean ligado; // Estado do carro (ligado ou desligado)

    // Construtor para inicializar os atributos da classe
    public Carro(String modelo, String cor, int ano, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.ligado = false; // Carro inicia desligado
    }

    // Método para ligar o carro
    public void ligar() {
        if (!ligado) {
            ligado = true; // Altera o estado do carro para ligado
            System.out.println("O carro " + modelo + " está agora ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (ligado) {
            ligado = false; // Altera o estado do carro para desligado
            System.out.println("O carro " + modelo + " está agora desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para exibir informações sobre o carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Está ligado? " + (ligado ? "Sim" : "Não"));
    }

    // Métodos getter e setter para o atributo "preco"
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criação de um objeto da classe Carro
        Carro meuCarro = new Carro("Fusca", "Azul", 1978, 25000.00);

        // Exibindo informações do carro
        meuCarro.exibirInformacoes();
        
        // Ligando o carro
        meuCarro.ligar();
        
        // Alterando o preço do carro
        meuCarro.setPreco(30000.00);
        
        // Exibindo informações novamente
        meuCarro.exibirInformacoes();
        
        // Desligando o carro
        meuCarro.desligar();
    }
}
