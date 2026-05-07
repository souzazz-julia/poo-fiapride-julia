package model;

public abstract class Veiculo {
    private String placa;
    private String modelo;

    public Veiculo(String placa, String modelo) {
        this.setPlaca(placa);
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void atualizarPlaca(String novaPlaca) {
        System.out.println("Solicitada atualização de placa no Detran para o veiculo " + this.modelo + "...");
        this.setPlaca(novaPlaca);
    }

    private void setPlaca(String novaPlaca) {
        if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
            this.placa = novaPlaca;
            System.out.println("Sucesso: A placa agora é " + this.placa);
        } else {
            System.out.println("Erro de Validação: A placa informada é inválida");
        }
    }

    public abstract void exibirTipo();
}