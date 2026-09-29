import java.util.Scanner;

public class ServiceOrderTicketing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String customerName;
        String service;
        String description;
        String maintenanceAction;
        String jobStatus;
        int ticketNumber;
        int choice;
        int statusChoice;
        double price;

        System.out.println("================================================");
        System.out.println(" SERVICE ORDER TICKETING AND JOB MAINTENANCE ");
        System.out.println("================================================");

        System.out.print("Enter Customer Name: ");
        customerName = input.nextLine();

        System.out.println("\nAvailable Services:");
        System.out.println("1. Computer Repair - P500");
        System.out.println("2. Software Installation - P300");
        System.out.println("3. Virus Removal - P400");
        System.out.println("4. Computer Cleaning - P250");

        System.out.print("\nChoose a service (1-4): ");
        choice = input.nextInt();
        input.nextLine();

        switch (choice) {

            case 1:
                service = "Computer Repair";
                price = 500;
                break;

            case 2:
                service = "Software Installation";
                price = 300;
                break;

            case 3:
                service = "Virus Removal";
                price = 400;
                break;

            case 4:
                service = "Computer Cleaning";
                price = 250;
                break;

            default:
                System.out.println("Invalid service choice.");
                input.close();
                return;
        }

        System.out.print("Enter Service Description: ");
        description = input.nextLine();

        System.out.print("Enter Maintenance Action: ");
        maintenanceAction = input.nextLine();

        System.out.println("\nJob Status:");
        System.out.println("1. Pending");
        System.out.println("2. In Progress");
        System.out.println("3. Completed");

        System.out.print("Choose Job Status (1-3): ");
        statusChoice = input.nextInt();

        switch (statusChoice) {

            case 1:
                jobStatus = "Pending";
                break;

            case 2:
                jobStatus = "In Progress";
                break;

            case 3:
                jobStatus = "Completed";
                break;

            default:
                System.out.println("Invalid job status.");
                input.close();
                return;
        }

        System.out.print("Enter Ticket Number: ");
        ticketNumber = input.nextInt();

        System.out.println("\n================================================");
        System.out.println(" SERVICE ORDER");
        System.out.println("================================================");

        System.out.println("Customer Name       : " + customerName);
        System.out.println("Ticket Number       : " + ticketNumber);
        System.out.println("Service             : " + service);
        System.out.println("Description         : " + description);
        System.out.println("Price               : P" + String.format("%.2f", price));

        System.out.println("\n================================================");
        System.out.println(" JOB MAINTENANCE TRACKER");
        System.out.println("================================================");

        System.out.println("Maintenance Action  : " + maintenanceAction);
        System.out.println("Job Status          : " + jobStatus);

        System.out.println("================================================");
        System.out.println(" Order successfully created!");
        System.out.println("================================================");

        input.close();
    }
}