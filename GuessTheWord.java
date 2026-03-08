import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int lives = 6;

       String[] word = {"p","i", "s", "h", "p","e","k"};
       String[] mask = new String[word.length];

        for (int i = 0; i < word.length; i++) {
            mask[i] = "_";
            System.out.print(mask[i]);
        }



        while (true){


            System.out.println("\nВведите букву: ");
            String input = scanner.next();

            boolean found = false;

            for (int j = 0; j < word.length; j++) {

                if (word[j].equals(input)) {
                    mask[j] = input;
                    found = true;
                }


            }
            if (!found){
                lives--;
                System.out.println("Не угадал, осталось жизней: " + lives);

            }

            if (lives == 0){
                System.out.println("Вы проиграли");
                break;
            }

            for (int k = 0; k < mask.length; k++) {
                System.out.print(mask[k]);

            }

            boolean win = true;
            for (int i = 0; i < mask.length; i++) {
                if (mask[i].equals("_")){
                    win = false;
                    break;
                }

            }
            if (win){
                System.out.println("\nПоздравляю! Ты отгадал слово!");
                break;
            }



        }




    }
}