

/*
 * Represents Geometric shape circle.
 */

public class Circle implements Comparable<Circle> {

	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;

	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int compareTo(Circle o) {
		if (o.radius > this.radius) {
			return -1;
		}

		if (o.radius < this.radius) {
			return 1;
		}
		return 0;
	}
}
