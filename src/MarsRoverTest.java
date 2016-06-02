import exception.InvalidInstructionException;
import marsrover.Coordinates;
import marsrover.Direction;
import marsrover.MarsRovers;
import marsrover.Plateau;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MarsRoverTest {

    private static final String INVALID_INSTRUCTION = "Invalid Instruction";
    private static MarsRovers marsRover;
    private static String instruction;
    private static Plateau plateau;
    private static Scanner sc;

    private static void plateauInput() {
        sc = new Scanner(System.in);
        int xHigherLimit = sc.nextInt();
        int yHigherLimit = sc.nextInt();
        Coordinates plateauCoordinates = new Coordinates(xHigherLimit, yHigherLimit);
        plateau = new Plateau(plateauCoordinates);
    }

    private static void marsRoverInput() {
        int marsRoverXCoordinate = sc.nextInt();
        int marsRoverYCoordinate = sc.nextInt();
        Coordinates marsRoverCoordinates = new Coordinates(marsRoverXCoordinate, marsRoverYCoordinate);
        char roverHeading = sc.next().charAt(0);
        Direction roverDirection = new Direction(roverHeading);
        marsRover = new MarsRovers(marsRoverCoordinates, roverDirection, plateau);
        instruction = sc.next();
        Pattern p = Pattern.compile("[LMN]+");
        Matcher m = p.matcher(instruction);
        if (!(m.find() && instruction.equals(m.group()))) {
            throw new InvalidInstructionException(INVALID_INSTRUCTION);
        }
    }

    private static void navigateRover() {
        marsRover.navigate(instruction);
    }

    public static void main(String[] args) {

        plateauInput();
        for (int i = 0; i < 2; i++) {
            marsRoverInput();
            navigateRover();
            System.out.println(marsRover.getCoordinates().getXCoordinate() + " " + marsRover.getCoordinates().getYCoordinate() + " " + marsRover.getHeading().getDirection());
        }

    }
}

