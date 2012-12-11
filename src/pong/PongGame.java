package pong;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class PongGame extends BasicGame {

	final Point courtStart = new Point(50, 50);
	final Point courtSize = new Point(700, 500);
	final Point courtEnd = courtStart.plus(courtSize);

	Ball ball;

	private boolean gameOver;

	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private CPUPlayer cpuPlayer;

	public PongGame(String title) {
		super(title);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		gameOver = false;
		ball = new Ball(new Point(400, 100), new Point(-4, 4));
		leftPaddle = new Paddle(new Point(60, 300));
		rightPaddle = new Paddle(new Point(740, 300));
		cpuPlayer = new CPUPlayer(rightPaddle);
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		if (container.getInput().isKeyDown(Input.KEY_ESCAPE)) {
			// Quit game
			container.exit();
			return;
		}
		if (container.getInput().isKeyPressed(Input.KEY_R)) {
			// Restart game
			container.reinit();
			return;
		}
		if (gameOver)
			return;

		// "AI" update
		cpuPlayer.update(delta, this);
		
		// TODO implement Game logic, collisions, player paddle movement etc.
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		g.drawRect(courtStart.x, courtStart.y, courtSize.x, courtSize.y);
		leftPaddle.draw(g);
		rightPaddle.draw(g);
		ball.draw(g);
		g.drawString("Pong", 100, 10);
	}

	public static void main(String[] args) throws SlickException {
		Game game = new PongGame("Pong Clone");
		AppGameContainer container = new AppGameContainer(game);
		container.setDisplayMode(800, 600, false);
		container.setTargetFrameRate(30);
		container.start();
	}

}
