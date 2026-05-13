package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;
import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Viagem;
import br.com.fiapride.model.CarroEletrico;
import br.com.fiapride.model.Celular;
import br.com.fiapride.model.Recarregavel;

public class SistemaPrincipal {
    public static void main(String[] args) {
        System.out.println("!FIAPRIDE: Inicializando Sistema!\n");

        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        ana.adicionarSaldo(100.0);
        Veiculo carroDoJoao = new Carro("ABC-1234", "Toyota Corolla");
        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);
        viagemDaAna.exibirResumo();
        ana.pagarViagem(25.0);

        System.out.println("\n!Teste de Frota (Polimorfismo)!");
        Veiculo[] frota = new Veiculo[] {
                new Carro("CAR-1111", "Fiat Uno"),
                new Moto("MOT-2222", "Yamaha")
        };
        for (Veiculo v : frota) {
            v.exibirTipo();
            System.out.println("Autonomia: " + v.calcularAutonomia() + " km");
        }

        System.out.println("\n!Teste de Interface (Recarregavel)!");
        CarroEletrico tesla = new CarroEletrico("TES-9999", "Tesla Model 3");
        Celular iphone = new Celular("iPhone 15");

        Recarregavel[] recarregaveis = new Recarregavel[] { tesla, iphone };
        for (Recarregavel r : recarregaveis) {
            r.recarregar(85);
            System.out.println("---");
        }
    }
}