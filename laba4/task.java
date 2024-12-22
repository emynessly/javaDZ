package laba4;
import java.util.Scanner;
import java.util.regex.Pattern;

public class task {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        if (words.length>=2) {
            for(int i = 0; i<=words.length-1; i++){
                if (words[i].matches(".*[\\d\\p{Punct}].*")) {
                    System.out.println(words[i]);
                }
            }
        } else {
            System.out.println("Мало слов! ");
        }
    }
}
