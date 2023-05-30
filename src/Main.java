public class Main {
    public static void main(String[] args) {
        String nomeDoFilme = "Spider Man - No way Home";
        int anoDeLancamento = 2021;
        boolean isPremium = false;
        final String check = !isPremium ? "Free" : " Premium";
        String sinopse = "Filme de aventura com o amigão da vizinhança!";

        double nota1DoFilme = 10;
        double nota2DoFilme = 4.29;
        double nota3DoFilme = 8.33;

        double[] avaliacoes = { nota1DoFilme, nota2DoFilme, nota3DoFilme };

        int estrelasRating = calculateRating(avaliacoes);

        System.out.printf("""
                    Nome do filme: %s
                    Ano de lançamento: %d
                    %s
                    Avaliação: %d
                    Tipo de usuário: %s
                %n""", nomeDoFilme, anoDeLancamento, sinopse, estrelasRating, check);
    }

    public static int calculateRating(double [] arr) {
        int sum = 0;
        int i;

        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double media = (double) sum / arr.length;

        int numberRating = (int) (media / 2);

        return Integer.parseInt(String.valueOf(numberRating));
    }
}
