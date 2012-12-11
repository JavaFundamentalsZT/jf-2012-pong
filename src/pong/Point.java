package pong;

/**
 * Represents both 2D locations vectors (e.g. velocity)
 */
public class Point {
	public final float x;
	public final float y;

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Point plus(Point v) {
		return new Point(x + v.x, y + v.y);
	}

	public Point minus(Point v) {
		return new Point(x - v.x, y - v.y);
	}

	public Point times(float a) {
		return new Point(x * a, y * a);
	}

	/**
	 * Returns a point within the [min, max] range (same point if it already was
	 * within the range).
	 */
	public Point clamp(Point min, Point max) {
		float cx = Math.max(min.x, Math.min(x, max.x));
		float cy = Math.max(min.y, Math.min(y, max.y));
		return new Point(cx, cy);
	}

}
