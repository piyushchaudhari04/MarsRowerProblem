package marsrover;

import exception.CoordinateOutOfBoundsException;

public class MarsRovers {


    private Coordinates coordinates;
    private Direction heading;
    private Plateau plateau;

    public MarsRovers(Coordinates coordinates, Direction heading, Plateau plateau) {
        this.coordinates = coordinates;
        this.heading = heading;
        this.plateau = plateau;
    }

    private void turnLeft(char argument) {

        heading.updateHeading(argument);
    }

    private void turnRight(char argument) {

        heading.updateHeading(argument);
    }

    private void moveForward() {

        switch (heading.getDirection()) {

            case 'N':

                if (coordinates.isYCoordinateWithinBound(plateau.getHigherLimit().getYCoordinate() - 1)) {

                    coordinates.setYCoordinate(coordinates.getYCoordinate() + 1);
                } else {
                    throw new CoordinateOutOfBoundsException("Y Coordinates out of bounds Exception");
                }
                break;
            case 'W':
                if (coordinates.isXCoordinateWithinLowerBound(coordinates.getYCoordinate() - 1)) {


                    coordinates.setXCoordinate(coordinates.getXCoordinate() - 1);

                } else {

                    throw new CoordinateOutOfBoundsException("X Coordinates out of bounds Exception");
                }
                break;
            case 'E':
                if (coordinates.isXCoordinateWithinBound(plateau.getHigherLimit().getXCoordinate() - 1)) {

                    coordinates.setXCoordinate(coordinates.getXCoordinate() + 1);

                } else {

                    throw new CoordinateOutOfBoundsException("X Coordinates out of bounds Exception");
                }
                break;
            case 'S':
                if (coordinates.isYCoordinateWithinLowerBound(coordinates.getYCoordinate() - 1)) {

                    coordinates.setYCoordinate(coordinates.getYCoordinate() - 1);

                } else {

                    throw new CoordinateOutOfBoundsException("Y Coordinates out of bounds Exception");
                }
        }
    }

    public void navigate(String instructions) {

        for (int i = 0; i < instructions.length(); i++) {

            switch (instructions.charAt(i)) {

                case 'L':
                    turnLeft(instructions.charAt(i));
                    break;
                case 'R':
                    turnRight(instructions.charAt(i));
                    break;
                case 'M':
                    moveForward();
            }
        }
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Direction getHeading() {
        return heading;
    }
}

