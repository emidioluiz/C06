public class Cadastro {
    String nomeCliente;
    String cpfCliente;
    Computador[] computadoresComprados = new Computador[10];
    int quantidadeComputadores = 0;

    void exibirResumoCompra() {
        System.out.println("Resumo da compra de " + nomeCliente + " (CPF: " + cpfCliente + "):");
        double total = 0;
        for (int i = 0; i < quantidadeComputadores; i++) {
            computadoresComprados[i].exibirDados();
            total += computadoresComprados[i].calculaPreco();
        }
        System.out.println("Total da compra: R$ " + total);
    }
}
