import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacoes = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga a sua avaliação para o filme (de 0 a 10) ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacoes += nota;
                totalDeNotas++;
            }
        }

        if (totalDeNotas != 0) {
            System.out.println("Média de avaliações: " + (mediaAvaliacoes / totalDeNotas));
        } else {
            System.out.println("Tchau tchau!");
        }
    }
}
