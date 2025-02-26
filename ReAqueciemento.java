public class ReAqueciemento {
    // Multiplicação de dois números naturais por somas sucessivas
    public static int multiplRec(int n, int m) {
        if (n == 1){
            return m;
        } 
        n--;
        return m + multiplRec(n, m);
    }

    // Soma de dois números naturais por incrementos sucessivos
    public static int somaRec(int n, int m) {
        if (n == 0){
            return m;
        } 
        n--;
        m++;
        return somaRec(n, m);
    }

    // Cálculo da série harmônica: 1 + 1/2 + 1/3 + ... + 1/N
    public static double divisaoRec(int n) {
        if (n == 1){
            return 1.0;
        } 
        n--;
        return 1.0 / n + divisaoRec(n);
    }

    // Inversão de uma string
    public static String inversaoStringRec(String s) {
        if (s.isEmpty()){
            return " ";
        } 
        return inversaoStringRec(s.substring(1)) + s.charAt(0);
    }

    // Gerador da sequência definida por:
    // F(1) = 1, F(2) = 2, F(n) = 2 * F(n - 1) + 3 * F(n - 2)
    public static int sequenciaRec(int n) {
        if (n == 1){
            return 1;
        } 
        if (n == 2){
            return 2;
        } 
        n--;
        return 2 * sequenciaRec(n) + 3 * sequenciaRec(n-1);
    }

    //Gerador de Sequência de Ackerman:
    //A(m, n) = n + 1, se m = 0
    //A(m, n) = A(m − 1, 1), se m != 0 e n = 0
    //A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0
    public static int ackermann(int m, int n) {
        if (m == 0){
            n++;
            return n;
        } 
        if (n == 0){
            m--;
            return ackermann(m, 1);
        } 
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    // Soma e produto dos elementos de um vetor
    public static int somaVetor(int[] v, int n) {
        if (n == 0){
            return 0;
        } 
        return v[n - 1] + somaVetor(v, n - 1);
    }

    public static int produtoVetor(int[] v, int n) {
        if (n == 0){
            return 1;
        } 
        return v[n - 1] * produtoVetor(v, n - 1);
    }

    // Verifica se uma palavra é um palíndromo
    public static boolean ehPalindromo(String s) {
        if (s.length() <= 1){
            return true;
        } 
        if (s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        } 
        return ehPalindromo(s.substring(1, s.length() - 1));
    }

    // Gera todas as combinações com as n primeiras letras do alfabeto
    //Ex.: n = 3. Resposta: ABC, ACB, BAC, BCA, CAB, CBA.
    public static void permutacoes(String prefixo, String resto) {
        if (resto.isEmpty()) {
            System.out.println(prefixo);
        } 
        else {
            for (int i = 0; i < resto.length(); i++) {
                permutacoes(prefixo + resto.charAt(i), resto.substring(0, i) + resto.substring(i + 1));
            }
        }
    }

    public static void gerarCombinacoes(int n) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(0, n);
        permutacoes(" ", alfabeto);
    }

    // Fibonacci generalizado
    public static int fibg(int f0, int f1, int n) {
        if (n == 0){
            return f0;
        } 
        if (n == 1){
           return f1; 
        } 
        return fibg(f0, f1, n - 1) + fibg(f0, f1, n - 2);
    }


    public static void main(String[] args) {
        System.out.println("Exercio 1: " + multiplRec(9, 7));
        System.out.println("Exercio 2: " + somaRec(2, 3));
        System.out.println("Exercio 3: " + divisaoRec(4));
        System.out.println("Exercio 4: " + inversaoStringRec("Teste"));
        System.out.println("Exercio 5: " + sequenciaRec(5));
        System.out.println("Exercio 6: " + ackermann(2, 3));
        int[] vetor = {1, 2, 3, 4};
        System.out.println("Exercio 7:" + somaVetor(vetor, vetor.length));
        System.out.println("Exercio 8: " + produtoVetor(vetor, vetor.length));
        System.out.println("Exercio 9:" + ehPalindromo("aba"));
        System.out.println("Exercio 10:");
        gerarCombinacoes(3);
        System.out.println("Exercio 11: " + fibg(2, 3, 5));

    }

}