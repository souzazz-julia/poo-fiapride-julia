package model;

public class Moto extends Veiculo {
    private boolean isEletrica;

    public Moto(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public void exibirTipo() {
        System.out.println("Sou uma Moto");
    }

    public boolean isEletrica() {
        return isEletrica;
    }

    public void setIsEletrica(boolean isEletrica) {
        this.isEletrica = isEletrica;
    }
}