package marsrover;

public class Direction {

    private char heading;

    public Direction(char direction) {
        this.heading = direction;
    }

    void updateHeading(char argument) {
        if (argument == 'L') {

            switch (heading) {
                case 'N':
                    this.heading = 'W';
                    break;
                case 'W':
                    this.heading = 'S';
                    break;
                case 'S':
                    this.heading = 'E';
                    break;
                case 'E':
                    this.heading = 'N';

            }
        } else if (argument == 'R') {

            switch (heading) {
                case 'N':
                    this.heading = 'E';
                    break;
                case 'W':
                    this.heading = 'N';
                    break;
                case 'S':
                    this.heading = 'W';
                    break;
                case 'E':
                    this.heading = 'S';

            }
        }
    }

    public char getDirection() {
        return heading;
    }

}
