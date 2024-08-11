package polimorfismo;

public class Cachorro extends Animal {
    
    private String nome;

    public void Cachorro(nome){
        super(4);
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }
 
    public void brinca(){
        System.out.println("cachorro está brincando");
    }

    @Override
    public void comer(){
        System.out.println (nome + "O cachorro está comendo...");
    }
}