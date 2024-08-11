package polimorfismo;

public class Cachorro extends Animal {
    private String nome;

    public Cachorro(String nome) {
        super(4); 
        this.nome = nome;
    }

    public void brinca() {
        System.out.println(nome + " está brincando...");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
