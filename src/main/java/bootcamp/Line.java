package bootcamp;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {
    private Point start;
    private Point end;

    public Line(final Point start, final Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(final Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(final Point end) {
        this.end = end;
    }

    public double length() {
        return (sqrt(pow(end.getX(), 2) - pow(start.getX(), 2)) + sqrt(pow(end.getY(), 2) - pow(start.getY(), 2)) + sqrt(pow(end.getZ(), 2) - pow(start.getX(), 2)))/3;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Line line = (Line) o;

        if (start != null ? !start.equals(line.start) : line.start != null) return false;
        return end != null ? end.equals(line.end) : line.end == null;
    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 31 * result + (end != null ? end.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Line{" + "start=" + start + ", end=" + end + '}';
    }
}
