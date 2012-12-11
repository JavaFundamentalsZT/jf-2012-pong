package pong;

public class CPUPlayer {

	private final Paddle paddle;

	public CPUPlayer(Paddle paddle) {
		this.paddle = paddle;
	}

	public void update(int delta, PongGame game) {
		Ball ball = game.ball;

		// TODO implement "AI"
		// The implementation should only move the Paddle by calling
		// Paddle.moveUp and Paddle.moveDown and not mutate any other state
	}

}
