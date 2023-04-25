import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;




public class GiveUpForAdoption { //start
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

        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
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

      	//RESPONSIBLE FOR PRINTING THE FILE
      	showAnimalBreeds(filename);
		System.out.print("Please select one of the following option: ");

			      
      
        Scanner selectedBreedScanner = new Scanner(System.in);
        int selectedBreedUserInput = selectedBreedScanner.nextInt();

        String selectedBreed = animalBreeds.get(selectedBreedUserInput - 1);

        GiveUpInfo(selectedBreed.replaceAll("^[\\s\\.\\d]+", ""));

        System.out.println("Thank you for giving a " + selectedBreed.replaceAll("^[\\s\\.\\d]+", "") + " up for adoption!");
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

    public static void GiveUpInfo(String animalBreed) { //start OwnersInfo

        Scanner c = new Scanner(System.in);

        System.out.println("What is the animal's name? ");
        String aniNam = c.nextLine();

        System.out.println("How old is the animal (in months)?");
        String aniAge = c.nextLine();

        System.out.println("Is the animal (s)payed or (n)eutered? ");
        String aniSpr = c.nextLine();

        System.out.println("Is the animal up-to-date on vaccinations? y/n ");
        String aniVac = c.nextLine();

        System.out.println("What is the animal's personality like? ");
        String aniPer = c.nextLine();

        System.out.println("Does the animal have any health or behavior issues? y/n ");
        String aniHeal = c.nextLine();

        System.out.println("Why are you putting the animal up for adoption? ");
        String aniRea = c.nextLine();

        System.out.println("Are there any special needs or requirements that the animal has? y/n ");
        String aniSpe = c.nextLine();



        try { //start FileWriter
            FileWriter OwnInfo = new FileWriter("GiveUpInfo.txt", true);
            //because of try, everything is going to be skipped up until .close
            OwnInfo.write("Full Name of Animal: " + aniNam + "\r\n");
          	OwnInfo.write("Animal Breed: " + animalBreed + "\r\n");
            OwnInfo.write("Age of Animal: " + aniAge + "\r\n");
            OwnInfo.write("Spayed or Neutered? " + aniSpr + "\r\n");
            OwnInfo.write("Up-To-Date on Vaccinations? " + aniVac + "\r\n");
            OwnInfo.write("Animal's Personality: " + aniPer + "\r\n");
            OwnInfo.write("Health or Behavior Issues? " + aniHeal + "\r\n");
            OwnInfo.write("Reason For Adoption " + aniRea + "\r\n");
            OwnInfo.write("Special Needs or Requirements? " + aniSpe + "\r\n");
            OwnInfo.write("********************************");
            OwnInfo.close();
        } //end FileWriter
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } //end IOException

    } //ends OwnersInfo
} //end adopt
