import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VolunteerApplication {

    public static void volunteer() {
        Scanner c = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
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

        System.out.println("Why do you want to volunteer at our adoption center? ");
        String whyVol = c.nextLine();

        System.out.println("How many months of experience do you have working with animals? ");
        String expVol = c.nextLine();

        System.out.println("Have you ever volunteered at an animal shelter or adoption center before? y/n ");
        String preVol = c.nextLine();

        System.out.println("How many days a week are you able to commit to volunteering at the adoption center? ");
        String daysVol = c.nextLine();

        System.out.println("How would you handle a situation where an animal becomes aggressive or uncooperative? ");
        String aggVol = c.nextLine();

        System.out.println("Are you able to handle physically demanding tasks, such as lifting heavy bags of food or cleaning kennels? y/n ");
        String heaVol = c.nextLine();

        System.out.println("Are you willing to follow all safety and sanitation protocols to ensure the health and safety of the animals, staff, and other volunteers? y/n ");
        String protoVol = c.nextLine();
      
        try {
            FileWriter OwnInfo = new FileWriter("Volunteers.txt", true);
            OwnInfo.write("Full Name: " + fullNam + "\r\n");
            OwnInfo.write("Home Address: " + streetAdd + "," + cityAdd + "," + stateAdd + "," + zipAdd + "," + countryAdd + "\r\n");
            OwnInfo.write("Phone Number: " + phoneNum + "\r\n");
            OwnInfo.write("Reason to volunteer: " + whyVol + "\r\n");
            OwnInfo.write("Years of experience : " + expVol + "months" + "\r\n");
            OwnInfo.write("Volunteered at an animal shelter or adoption center before: " + preVol + "\r\n");
            OwnInfo.write("Available " + daysVol + "days a week" + "\r\n");
            OwnInfo.write("If an animal becomes aggressive, " + fullNam + " would " + aggVol + "\r\n");
            OwnInfo.write("Lift Heavy Bags? " + heaVol + "\r\n");
            OwnInfo.write("Willing to follow all safety and sanitation protocols: " + protoVol + "\r\n");
            OwnInfo.write("********************************");
            OwnInfo.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    } //ends OwnersInfo
} //end adopt


