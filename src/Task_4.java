import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

            System.out.println("Введіть текст:");
            String text = scaner.nextLine();
            StringBuilder newtext = new StringBuilder();
            String[] words = text.split("[ ,.:;-?!]+");
            System.out.println("Слова, без повтореннь останньої літери:");
            for (int i=0;i<words.length;i++){
                String word = words[i];
                for (int j=0;j<word.length();j++) {
                    if (word.charAt(j) != word.charAt(word.length() - 1)) {
                        newtext.append(word.charAt(j));

                    }
                }
                newtext.append(word.charAt(word.length()-1));
                newtext.append(" ");
            }
            System.out.println(newtext.toString());
            scaner.close();
    }
}
