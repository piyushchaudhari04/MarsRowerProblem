package MarsRover.main;

import MarsRover.Exceeption.CoordinateOutOfBoundsException;

public class MarsRovers {



    private  Coordinates coordinates;
    private Direction heading;
    private Plateau plateau;

    public MarsRovers(Coordinates coordinates, Direction heading, Plateau plateau) {
        this.coordinates = coordinates;
        this.heading = heading;
        this.plateau = plateau;
    }

    public void turnLeft(char argument){

        heading.updateHeading(argument);
    }

    public void turnRight(char argument){

        heading.updateHeading(argument);
    }


    public void moveForward(){

        switch (heading.getDirection()) {

            case 'N':

                if (coordinates.isYCoordinateWithenBound(plateau.getHigherLimit().getyCoordinate()-1)) {

                        coordinates.setyCoordinate(coordinates.getyCoordinate()+1);
                }
                else {
                    throw new CoordinateOutOfBoundsException("Y Coordinates out of bounds Exception");
                }
                break;
            case 'W':
                if (coordinates.isXCoordinateWithenLowerBound(coordinates.getxCoordinate()-1)) {


                        coordinates.setxCoordinate(coordinates.getxCoordinate()-1 );

                } else {

                    throw new CoordinateOutOfBoundsException("X Coordinates out of bounds Exception");
                }
                break;
            case 'E':
                if (coordinates.isXCoordinateWithenBound(plateau.getHigherLimit().getxCoordinate()-1)) {

                       coordinates.setxCoordinate(coordinates.getxCoordinate()+1);

                }
                else{

                    throw new CoordinateOutOfBoundsException("X Coordinates out of bounds Exception");
                }
                break;
            case 'S':
                if(coordinates.isYCoordinateWithenLowerBound(coordinates.getyCoordinate()-1)){

                        coordinates.setyCoordinate(coordinates.getyCoordinate()-1);

                }
                else{

                    throw new CoordinateOutOfBoundsException("Y Coordinates out of bounds Exception");
                }
        }
    }

    public void navigate(String instructions){

        for(int i=0;i<instructions.length();i++){

            switch(instructions.charAt(i)){

                case 'L': turnLeft(instructions.charAt(i));
                          break;
                case 'R': turnRight(instructions.charAt(i));
                          break;
                case 'M': moveForward();
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

