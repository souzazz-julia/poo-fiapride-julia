package main;

import model.Passageiro;
import model.Veiculo;
import model.Carro;
import model.Moto;
import model.Viagem;
import model.CarroEletrico;
import model.Celular;
import model.Recarregavel;

public class SistemaPrincipal {
    public static void main(String[] args) {
        System.out.println("--- FIAPRIDE: Inicializando Sistema ---\n");

        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        ana.adicionarSaldo(100.0);
        Veiculo carroDoJoao = new Carro("ABC-1234", "Toyota Corolla");
        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);
        viagemDaAna.exibirResumo();
        ana.pagarViagem(25.0);

        System.out.println("\n--- Teste de Frota (Herança) ---");
        Veiculo[] frota = new Veiculo[] {
                new Carro("CAR-1111", "Fiat Uno"),
                new Moto("MOT-2222", "Yamaha")
        };
        for (Veiculo v : frota) {
            v.exibirTipo();
        }

        System.out.println("\n--- Teste de Interface (Recarregavel) ---");
        CarroEletrico tesla = new CarroEletrico("TES-9999", "Tesla Model 3");
        Celular iphone = new Celular("iPhone 15");

        Recarregavel[] recarregaveis = new Recarregavel[] { tesla, iphone };
        for (Recarregavel r : recarregaveis) {
            r.recarregar(85);
            System.out.println("---");
        }
    }
}