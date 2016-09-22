import java.util.Scanner;

/**
* This class represents a basic AI that will chat with a human user.
*
* @author Lindsey Yu
* @version 0.1
*/ 

//TODO - bye or Bye to exit, && or || 
public class chatBot

{
    public static void main(String[] args)

    {
        
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Hi I'm Chatbot. What's your name?");
        String name = keyboard.nextLine();

        System.out.println("Nice to meet you, " + name + ", how old are you?");
        int age = keyboard.nextInt();

        keyboard.nextLine();

        if (age > 40 && age < 100)

        {
            System.out.println("Wow, that's old.");
            System.out.println("Only" + (100 -age) + "years until you're 100!");
        }

        else

        {
            System.out.println("How long until you turn " + (++age) + "?");
            keyboard.nextLine();
        }
        String answer = "anything other than bye";
        while ((!answer.equals("bye")) && (!answer.equals("Bye")))
        

        {
            System.out.println("Tell me one of your hobbies (or say \"bye\" to exit");
            answer = keyboard.nextLine();

        }
    }


}