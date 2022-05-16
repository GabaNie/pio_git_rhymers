package edu.kis.vh.nursery;

/**
 * @author kowallus z modyfikacjami Gabrieli Niemyjskiej
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	/**
	 * @return wartości totalRejected
	 */
	public int reportRejected() {
		return totalRejected;
	}

	
	/**
	 * @param in potrzebny do sprawdzenia czy jest większy od ostatniego
	 *           elementu w tablicy
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
