import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;

/*AnimalAdoption.java*/
public class AnimalAdoption {

    //main method
    //throw clause may throw to the IOexception 
    //any main method either should catch IOexception or declare 
    //that it may throw an exception as well 
    public static void main(String[] args) throws IOException {
        //1. make a login system
        Scanner sc = new Scanner(System.in);
        String prompt;
        int reprompt = 0;
		
      	loginMenu();
        //ask user if you want to login or make an account. 

        while (reprompt != 8) {
            //once user if logged in, give them the menu
          	System.out.println("Welcome to Animal Adoption Center!");
            System.out.println("1. Adopt\r\n" +
                "2. Give up for Adoption\r\n" +
                "3. Volunteer\r\n" +
                "4. About Us\r\n" +
                "5. Exit");
            //prompt for the user choice
            System.out.print("Please select one of the following option: ");
            //read the input as a integers using a scanner object (sc) 
            //store the input in reprompt 
            reprompt = sc.nextInt();
          
          	System.out.println("");
            //Use switch case for the input choice
            //the switch statement performs a specific action based on the user's choice
            switch (reprompt) {
                case 1:
                    SelectionAdopt.adopt(); //write this method
                    break;
                case 2:
                    GiveUpForAdoption.adopt();
                    break;
                case 3:
                    VolunteerApplication.volunteer();
		    break;
                case 4:
                    aboutUs();
		    break;
                case 5:
                    return;
                default:
                    //print this to the console if the user's input isn't valid
                    System.out.println("Not a valid option, please try again");
                    break;
            }
        }
    }

		public static void loginMenu() {
		
      	
      	int userInput = 0;
      	
      	Scanner userInputScanner = new Scanner(System.in);
      	Scanner usernameScanner = new Scanner(System.in);
      	Scanner passwordScanner = new Scanner(System.in);
      
      	String username = "";
     	String password = "";
      
      	boolean loggedIn = false;
      
      	while ((userInput > 2 || userInput < 1) || !loggedIn) {
      	    System.out.println("1. Create an Account");
      	    System.out.println("2. Log in");
          	userInput = userInputScanner.nextInt();
          
          	switch (userInput) {
              case 1:
                System.out.println("Create an account");
                System.out.println("Enter username: ");
                username = usernameScanner.nextLine();
                System.out.println("Enter password: ");
                password = passwordScanner.nextLine();
                
                try {
                  	FileWriter loginWriter = new FileWriter("LoginInfo.txt", true);
                	loginWriter.write(String.format("Username: %s\n", username));
                	loginWriter.write(String.format("Password: %s\n", password));
            		loginWriter.close();
                } catch (IOException e) {
                  System.out.println(String.format("LoginInfo.txt Not Found"));
                }
                
                break;
              
              case 2:
                System.out.println("Log in");
                System.out.println("Enter username: ");
                username = usernameScanner.nextLine();
                System.out.println("Enter password: ");
                password = passwordScanner.nextLine();
                
                username = "Username: " + username;
                password = "Password: " +  password;

                try {
            		Scanner loginScanner = new Scanner(new File("LoginInfo.txt"));
            		while (loginScanner.hasNextLine()) {
                		String scannedUsername = loginScanner.nextLine();
                      	String scannedPassword = loginScanner.nextLine();

                      	if (username.equals(scannedUsername) && password.equals(scannedPassword)) {
                        	loggedIn = true;
                        }
            		}
                  	
                  	if (loggedIn == false) {
                      	System.out.println("Invalid username/password");
                    }
                  		
        		} catch (FileNotFoundException e) {
            		System.out.println("File not found.");
            		e.printStackTrace();
        		} //end IOException
        		break;
    
              default:
                System.out.println("Not a valid option, please try again");
                break;
            }
        }
        System.out.println("");
    }



    public static void aboutUs() {
        System.out.println("	Welcome to our International Animal Adoption Center, where we are committed to finding loving and permanent homes for animals in need from all around the world.\r\n");
        System.out.println("	Our organization was founded with the mission of reducing animal suffering and promoting responsible pet ownership worldwide. We work tirelessly to rescue and rehabilitate animals of all species, including dogs, cats, rabbits, birds, and other small animals, and connect them with caring and responsible adopters across the globe.\r\n");
        System.out.println("	Our team is made up of passionate animal lovers and dedicated professionals who are committed to providing the highest standard of care for our animals. We provide medical treatment, nutritious food, socialization, and training to ensure that every animal in our care is healthy, happy, and ready to start their new life with a loving family.\r\n");
        System.out.println("	Our adoption process is designed to match each animal with the best possible adopter, taking into consideration their unique needs, personality, and lifestyle. We provide ongoing support to our adopters to ensure that they have all the resources they need to provide a safe and happy home for their new companion.\r\n");
        System.out.println("	We believe that every animal deserves a loving home, and we are committed to making a difference in the lives of animals and people around the world. Join us in our mission to create a world where all animals are treated with kindness, respect, and compassion.\r\n");
      
      int userInput = 0;
      do {
        System.out.println("1. Go back to menu");
      	Scanner userInputScanner = new Scanner(System.in);
		userInput = userInputScanner.nextInt();
      	
      } while (userInput != 1);
      
    }

	
	
	
}

