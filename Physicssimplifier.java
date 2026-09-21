import java.util.Scanner;
import java.lang.Math;

public class Physicssimplifier {
    private float force = 0.0f;
    private float mass = 0.0f;
    private float acceleration = 0.0f;

    public Physicssimplifier() {}

    public float newtonsecondlaw() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the name of the current user?");
        String myname = keyboard.nextLine();

        if (!myname.equals("Teo")) {
            for (int i = 0; i < 3; i++) {
                System.out.println("ERROR! User unauthorized or misspelled. Try again:");
                myname = keyboard.nextLine();
                if (myname.equals("Teo")) break;
            }
            if (!myname.equals("Teo")) {
                System.out.println("Sorry, you had four tries. System shutting down...");
                System.exit(0);
            }
        }

        System.out.println("Hello " + myname + "! This is an F = m * a function.");
        System.out.println("Enter Force Applied (0 if unknown):");
        force = keyboard.nextFloat();
        System.out.println("Enter Mass (0 if unknown):");
        mass = keyboard.nextFloat();
        System.out.println("Enter Acceleration (0 if unknown):");
        acceleration = keyboard.nextFloat();

        if (force != 0 && mass != 0 && acceleration == 0) {
            acceleration = force / mass;
            System.out.println(acceleration + " = Acceleration");
            return acceleration;
        } else if (force == 0 && mass != 0 && acceleration != 0) {
            force = mass * acceleration;
            System.out.println(force + " = Force");
            return force;
        } else if (force != 0 && mass == 0 && acceleration != 0) {
            mass = force / acceleration;
            System.out.println(mass + " = Mass");
            return mass;
        } else {
            System.out.println("Not enough information to solve.");
            return 0;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Physicssimplifier mysimplifier = new Physicssimplifier();
        mysimplifier.newtonsecondlaw();
    }
}
