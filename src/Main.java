public class Main {


    public static void main(String[] args)
    {
            // Project init
            int intOperandA; //decalring inital variables
            int intOperandB;
            int intSum;
            int intProduct;
            int intDifference;
            int intQuotient;
            int intModulo;

            intOperandA=2;
            intOperandB=6;
            intSum=8;
            intProduct=88;
            intDifference=60;
            intQuotient=80;
            intModulo=120;

            double doubleOperandA; //Creating declarations
            double doubleOperandB;
            double doubleSum;
            double doubleProduct;
            double doubleDifference;
            double doubleQuotient;

            doubleOperandA=1.5;
            doubleOperandB=3.5;
            doubleSum=6.8;
            doubleProduct=7.1;
            doubleDifference=9.3;
            doubleQuotient=11.5;


            intDifference = intModulo / intQuotient * intProduct; // Assignment that uses the arithmentic operator
            intSum = intOperandA + intOperandB;

            doubleSum = doubleOperandA * doubleOperandB;
            doubleDifference = doubleProduct - doubleQuotient;

        System.out.println("The intSum is " + intSum + " and the difference is " + intDifference); // The total from all variables
        System.out.print("The Sum total doubled is " + doubleSum + " and the difference is "+ doubleDifference);
    }
}