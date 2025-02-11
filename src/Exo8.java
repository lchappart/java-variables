import java.text.MessageFormat;

public class Exo8 {
    public static void main(String[] args) throws Exception {
        char[] myArray42 = {'q', 'u', 'a', 'r', 'a', 'n', 't', 'e', '-', 'd', 'e', 'u', 'x'};
        String template = "La grande réponse sur la vie, l’univers et le reste ! {0}";
        String phrase = new String(myArray42);
        phrase = MessageFormat.format(template, phrase);
        System.out.println(phrase);
    }
}
