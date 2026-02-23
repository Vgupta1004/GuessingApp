import java.util.Random;

class GameConfig{
	private final int MIN = 1;
	private final int MAX = 100;
	private final int MAX_ATTEMPTS = 7;
	private final int MAX_HINTS = 3;
	
	int targetNumber;

	public GameConfig() {
		Random rand = new Random();
		this.targetNumber = rand.nextInt(MAX - MIN + 1) + MIN;
	}

	public int getTargetNumber() {
		return targetNumber;
	}

	public int getMaxAttempts() {
		return MAX_ATTEMPTS;
	}

	public int getMaxHints() {
		return MAX_HINTS;
	}

	public void showRules() {
		System.out.println("I have selected a number between " + MIN + " and " + MAX + ".");
		System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess the number.");
		System.out.println("You can also use up to " + MAX_HINTS + " hints to help you guess.");
	}
}