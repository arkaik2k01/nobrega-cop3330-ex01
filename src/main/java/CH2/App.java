package CH2;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Miguel Nobrega
 */


//Exercise 1 - Saying Hello
//        Create a program that prompts for your name and prints a greeting using your name.
//
//        Example Output
//        What is your name? Brian
//        Hello, Brian, nice to meet you!

//        Constraint
//        Keep the input, string concatenation, and output separate.

//        Challenges
//        Write a new version of the program without using any variables.
//        !! Write a version of the program that displays different greetings for different people. !!
//        Write a version of the program that displays the greeting in a GUI window.


import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App prog = new App();

        System.out.print("What is your name? ");
        String name = in.nextLine();
        prog.greetings(name);
    }

    private void greetings(String name)
    {
        if(name.equalsIgnoreCase("Brian"))
        {
            System.out.println("Hello, Brian, you should test another name.");
        }
        else if(name.equalsIgnoreCase("Chris") || name.equalsIgnoreCase("Christopher"))
        {
            System.out.println("Hello Professor, hope you are having a good day");
        }
        else if(name.equalsIgnoreCase("Juan"))
        {
            System.out.println("Hello Juan, I hope you didn't break my code!");
        }
        else if (name.equalsIgnoreCase("Gopi"))
        {
            System.out.println("Hey Gopi, hope you're having a nice day");
        }
        else if (name.equalsIgnoreCase("Nitheesh"))
        {
            System.out.println("Hey Nitheesh, what's up?");
        }
        else if (name.equalsIgnoreCase("Sunanda"))
        {
            System.out.println("Hey Sunanda, hope grading is going ok!");
        }
        else
        {
            System.out.println("Hello, "+ name +", nice to meet you!");
        }
    }
}

