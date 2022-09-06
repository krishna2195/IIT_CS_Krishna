

public class CalcuationsImpl implements Calculations {
	/*
	 * Return area of Circle for the length of radius present in circle Formula to
	 * calculate area of circle is 3.14*radius*radius where 3.14 is same as the
	 * value returned by Math.PI
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.programs.calculations.Calculations#calculateArea(com.programs.circle.
	 * Circle)
	 */

	@Override
	public double calculateArea(Circle circle) {

		return Math.PI * circle.getRadius() * circle.getRadius();
	}

}
