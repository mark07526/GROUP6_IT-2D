# GROUP6_IT2DSure! Here’s a clean and ready-to-use README.md for your Java project:

Writing
Service Order Ticketing System
📌 Description

The Service Order Ticketing System is a simple Java console-based application designed to create and display service order tickets for computer-related services.

The program allows the user to:

Enter the customer's name
Select a computer service
Enter a service description
Enter a ticket number
Automatically assign the price based on the selected service
Display a complete service order ticket
Set the initial ticket status to Pending

This project is suitable for beginners learning Java, particularly input handling, variables, conditional statements, and switch statements.

🛠️ Technologies Used
Java
Scanner Class – used to receive user input from the keyboard
Switch Statement – used to determine the selected service and price
Console Output – used to display the service menu and ticket information
📋 Available Services
Choice	Service	Price
1	Computer Repair	₱500
2	Software Installation	₱300
3	Virus Removal	₱400
4	Computer Cleaning	₱250
⚙️ How the Program Works
The program displays the Service Order Ticketing title.
The user enters the customer's name.
The program displays the available services.
The user selects a service from 1 to 4.
A switch statement determines the selected service and its corresponding price.
The user enters a description of the requested service.
The user enters a ticket number.
The program displays the completed service order ticket.
The ticket status is automatically set to Pending.
The Scanner is closed when the program finishes.
▶️ How to Run
1. Install Java

Make sure that the Java Development Kit (JDK) is installed on your computer.

You can check if Java is installed by running:

java -version

2. Save the File

Save the source code as:

ServiceOrderTicketing.java


The filename must match the public class name:

public class ServiceOrderTicketing

3. Compile the Program

Open a terminal or command prompt in the folder containing the Java file and run:

javac ServiceOrderTicketing.java

4. Run the Program

After successful compilation, run:

java ServiceOrderTicketing

💻 Sample Output
=================================
     SERVICE ORDER TICKETING
=================================
Enter Customer Name: Juan Dela Cruz

Available Services:
1. Computer Repair - ₱500
2. Software Installation - ₱300
3. Virus Removal - ₱400
4. Computer Cleaning - ₱250

Choose a service (1-4): 1
Enter Service Description: Computer is not turning on
Enter Ticket Number: 1001

=================================
       SERVICE ORDER TICKET
=================================
Ticket Number : 1001
Customer Name : Juan Dela Cruz
Service       : Computer Repair
Description   : Computer is not turning on
Price         : ₱500.0
Status        : Pending
=================================

❌ Invalid Service Selection

If the user enters a number outside the range 1-4, the program displays:

Invalid service choice.


The program then terminates.

🧩 Main Components
Scanner

The program uses:

Scanner input = new Scanner(System.in);


This allows the program to receive information entered by the user.

Variables

The program uses several variables to store ticket information:

String customerName;
String service;
String description;
int ticketNumber;
double price;

Switch Statement

The switch statement determines the service and price:

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
}

📁 Project Structure
ServiceOrderTicketing/
│
├── ServiceOrderTicketing.java
└── README.md

🎯 Learning Objectives

This project demonstrates the following Java programming concepts:

Variables and data types
Scanner for user input
System.out.println() and System.out.print()
switch-case statements
if-style validation through the default case
String handling
Integer and double data types
Basic console-based application design
Proper resource closing with input.close()
🚀 Possible Improvements

The program can be expanded in the future by adding:

Automatic ticket number generation
Multiple service orders
Customer contact information
Ticket status updates
Search for existing tickets
Edit or cancel tickets
Total cost calculation for multiple services
Saving tickets to a file or database
A graphical user interface (GUI)
Login and user authentication
👨‍💻 Author

Service Order Ticketing System

A beginner-friendly Java console application for managing basic computer service orders.

📄 License

This project is intended for educational purposes and may be freely modified and improved for learning.

You can copy everything inside the block directly into a file named README.md and place it in the same folder as ServiceOrderTicketing.java.
