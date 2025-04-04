public class Computador {
    //matricula 9799
    //preco 1 = 9799
    //preco 2 = 9799 + 1234
    //preco 3 = 9799 + 5678
    String marca;
    double preco;

    double valorMatricula = 150.0;

    SistemaOperacional sistemaOperacional;

    HardwareBasico[] hardwares = new HardwareBasico[3];
          MemoriaUSB memoriaUSB;

    double calculaPreco() {
        return preco + valorMatricula;
    }

    void exibirDados() {

        System.out.println("Computador " + marca);

             System.out.println("Preço: R$" + preco);

        System.out.println("Matrícula: R$" + valorMatricula);
        for (HardwareBasico h : hardwares) {
            if (h != null) h.exibirDados();
        }
        if (sistemaOperacional != null) sistemaOperacional.exibirDados();

             if (memoriaUSB != null) memoriaUSB.exibirDados();
    }
}