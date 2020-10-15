import java.sql.SQLOutput;
import java.util.ArrayList;
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
    public static String getString(){
        Scanner in = new Scanner(System.in);

        return in.next();
    }
    public static void addAddress(ArrayList<Address> adressList) {
        String streetName;
        int houseNumber;
        int optionalApartmentNumber;
        String state;
        int postalCode;

        System.out.print("Ange en gatuadress: ");
        streetName = getString();
        System.out.print("Ange bostadens nummer: ");
        houseNumber = getNewPositiveInt();
        System.out.print("Ange lägenhetsnummer: ");
        optionalApartmentNumber = getNewPositiveInt();
        System.out.print("Ange ort: ");
        state = getString();
        System.out.print("Ange postkod: ");
        postalCode = getNewPositiveInt();

        adressList.add(new Address(streetName,houseNumber,optionalApartmentNumber,state,postalCode));

    }
    public static void showAddresses(ArrayList<Address> addressList){
        for (Address i:addressList) {
            System.out.println(i:addressList);
        }

    }

    public static void main(String[] args) {
        Counter tally = new Counter();
        ArrayList<Address> adressList = new ArrayList<Address>();
        boolean exitMenu = false;
        int chosenMode, result;
        String menuString = "\nSelect an option: " +
                "\n1. Add one." +
                "\n2. Remove one." +
                "\n3. To add a max limit" +
                "\n4. Show total value." +
                "\n5. Add address." +
                "\n6. Show all stored addresses.";

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
            } else if (chosenMode == 5) {
                addAddress(adressList);
                System.out.print("The address has been added!");
             }else if (chosenMode == 6) {
                showAddresses(adressList);

            } else if (chosenMode == 0) {
                System.out.print("Closing counter.");
                exitMenu = true;
            }
        }

    }
}
