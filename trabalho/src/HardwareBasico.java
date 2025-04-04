public class HardwareBasico {
    String nome;

    int capacidade;


    HardwareBasico(String n, int c) {
        this.nome = n;
            this.capacidade = c;
    }

    void exibirDados() {
           System.out.println(nome + " - " + capacidade + " GB");
    }
}