package polimorfismo;

public class Peixe extends Animal {
    private String nome;

    public Peixe(String nome) {
        super(0); 
        this.nome = nome;
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo pequenos organismos aquáticos.");
    }

    public void nadando() {
        System.out.println(nome + " está nadando.");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
