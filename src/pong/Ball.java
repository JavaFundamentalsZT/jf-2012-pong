package pong;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Circle;

public class Ball {

	public static final float radius = 7;

	public Point velocity;
	public Point pos;

	public Ball(Point pos, Point velocity) {
		this.velocity = velocity;
		this.pos = pos;
	}

	public void draw(Graphics g) {
		g.draw(new Circle(pos.x, pos.y, radius));
	}

	public Circle bounds() {
		return new Circle(pos.x, pos.y, radius);
	}

	public void move() {
		pos = pos.plus(velocity);
	}
}
