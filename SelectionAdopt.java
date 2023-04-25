import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;




public class SelectionAdopt { //start
    private static ArrayList < String > animalBreeds = new ArrayList < String > ();
    public static void adopt() { //start

        // declare array of animal options here
        String[] animalOptions = { //start 
            "1. Dogs",
            "2. Cats",
            "3. Birds",
            "4. Fishes",
            "5. Hamsters",
            "6. Guinea Pigs",
            "7. Gerbils",
            "8. Lizards",
            "9. Rabbits",
            "10. Turtles",
            "11. Snakes",
            "12. Horses",
            "13. Back to menu"
        }; //end animalOptions

        // java regular for loop: exactly the same as the above loop, but uses indexes
        for (int i = 0; i < animalOptions.length; i++) { //start for 
            System.out.println(animalOptions[i]);
        } //end for 

      	System.out.print("Please select one of the following option: ");
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
      	System.out.println("");
        // here read the user input and based on user input call another method

        String filename = "";

        do {
            switch (userInput) { //start userInput
                case 1:
                    filename = "DogBreeds.txt";
                    break;
                case 2:
                    filename = "CatBreeds.txt";
                    break;
                case 3:
                    filename = "BirdBreeds.txt";
                    break;
                case 4:
                    filename = "FishBreeds.txt";
                    break;
                case 5:
                    filename = "HamsterBreeds.txt";
                    break;
                case 6:
                    filename = "GuineaPigBreeds.txt";
                    break;
                case 7:
                    filename = "GerbilsBreeds.txt";
                    break;
                case 8:
                    filename = "LizardBreeds.txt";
                    break;
                case 9:
                    filename = "RabbitBreeds.txt";
                    break;
                case 10:
                    filename = "TurtleBreeds.txt";
                    break;
                case 11:
                    filename = "SnakeBreeds.txt";
                    break;
                case 12:
                    filename = "HorseBreeds.txt";
                    break;
                default:
                    //print this to the console if the user's input isn't valid
                    System.out.println("Not a valid option, please try again");
                    break;
            }
        } while (userInput < 1 || userInput > 12); //end userInput

		      	System.out.print("Please select one of the following option: ");

		
        showAnimalBreeds(filename);
      	System.out.print("Please select one of the following option: ");

      	

        Scanner selectedBreedScanner = new Scanner(System.in);
        int selectedBreedUserInput = selectedBreedScanner.nextInt();

        String selectedBreed = animalBreeds.get(selectedBreedUserInput - 1);

        OwnersInfo(selectedBreed.replaceAll("^[\\s\\.\\d]+", ""));

        System.out.println("Congratulations on adopting a " + selectedBreed.replaceAll("^[\\s\\.\\d]+", "") + "!");

        animalBreeds.remove(selectedBreedUserInput - 1);

        try {
            FileWriter animalBreedWriter = new FileWriter(filename);
            for (int i = 0; i < animalBreeds.size(); i++) {
                animalBreedWriter.write(String.format("%d. %s\n", i + 1, animalBreeds.get(i).replaceAll("^[\\s\\.\\d]+", "")));
            }
            animalBreedWriter.close();
        } catch (IOException e) {
            System.out.println(String.format("%s Not Found", filename));
        }







    } //ends void adopt()


    public static void showAnimalBreeds(String filename) {
        // read data from file and print all the option available 

        try {
            Scanner animalBreedScanner = new Scanner(new File(filename));
            while (animalBreedScanner.hasNextLine()) {
                String line = animalBreedScanner.nextLine();
                animalBreeds.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } //end IOException



        for (int i = 0; i < animalBreeds.size(); i++) {
            System.out.println(animalBreeds.get(i));
        }
    }

    public void adoptSelection() { //start adoptSelection
        String[] adoptOptions = { //start adoptOptions
            "1. Apply for Adoption",
            "2. Return to Breed Selection",
            "3. Exit"
        }; //end adoptOptions

        for (int i = 0; i < adoptOptions.length; i++) { //start for 
            System.out.println(adoptOptions[i]);
        } //end for 

        Scanner adoptSelectionScanner = new Scanner(System.in);
        int adoptSelectionUserInput = adoptSelectionScanner.nextInt();


    } //end adoptSelection

	public static void OwnersInfo(String animalBreed) { //start OwnersInfo

        Scanner c = new Scanner(System.in);

        System.out.println("Please your full name: ");
        String fullNam = c.nextLine();

        System.out.println("Enter your street address: ");
        String streetAdd = c.nextLine();

        System.out.println("Enter your City: ");
        String cityAdd = c.nextLine();

        System.out.println("Enter your State: ");
        String stateAdd = c.nextLine();

        System.out.println("Enter your Zip Code: ");
        String zipAdd = c.nextLine();

        System.out.println("Enter your Country: ");
        String countryAdd = c.nextLine();

        System.out.println("Enter your phone number: ");
        String phoneNum = c.nextLine();

        System.out.println("Enter your email: ");
        String eMail = c.nextLine();


        try {
            FileWriter OwnInfo = new FileWriter("OwnersInfo.txt", true);
            OwnInfo.write("Full Name: " + fullNam + "\r\n");
            OwnInfo.write("Home Address: " + streetAdd + "," + cityAdd + "," + stateAdd + "," + zipAdd + "," + countryAdd + "\r\n");
            OwnInfo.write("Phone Number: " + phoneNum + "\r\n");
            OwnInfo.write("Email: " + eMail + "\r\n");
          	OwnInfo.write("Animal Breed: " + animalBreed + "\r\n");
            OwnInfo.write("********************************");
            OwnInfo.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    } //ends OwnersInfo
} //end adopt



