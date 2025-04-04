public class SistemaOperacional {
    String nome;
       int tipo;

    SistemaOperacional(String n, int t) {


        this.nome = n;

          this.tipo = t;
    }

    void exibirDados() {
             System.out.println("Sistema Operacional: " + nome + " (" + tipo + " bits)");
    }
}