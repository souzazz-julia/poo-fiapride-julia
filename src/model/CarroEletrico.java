package model;

public class CarroEletrico extends Veiculo implements Recarregavel {
    private int nivelBateria;

    public CarroEletrico(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public void recarregar(int percentual) {
        if (percentual < Recarregavel.CARGA_MINIMA || percentual > Recarregavel.CARGA_MAXIMA) {
            System.out.println("Erro: Percentual inválido!");
            return;
        }
        System.out.println("Carro " + this.getModelo() + " recarregado para " + percentual + "%");
        this.setNivelBateria(percentual);
    }

    @Override
    public void exibirTipo() {
        System.out.println("Sou um Carro Elétrico");
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
}