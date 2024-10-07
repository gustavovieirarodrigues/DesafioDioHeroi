import java.util.Scanner;

public class Main {

    // Função para calcular o saldo de vitórias e derrotas e determinar o nível
    public static String calcularNivel(int vitorias, int derrotas) {
        int saldoVitorias = vitorias - derrotas;
        String nivel;

        // Estrutura de decisão para determinar o nível com base no número de vitórias
        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias >= 11 && vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        // Retorna o saldo de vitórias e o nível do jogador
        return "O Herói tem um saldo de " + saldoVitorias + " e está no nível de " + nivel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: Quantidade de vitórias e derrotas do jogador
        System.out.print("Digite a quantidade de vitórias: ");
        int vitorias = scanner.nextInt();

        System.out.print("Digite a quantidade de derrotas: ");
        int derrotas = scanner.nextInt();

        // Chama a função para calcular o saldo e o nível
        String resultado = calcularNivel(vitorias, derrotas);

        // Exibe o resultado
        System.out.println(resultado);

        scanner.close();
    }
}
