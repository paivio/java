/* Define an integer variable called bankBalance. Initialize it to a value of 500. Then add 250 to it. Then subtract 100 from it. Finally, print the resulting value. */

int bankBalance = 500;
bankBalance = bankBalance + 250 - 100;
System.out.println(bankBalance);


/* Write Java code to define an integer variable called day, and a String variable called month. Give month and day appropriate values for your birthday. */

int day;
String month;
day = 7;
month = "June";


/* Write Java code to create a String variable called firstName, define it to be your first name as a String. Then define a variable called lastName and define it to be your last name as a String. Then define a variable called fullName and set it to be your first name followed by a space followed by your last name. Use the existing variables for your first and last name and String concatenation to define fullName. Finally, write code to print this text: 
Hello, my name is [full name]. 
There are [number] letters in my name. */

String firstName = "Päivi";
String lastName = "Ojala";
String fullName = firstName + " " + lastName;
int number = firstName.lenght() + lastName.lenght();
System.out.println("Hello, my name is " + fullName + ".");
System.out.println("There are " + number + " letters on my name.");


/* Write Java code to define a double variable called fahrenheit and set it to an initial value between 0 and 100. Then, create a double variable called celsius, and calculate its value based on the value of fahrenheit. (To convert from Fahrenheit to Celsius, subtract 32, then multiply by 5, then divide by 9.) Finally, print the final value of celsius. */

double fahrenheit = 10.2;
double celsius;
celsius = (fahrenheit - 32) * 5 / 9;
System.out.println(celsius);

