package marsrover;

public class Coordinates {

    private static final int LOWER_BOUND = 0;
    private int xCoordinate;
    private int yCoordinate;

    public Coordinates(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    public int getXCoordinate() {
        return xCoordinate;
    }

    void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    boolean isXCoordinateWithinBound(int xCoordinate) {
        return this.xCoordinate <= xCoordinate;
    }

    boolean isYCoordinateWithinBound(int yCoordinate) {
        return this.yCoordinate <= yCoordinate;
    }

    boolean isXCoordinateWithinLowerBound(int xCoordinate) {
        return xCoordinate >= LOWER_BOUND;
    }

    boolean isYCoordinateWithinLowerBound(int yCoordinate) {
        return yCoordinate >= LOWER_BOUND;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }
}
