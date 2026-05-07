package model;

public class Carro extends Veiculo {
    private int capacidadePassageiros;

    public Carro(String placa, String modelo) {
        super(placa, modelo);
        this.setCapacidadePassageiros(4);
    }

    @Override
    public void exibirTipo() {
        System.out.println("Sou um Carro");
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    private void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}