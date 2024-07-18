package conta.Tarefa_transporte;

public class TesteVeiculos {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "Vermelha", 2020);
        System.out.println("Moto: " + moto.marca + ", " + moto.cor + ", " + moto.placa);
        moto.marca = "Yamaha";
        moto.cor = "Azul";
        moto.placa = 2021;
        System.out.println("Moto: " + moto.marca + ", " + moto.cor + ", " + moto.placa);

        Carro carro = new Carro("Ford", "Preto", 2018);
        System.out.println("Carro: " + carro.getMarca() + ", " + carro.getCor() + ", " + carro.getPlaca());
        carro.setMarca("Chevrolet");
        carro.setCor("Branco");
        carro.setPlaca(2019);
        System.out.println("Carro: " + carro.getMarca() + ", " + carro.getCor() + ", " + carro.getPlaca());

        Caminhao caminhao = new Caminhao("Volvo", "Prata", 2015);
        System.out.println("Caminhão: " + caminhao.getMarca() + ", " + caminhao.getCor() + ", " + caminhao.getPlaca());
        caminhao.setMarca("Scania");
        caminhao.setCor("Preto");
        caminhao.setPlaca(2017);
        System.out.println("Caminhão: " + caminhao.getMarca() + ", " + caminhao.getCor() + ", " + caminhao.getPlaca());
    }
}

