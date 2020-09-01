import java.util.Scanner;

public class MyMain {
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        final String name = scan.next();
        System.out.println("Nice to meet you, " + name);
        
        System.out.print("What is your favorite breed of dog? ");
        final String dog = scan.next();
        System.out.println("Thats a great breed! I also like " + dog);

        System.out.print("How old are you? ");
        final String age = scan.next();
        System.out.println("Wow thats older than me by " + age);

        System.out.print("How are you today? (one word answer)");
        final String today = scan.next();
        System.out.println("I have had many days like that... A week ago I was " + today);

        System.out.print("What grade are you in? ");
        final String grade = scan.next();
        System.out.println("I haven't gone to school but my favorite grade is also " + grade);
        scan.close();
    }
}
