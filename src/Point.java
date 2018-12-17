//represents a point on the x-y plane
public class Point {
    int x;
    int y;

    double angle;

    public Point(int xCoord, int yCoord){
        x = xCoord;
        y = yCoord;
    }

    //angle of this point with respect to p
    public void setAngle(Point p) {
        angle = Math.toDegrees(Math.atan2(y-p.y, x-p.x));
        if (angle < 0)
            angle += 360;
    }

    //returns true for ccw, false for cw
    public static boolean orientation(Point p1, Point p2, Point p3) {
        return (p2.y - p1.y) * (p3.x - p2.x) - (p2.x - p1.x)*(p3.y - p2.y) < 0;
    }

    //distance from this point to the other
    public double distanceTo(Point other) {
        int xDiff = Math.abs(x - other.x);
        int yDiff = Math.abs(y - other.y);

        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    @Override
    public String toString() {
        return "[" + x +"," + y + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point o = (Point) obj;
            return this.x == o.x && this.y == o.y;
        }
        return false;
    }
}
