import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    // Print method
    public static Scanner scanner = new Scanner(System.in);
    // ArrayList for Dogs
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // ArrayList for Monkeys
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        String menuChoice = "";
        initializeDogList();	// Initialize dog and monkey lists with test data
        initializeMonkeyList();

        // Menu loop, presents numbered choices and displays a message if an invalid selection is made.
        while (!menuChoice.equals("q")) {
            displayMenu();	// Display the menu and prompt for user input
            menuChoice = scanner.next();
            scanner.nextLine();
            // Switch statement to perform actions based on user input
            switch (menuChoice) {
                case "1":
                    intakeNewDog(scanner);	// Intake new dog and add it to the list
                    break;
                case "2":
                    intakeNewMonkey(scanner);	// Intake new Monkey and add it to the list
                    break;
                case "3":
                    reserveAnimal(scanner);		// reserve an animal based on user input
                    break;
                case "4":
                    printAnimals("dog");	// Print a list of all dogs
                    break;
                case "5":
                    printAnimals("monkey");		// Print a list of all monkeys
                    break;
                case "6":
                    printAnimals("available");	//Print a list of all animals that are not reserved
                    break;
                case "q":
                    System.out.println("Exiting application.");		// Quit the application
                    break;
                default:
                    System.out.println("Invalid input.");	// Display an error message for invalid input
            }
        }
       
    }

    // This method prints the menu options
    public static void displayMenu() {    	
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
    	// Create a Dog object with specific information
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
        
        // Add the Dog object to the dogList ArrayList
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    // Optional for testing
    public static void initializeMonkeyList() {
    	// Create a Monkey object with specific information
        Monkey monkey1 = new Monkey("Allen", "Macaque", "male", "22", "80kg", "9m", "3m", "3m", "01-01-2021", "Venezuela", "Phase I", true, "Russia");
        Monkey monkey2 = new Monkey("Bubble", "Capuchin", "male", "13", "5kg", "3m", "20m", "20m", "03-30-2013", "Maldives", "intake", false, "Maldives");
        Monkey monkey3 = new Monkey("George", "Guenon", "female", "300", "5000kg", "50m", "15m", "15m", "02-12-2019", "Iceland", "in service", false, "Mexico");
        
        // Adds the Mokey object to the dogList ArrayList
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {	// Intake a new dog based on user input
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; // returns to menu
            }
        }

        System.out.println("What is the dog's breed? ");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender? ");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age? ");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight? ");
        String weight = scanner.nextLine();
        System.out.println("When was the dog acquired? ");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Where was the dog acquired? ");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's training status? ");
        String trainingStatus = scanner.nextLine();
        System.out.println("What is the dog's area of service? ");
        String inServiceCountry = scanner.nextLine();
        // Loop and verification for whether the dog is reserved
        String inputAnswer = "";
        Boolean reserved = null;
        while (inputAnswer.equals("")) {
            System.out.println("Is the dog reserved? [y] or [n]");
            inputAnswer = scanner.next();
            scanner.nextLine();
            switch (inputAnswer) {
                case "y":
                    reserved = true;
                    break;
                case "n":
                    reserved = false;
                    break;
                default:
                    inputAnswer = "";
                    System.out.println("Invalid input.");
            }
        }

        // Add the dog to the list
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(newDog);
        System.out.print(name);
        System.out.println(" was added to the Dog registry.");
    }

    // Complete intakeNewMonkey
    // Instantiate and add the new monkey to the appropriate list
    // For the project submission, you must also validate the input
    // to make sure the monkey doesn't already exist and the species type is allowed
    
    
    public static void intakeNewMonkey(Scanner scanner) {
    	// Intake new monkey based on user input
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; // returns to menu
            }
        }
        // Loop and verification for choosing from the valid monkey breeds
        System.out.println("What is the monkey's species?");
        System.out.println("Enter a letter: [1]Capuchin [2]Guenon [3]Macaque [4]Marmoset [5]Squirrel monkey [6]Tamarin");
        String species = "";
        String speciesSelection = scanner.next();
        scanner.nextLine();
        while (speciesSelection.equals("")) {
            switch (speciesSelection) {
                case "1":
                    species = "Capuchin";
                    break;
                case "2":
                    species = "Guenon";
                    break;
                case "3":
                    species = "Macaque";
                    break;
                case "4":
                    species = "Marmoset";
                    break;
                case "5":
                    species = "Squirrel Monkey";
                    break;
                case "6":
                    species = "Tamarin";
                    break;
                default:
                    speciesSelection = "";
                    System.out.print("Please enter a valid input or q to go to the main menu.");
            }
        }
        System.out.println("How old is the monkey?");
        String age = scanner.nextLine();
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();
        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();
        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();
        System.out.println("What date was the monkey acquired?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What country was the monkey acquired in?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the monkey's current training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("What is the monkey's service country?");
        String inServiceCountry = scanner.nextLine();
        // Loop and verification for setting reservation status
        String inputAnswer = "";
        Boolean reserved = null;
        while (inputAnswer.equals("")) {
            System.out.println("Is the monkey reserved? [y] or [n]");
            inputAnswer = scanner.next();
            scanner.nextLine();
            switch (inputAnswer) {
                case "y":
                    reserved = true;
                    break;
                case "n":
                    reserved = false;
                    break;
                default:
                    inputAnswer = "";
                    System.out.println("Invalid input.");
            }
        }

        // Add the monkey to the list
        Monkey newMonkey = new Monkey(name, species, gender, age, weight, tailLength, height, bodyLength, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        monkeyList.add(newMonkey);
        System.out.print(name);
        System.out.println(" was added to the Monkey registry.");
    }

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in-service country
    
    
    public static void reserveAnimal(Scanner scanner) {
    	// Reserve an animal based on user input
        System.out.println("What country is the animal's service requested in?");
        String inServiceCountry = scanner.nextLine();
        int inputChoice = 0;
        while (inputChoice == 0) {
            System.out.println("What type of animal would you like to reserve? [1] Dog [2] Monkey");
            inputChoice = scanner.nextInt();
            scanner.nextLine();
            switch (inputChoice) {
                case 1:
                    // Present dogs available one by one and ask to reserve.
                    // Display an error if the user says 'no' on the last available dog
                    for (Dog dog : dogList) {
                        if (dog.getInServiceLocation().equals(inServiceCountry) && !dog.getReserved() && dog.getTrainingStatus().equals("in service")) {
                            System.out.print("Would you like to reserve ");
                            System.out.print(dog.getName());
                            System.out.print(", a ");
                            System.out.print(dog.getAge());
                            System.out.print(" year old ");
                            System.out.print(dog.getBreed());
                            System.out.println("? (y/n)");

                            String inputAnswer = "";
                            while (inputAnswer.equals("")) {
                                inputAnswer = scanner.next();
                                scanner.nextLine();
                                switch (inputAnswer) {
                                    case "y":
                                        dog.setReserved(true);
                                        System.out.println(dog.getName() + " has been reserved.");
                                        return; // Go to the main menu
                                    case "n":
                                        break;
                                    default:
                                        inputAnswer = "";
                                        System.out.println("Invalid input.");
                                }
                            }
                        }
                    }
                    System.out.println("No more dogs are available in this location.");
                    break;

                case 2:
                    // Iterate through available monkeys and ask to reserve.
                    // Display an error when the end is reached if the user selects 'no'
                    for (Monkey monkey : monkeyList) {
                        if (monkey.getInServiceLocation().equals(inServiceCountry) && !monkey.getReserved() && monkey.getTrainingStatus().equals("in service")) {
                            System.out.print("Would you like to reserve ");
                            System.out.print(monkey.getName());
                            System.out.print(", a ");
                            System.out.print(monkey.getAge());
                            System.out.print(" year old ");
                            System.out.print(monkey.getSpecies());
                            System.out.println("? (y/n)");

                            String inputAnswer = "";
                            while (inputAnswer.equals("")) {
                                inputAnswer = scanner.next();
                                scanner.nextLine();
                                switch (inputAnswer) {
                                    case "y":
                                        monkey.setReserved(true);
                                        System.out.println(monkey.getName() + " has been reserved.");
                                        return; // Go to the main menu
                                    case "n":
                                        break;
                                    default:
                                        inputAnswer = "";
                                        System.out.println("Invalid input.");
                                }
                            }
                        }
                    }
                    System.out.println("No more monkeys are available in this location.");
                    break;

                default:
                    inputChoice = 0;
                    System.out.println("Invalid input.");
            }
        }
    }

    // Complete printAnimals
    // Include the animal name, status, acquisition country and if the animal is reserved.
    // Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved
    // Remember that you only have to fully implement ONE of these lists.
    // The other lists can have a print statement saying "This option needs to be implemented".
    // To score "exemplary" you must correctly implement the "available" list.
    
    
    public static void printAnimals(String listType) {
        // Print a list of animals based on the specified type
        System.out.println("List of all " + listType + "s:");
        ArrayList<? extends RescueAnimal> selectedList;
    
        switch (listType) {
            case "dog":
                selectedList = dogList;
                break;
            case "monkey":
                selectedList = monkeyList;
                break;
            case "available":
                selectedList = new ArrayList<>(dogList);
                selectedList.addAll(monkeyList);
                break;
            default:
                System.out.println("Invalid list type.");
                return;
        }
    
        for (RescueAnimal animal : selectedList) {
            System.out.print(animal.getName() + ": " + animal.getTrainingStatus() + ". Acquired in " + animal.getAcquisitionLocation() + ". ");
            if (animal.getReserved()) {
                System.out.println("(RESERVED)");
            } else {
                System.out.println("(AVAILABLE)");
            }
        }
    }
}
