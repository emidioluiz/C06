public class MemoriaUSB {
    String nome;
    int capacidade;

    MemoriaUSB(String n, int c) {
        this.nome = n;
             this.capacidade = c;
    }

    void exibirDados() {
           System.out.println(nome + " - " + capacidade + " GB");
    }
}