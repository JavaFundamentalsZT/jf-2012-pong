package pong;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

public class Paddle {

	public static final Point size = new Point(8, 40);
	public static final Point velocity = new Point(0, 8);
	private static final Point minDistFromEdge = new Point(0, size.y / 2 + 2);

	public Point pos;

	public Paddle(Point pos) {
		this.pos = pos;
	}

	public void draw(Graphics g) {
		g.drawRect(pos.x - size.x / 2, pos.y - size.y / 2, size.x, size.y);
	}

	public void moveUp(PongGame game) {
		Point posMin = game.courtStart.plus(minDistFromEdge);
		Point posMax = game.courtEnd.minus(minDistFromEdge);
		pos = pos.minus(Paddle.velocity).clamp(posMin, posMax);
	}

	public void moveDown(PongGame game) {
		Point posMin = game.courtStart.plus(minDistFromEdge);
		Point posMax = game.courtEnd.minus(minDistFromEdge);
		pos = pos.plus(Paddle.velocity).clamp(posMin, posMax);
	}

	public Rectangle bounds() {
		return new Rectangle(pos.x - size.x / 2, pos.y - size.y / 2, size.x,
				size.y);
	}
}
