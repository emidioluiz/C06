import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               Cadastro cadastro = new Cadastro();

               System.out.print("Digite seu nome: ");

               cadastro.nomeCliente = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        cadastro.cpfCliente = scanner.nextLine();

        while (true) {
              System.out.println("Escolha um computador (1-3):");

              System.out.println("1 - Promo1");
             System.out.println("2 - Promo2");

             System.out.println("3 - Promo3");
            System.out.println("0 - Finalizar compra");


            int opcao = scanner.nextInt();

            if (opcao == 0) break;

            Computador pc = new Computador();

            if (opcao == 1) {
                 pc.marca = "Promo1";
                pc.preco = 9799;

                pc.hardwares[0] = new HardwareBasico("Processador", 2200);
                  pc.hardwares[1] = new HardwareBasico("RAM", 8);
                pc.hardwares[2] = new HardwareBasico("HD", 500);

                pc.sistemaOperacional = new SistemaOperacional("Linux", 64);

                pc.memoriaUSB = new MemoriaUSB("PenDrive", 16);
            } else if (opcao == 2) {
                pc.marca = "Promo2";
                 pc.preco = 11033;
                   pc.hardwares[0] = new HardwareBasico("Processador", 3200);

                pc.hardwares[1] = new HardwareBasico("RAM", 16);

                pc.hardwares[2] = new HardwareBasico("HD", 1000);
                 pc.sistemaOperacional = new SistemaOperacional("Windows", 64);


                pc.memoriaUSB = new MemoriaUSB("PenDrive", 32);
            } else if (opcao == 3) {
                pc.marca = "Promo3";

                pc.preco = 15477;
                  pc.hardwares[0] = new HardwareBasico("Processador", 4400);
                 pc.hardwares[1] = new HardwareBasico("RAM", 32);

                pc.hardwares[2] = new HardwareBasico("HD", 2000);
                  pc.sistemaOperacional = new SistemaOperacional("Windows Pro", 64);

                pc.memoriaUSB = new MemoriaUSB("HD Externo", 1000);
            } else {
                System.out.println("Opção inválida.");
                continue;
            }

            pc.exibirDados();
            System.out.print("Deseja comprar esse computador? (s/n): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("s")) {

                cadastro.computadoresComprados[cadastro.quantidadeComputadores] = pc;

                   cadastro.quantidadeComputadores++;

                   System.out.println("Computador adicionado ao carrinho.");
            } else {
                System.out.println("Voltando ao menu de compras...");
            }
        }

        cadastro.exibirResumoCompra();
    }
}