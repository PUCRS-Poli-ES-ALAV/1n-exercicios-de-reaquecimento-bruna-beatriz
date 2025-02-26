public class Multipl{
    //Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    public static int multiplRecursiva(int n, int m){
        if(n > 1){
            n--;
            m += multiplRecursiva(n, m);
        }
        return m;
    }
    public static void main(String[] args) {
        System.err.println(multiplRecursiva(9, 7));
    }
}
