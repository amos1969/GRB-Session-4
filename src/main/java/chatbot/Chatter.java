package chatbot;

import java.util.Scanner;

public class Chatter {
    public String name;


    public void chat() {
        Scanner input = new Scanner(System.in);
        String response = "";
        while (true) {
            System.out.println("How does that make you feel?");
            response = input.nextLine();
            if (response.equalsIgnoreCase("x")) {
                break;
            }
        }
        System.out.println("See you later, alligator!");
    }

    static void main() {
        Chatter chat = new Chatter();
        chat.chat();
    }
}
