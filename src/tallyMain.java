import java.util.Scanner;

public class tallyMain {
    public static int menuInput() { //Method for validating menu input to be relevant to options in menu.
        Scanner input = new Scanner(System.in);
        int validated = 0;
        boolean isValid = false;
        do {
            if (input.hasNextInt()) {
                validated = input.nextInt();
                isValid = true;
            } else if (!input.hasNextInt()) {
                input.next();
                System.out.print("You have entered a incorrect value. Please enter a valid option: ");
                isValid = false;
            }
        } while (!isValid); {
        }
        return validated;
    }
    public static int getNewPositiveInt() { //Method for validating functions input to be a positive integer.
        Scanner input = new Scanner(System.in);
        int validated = 0;
        boolean isValid = false;
        do {
            if (!input.hasNextInt()) {
                input.next();
                System.out.print("You have entered a incorrect value. Please enter a positive integer: ");
                isValid = false;
            } else if (input.hasNextInt()) {
                validated = input.nextInt();
                if (validated <= 0) {
                    isValid = false;
                    System.out.print("You have entered a incorrect value. Please enter a positive integer: ");
                } else {
                    isValid = true;
                }
            }
        } while (!isValid); {
        }
        return validated;
    }

    public static void main(String[] args) {
        Counter tally = new Counter();
        boolean exitMenu = false;
        int chosenMode, result;
        String menuString = "\nSelect an option: " +
                "\n1. Add one." +
                "\n2. Remove one." +
                "\n3. To add a max limit" +
                "\n4. Show total value.";
        String menuEnd = "\n0. To exit counter. \n Choose your option: ";

        while (!exitMenu) {
            System.out.print(menuString + menuEnd);
            chosenMode = menuInput();

            if (chosenMode == 1) {
                tally.count();
            } else if (chosenMode == 2) {
                tally.remove();
            } else if (chosenMode == 3) {
                System.out.print("Please add max limit: ");
                result = getNewPositiveInt();
                tally.setLimit(result);
            } else if (chosenMode == 4) {
                result = tally.getValue();
                System.out.print("The total count: " + result);
            } else if (chosenMode == 0) {
                System.out.print("Closing counter.");
                exitMenu = true;
            }
        }

    }
}
