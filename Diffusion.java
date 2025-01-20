import java.util.Random;
import java.util.Scanner;

public class Diffusion {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    
        public static boolean flipACoin() {
            Random random = new Random();
            int randomNumber = random.nextInt(2);
            if(randomNumber == 0) {
                return true;
            }
            else {
                return false;
            }
        }
    
        public static void main(String[] args) {
            int numberOfSteps = 0, numberOfTrials = 0;

            System.out.println("How many steps? ");
            numberOfSteps = scanner.nextInt();

            System.out.println("How many trials? ");
            numberOfTrials = scanner.nextInt();

            int[] finalPositions = new int[numberOfTrials];

            for(int trial = 0; trial < numberOfTrials; trial++) {
                int currentPosition = 0;
                for(int step = 0; step < numberOfSteps; step++) {
                    if(flipACoin()) {
                        currentPosition++;
                    }
                    else {
                        currentPosition--;
                    }
                }
                // System.out.println("Trial # " + trial + ":");
                // System.out.println("    Total steps: " + numberOfSteps);
                // System.out.println("    Final position: " + currentPosition + "\n");

                finalPositions[trial] = currentPosition;
            }

            System.out.println("\nFinal positions for all trials:");
            for (int i = 0; i < numberOfTrials; i++) {
                System.out.printf("Trial #%d: Final Position = %d%n", i + 1, finalPositions[i]);
            }
        }
    }

    