import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
            // Project init
            int numKidsFamily=4; //decalring inital variables
            Scanner Rain = new Scanner(System.in);//Creates new object

            System.out.println("Is it raining? ");//output statement/question
            String isItRaining = Rain.nextLine();
            if(isItRaining.equals("Yes")) {
                System.out.println("It is raining");
            }
            else if(isItRaining.equals("No")) {
                System.out.println("It is not raining");
                }

            double gasPerGallon=5.50;
            int favoriteNumber=7;
            int shoeSize=11;
            int birthMonth=7;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Full Name: ");
            String fullName = scan.nextLine();

    System.out.println("This is how many kids are in the family " + numKidsFamily);
    System.out.println("Is it raining? " + isItRaining);
    System.out.println("How much is gas in your area? " + gasPerGallon);
    System.out.println("This is your birth month "+ birthMonth + " and this is your favorite number " + favoriteNumber);
    System.out.println("WHat is your shoes size? "+ shoeSize);
    }
}