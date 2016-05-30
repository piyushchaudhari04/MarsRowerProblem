package MarsRover.main;

public class Coordinates {

    public static final int LOWER_BOUND = 0;
    private int xCoordinate;
    private int yCoordinate;

    public Coordinates(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    public int getxCoordinate() {
        return xCoordinate;
    }


    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    public boolean isXCoordinateWithenBound(int xCoordinate) {

        if (this.xCoordinate <= xCoordinate) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isYCoordinateWithenBound(int yCoordinate) {

        if (this.yCoordinate <= yCoordinate) {

            return true;
        } else {

            return false;
        }
    }

    public boolean isXCoordinateWithenLowerBound(int xCoordinate) {

        if (xCoordinate >= LOWER_BOUND) {

            return true;
        } else {

            return false;
        }
    }

    public boolean isYCoordinateWithenLowerBound(int yCoordinate) {


        if (yCoordinate >= LOWER_BOUND) {

            return true;
        } else {

            return false;
        }

    }

}
