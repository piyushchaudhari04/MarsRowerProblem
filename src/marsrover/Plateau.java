package marsrover;

public class Plateau {

    private Coordinates higherLimit;

    public Plateau(Coordinates higherLimit) {
        this.higherLimit = higherLimit;
    }

    Coordinates getHigherLimit() {
        return higherLimit;
    }
}
