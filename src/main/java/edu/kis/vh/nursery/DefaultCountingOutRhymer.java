package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final int stackSize = 12;
	private final int stackEmpty = -1;

	private final int[] numbers = new int[stackSize];

	public int total = stackEmpty;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == stackEmpty;
	}

	public boolean isFull() {
		return total == stackSize-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
