import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNumber = new Random().nextInt(20);
        int maxTentativas = 5;
        int numTentativas = 5;

        while (numTentativas <= 5) {
            if (numTentativas == 0) {
                System.out.printf("""
                        
                    Não há mais tentativas
                    ps: eu estava pensando no número %d hihihi...
                    
                    """, randomNumber);
                randomNumber = new Random().nextInt(20);
                numTentativas = maxTentativas;
                continue;
            } else if (numTentativas == 1) {
                System.out.println("É sua última chance... eu confio em você :)");
            } else if (numTentativas == 5) {
                System.out.print("""
                __________________________________________________________________
                
                Bora jogar!
            
                O objetivo é adivinhar o número - de 0 a 20 - que estou pensando.
                (Você tem 5 tentativas)
            
                Obs.: para sair, digite 'quit' a qualquer momento.
                """);
            } else {
                System.out.printf("""
            Tenta de novo! Você ainda tem %d tentativas...
            """, numTentativas);
            }

            try {
                int tentativa = Integer.parseInt(scan.nextLine());

                numTentativas--;

                if (tentativa != randomNumber) {
                    System.out.println("Você errou... :(");
                } else {
                    System.out.println("""
                    
                    
                    IMPOSSÍVEL!!!
                    VOCÊ ACERTOU!!! :OOO
                    
                    PARABÉNS!
                                        
                    Dúvido você acertar de novo...
                    
                    """);
                    numTentativas = 5;
                }
            } catch (Exception e) {
                System.out.println("Até logo...");
                break;
            }
        }
    }
}
