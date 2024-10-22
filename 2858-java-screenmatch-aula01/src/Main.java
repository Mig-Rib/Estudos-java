public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        double notaDofilme = 8.1;

        String sinopse;
        sinopse = """
                Esse é o Screen Match
                Filme legal
                Filme: Top Gun: Maverick
                """ + notaDofilme
                ;
        System.out.println(sinopse);


    }
}