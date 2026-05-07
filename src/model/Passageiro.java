package model;

public class Passageiro {
    private String nome;
    private String cpf;
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0.0);
    }

    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return;
        }
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Recarga realizada. Novo saldo: " + this.getSaldo());
    }

    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }
        if (this.getSaldo() < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }
        this.setSaldo(this.getSaldo() - custo);
        System.out.println("Viagem paga. Saldo restante: " + this.getSaldo());
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
        }
    }
}