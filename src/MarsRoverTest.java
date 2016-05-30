import MarsRover.Exceeption.InvalidInstructionStringException;
import MarsRover.main.Coordinates;
import MarsRover.main.Direction;
import MarsRover.main.MarsRovers;
import MarsRover.main.Plateau;

import java.util.Scanner;

public class MarsRoverTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int xHigherLimitOfPlateau = sc.nextInt();
        int yHigherLimitOfPlateau = sc.nextInt();
        Coordinates plateauCoordinates = new Coordinates(xHigherLimitOfPlateau, yHigherLimitOfPlateau);
        Plateau plateau = new Plateau(plateauCoordinates);
        for (int i = 0; i < 2; i++) {

            int marsRoverXCoordinate = sc.nextInt();
            int marsRoverYCoordinate = sc.nextInt();
            Coordinates marsRoverCordinates = new Coordinates(marsRoverXCoordinate, marsRoverYCoordinate);
            char roverHeading = sc.next().charAt(0);
            Direction roverDirection = new Direction(roverHeading);
            MarsRovers marsRover = new MarsRovers(marsRoverCordinates, roverDirection, plateau);
            String instructions = sc.next();
            for (int j = 0; j < instructions.length(); j++) {

                char checker = instructions.charAt(j);
                if (checker != 'L' || checker != 'M' || checker != 'R') {

                    throw new InvalidInstructionStringException("Invalid Instruction String");
                }
            }
            marsRover.navigate(instructions);

            System.out.println(marsRover.getCoordinates().getxCoordinate() + " " + marsRover.getCoordinates().getyCoordinate() + " " + marsRover.getHeading().getDirection());

        }

    }
}
