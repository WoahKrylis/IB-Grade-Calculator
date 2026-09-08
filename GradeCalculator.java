import java.util.Scanner; // Scans user input
public class GradeCalculator { // in order to make the container
    public static void main(String[] args) throws Exception{ // "Engine" of the thing essentially.
        System.out.println("Welcome to IB Grade Calculator");
        Thread.sleep(2000);
        System.out.println("Please enter your grade");
       // int grade = 85; // Apparently 85% is a 7 so we go with that
        // this is assuming the formative is out of 8 and has a score of 100 though.

Scanner ginput = new Scanner(System.in); // yeah
int grade = ginput.nextInt(); // all this asks makes prompts u to write the thing

        if (grade >= 94) {
            System.out.println("You are at 94/100 which is a 8/8"); // lowest for 8
        }
if (grade >= 82) {
    System.out.println("You are at 82/100 yay"); // this is the lowest you get for 7
}
else if (grade >= 69) {
    System.out.println("You are at 69/100 yay"); // it's 5,52 lowest rounds up to 6
}

else if (grade >= 57) {
    System.out.println("you got 57/100 yayy"); // it's 4,56 rounds up to 5
}

else if (grade >= 44) {
    System.out.println("you got 44/100 yayy"); // 3,52 rounds up to 4
}

else if (grade >= 32) {
    System.out.println("you got 32/100 yayy"); // 2,56 rounds up to a 3
}

else if (grade >= 19) {
    System.out.println("you got 19/100 yayy"); // 1,52 rounds to 2 fully
}

else if (grade <= 18) {
    System.out.println("you got 18/100 yayy"); // anything  below 1,52 is a 1 or 0 so no point adding it
}


        // Pretty much code goes inside here since this is "inside the engine" so what gonna run

    } // End of the engine
} // end of code
