package polimorfismo;

public class Peixe extends Animal{
    
    private String nome;

    public void Peixe (nome){
        this.nome = nome;
    } 

    public String getNome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public void nadando(){
        System.out.println ("Peixe está nadando");
    }

    @Override
    public void comer(){
        System.out.println ("Peixe está comendo");
    }
}