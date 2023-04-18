public class ex6 {
    public static void main(String[] args) {
        String palavra = "Arroz";
        char[] chars = new char[palavra.length()];

        for (int i = palavra.length() - 1; i >= 0; i--) {
            chars[palavra.length() - 1 - i] = palavra.charAt(i);

        }
        String palavraInvertida = new String(chars);
        System.out.println(palavraInvertida);
    }
}





