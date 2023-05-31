public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2021;
        boolean isPremium = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento");
        } else {
            System.out.println("Filme antigo");
        }

        if (isPremium && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
