package lab5;

import java.util.Scanner;

public class Client {
    private Text text;

    public Client(Text text) {
        this.text = text;
    }

    public void startProgram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть необхідну довжину слів:");
        int n = sc.nextInt();

        text.doLabTask(n);


        if (text.getWantedWords() == null){
            System.out.println("Відсутні слова з заданою довжиною "+n+"!");
        } else {
            System.out.println("Унікальні слова "+n+":");
            System.out.println(text.getWantedWords());
        }

    }
}
