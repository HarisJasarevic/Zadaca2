import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        //Zadatak 1.

        int registerMoney = 100;
        int moneySpent =33;

        if ((moneySpent) == 0)
            System.out.println("You didn't buy anything, did you?");
        if ((moneySpent) <= 0)
            System.out.println("Did you maybe break something");

        if (moneySpent > 0) {

            if (registerMoney > 100) {
                System.out.println("You have too much money, you lucky person!");

            } else {

                int change = (registerMoney - moneySpent);
                System.out.println("Change is : " + change + " Dollars");

                int numTwenties = change / 20;
                int numTens = (change % 20) / 10;
                int numTwos = (change % 10) / 2;
                int numOnes = (change % 2) / 1;


                if ((change) >= 1) {
                    System.out.println("Number of twenty dollar bills: " + numTwenties);
                    System.out.println("Number of ten dollar bills: " + numTens);
                    System.out.println("Number of two dollar bills: " + numTwos);
                    System.out.println("Number of one dollar bills: " + numOnes);

                }
            }
        }

        //Zadatak 2. - Obim površine kruga

        double circleRadius = 2;
        double piConstant = 3.14159;

        double surfaceOfCircle = piConstant * circleRadius * circleRadius;
        System.out.println("\nThe surface area of circle is: " + surfaceOfCircle);

        //Zadatak 3.

        int numA = 12;
        int numB = 4;

        if ((numA > 10 && numA % 3 == 0 && numA <= 1000) && (numA % numB == 0)) {
            System.out.println("\nNumber A meets the conditions: " + numA + "\nAnd is divisible by number B: " + numB);
            }else {
            System.out.println("\nNumber A doesn't meet the conditions:");
        }

        //Zadatak 4.

        int numC = 5;
        int numD = 5;

        if (numC > numD) {
            System.out.println("\nWhen number C is larger than number D we perform addition numC + numD, and result is: " + (numC + numD));
        } else if (numC < numD) {
            System.out.println("\nWhen number C is smaller than number D we perform division numD - numC, and result is: " + (numD - numC));
        }else if (numC == numD) {
            System.out.println("\nWhen number C is equal to number D we perform multiplication numC * numD, and result is: " + (numC * numD));

        }

        //Zadatak 5.

        int numE = 20;
        int numF = 30;
        int numG = 41;
        int numH = 50;
        int variablesAdded = numE + numF + numG + numH;

        if ((numE > 0 && numF > 0) || (numG > 0 && numH >0)){
            System.out.println("\nNumbers meet the conditions and result is: " + variablesAdded);
        }else {
            System.out.println("Some number does not meet the conditions: ");
        }
        if (variablesAdded > 100 && variablesAdded % 2 == 0) {
            System.out.println("Result is divisible by two, and divided by 2 result is: " + variablesAdded / 2);
        }else {
            System.out.println("Number is not divisible by two: " + variablesAdded);

        }

        //Zadatak 6.

        double numberX = 10.25;

        double functionA = (((numberX + numberX) + 6) / 2) - numberX;

        if ((functionA % 2) == 0) {
            System.out.println("\nResult of functionA is divisible by 2: " + functionA);
        } else {
            System.out.println("\nResult od functionA is not divisible by 2: " + functionA);
        }

    }
}





