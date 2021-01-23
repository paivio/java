/* You are programming the behavior of an enemy in a video game. The enemy code has access to two boolean variables, canSeePlayer and playerPoweredUp. canSeePlayer is true
when the enemy can see the player and false otherwise, and playerPoweredUp is true when the player has found a special item that makes them impossible to defeat temporarily. 
Fill in the correct conditions so that \Attack!" is printed when the enemy can see the player and the player is not powered-up, \Run away!" is printed when the player is 
visible and is powered-up, and finally, \Wander." is printed if the player is not visible. */

if (canSeePlayer) {
	if (!playerPoweredUp) {
		System.out.println("Attack!");
	} else {
		System.out.println("Run away!")
	}
} else {
	System.out.println("Wander.")
}


/* Assume you have access to two boolean variables, isSnowing, and isRaining, and one double variable, temperature. isSnowing is true when it's snowing and false otherwise,
isRaining is true when it's raining and false otherwise, and temperature gives the outdoor temperature in degrees Fahrenheit. Write code that prints \Let's stay home." if 
it's raining, snowing, or below 50 degrees Fahrenheit (10 degrees Celsius), and prints \Let's go out!" otherwise. */

boolean isSnowing = false;
boolean isRaining = true;
double temperature = 60.0;
if (isSnowing || isRaining || temperature < 50) {
	System.out.println("Let's stay home.");
} else {
	System.out.println("Let's go out!");
}


/* Assume you have access to a integer variable called time. Write code that assigns a different value to the String variable timeOfDay based on the value of time in hours. 
If time is between 5 and 12, including 5 but not including 12, set timeOfDay to \morning". If time is between 12 and 20, including 12 but not including 20, set timeOfDay to 
\daytime". Finally, if the time variable does not satisfy either condition, set timeOfDay to \night". */

int time = 18;
String timeOfDay;
if (time >= 5 && time < 12) {
	timeOfDay = "morning";
} else if (time >= 12 && time < 20) {
	timeOfDay = "daytime";
} else {
	timeOfDay = "night";
}


/* Assume you have access to an integer variable called weekday and a boolean variable called holiday, which is true when it is a holiday and false on normal days. Write Java
code that prints \Wake up at 7:00" on weekdays that are not holidays, and prints \Sleep in!" on weekends and holidays. For the variable weekday, use this key:
1 = Monday
2 = Tuesday
3 = Wednesday
4 = Thursday
5 = Friday
6 = Saturday
7 = Sunday */

int weekday = 5;
boolean holiday = false;
if (holiday || weekday == 6 || weekday == 7) {
	System.out.println("Sleep in!");
} else {
	System.out.println("Wake up at 7:00");
}


/* Assume the int variable dayOfWeek has some value, and that it follows this rule:
1 = Monday
2 = Tuesday
3 = Wednesday
4 = Thursday
5 = Friday
6 = Saturday
7 = Sunday
Declare a String variable called schedule and write a switch statement that gives schedule a different value based on the day of the week. For Monday, give it the value 
\Gym in the morning." For Tuesday give it the value \Class after work." For Wednesday, give it the value \Meetings all day." For Thursday give it the value \Work from home." 
For Friday, give it the value \Game night after work." For Saturday and Sunday, give it the value \Free!" This should also be the default value. */

int dayOfWeek = 1;
String schedule;
switch (dayOfWeek) {
	case 1:
		schedule = "Gym in the morning.";
		break;
	case 2:
		schedule = "Class after work.";
		break;
	case 3:
		schedule = "Meetings all day.";
		break;
	case 4:
		schedule = "Work from home.";
		break;
	case 5:
		schedule = "Game night after work.";
		break;
	default:
		schedule = "Free!";
		break;
}

