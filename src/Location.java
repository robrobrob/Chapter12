public class Location implements Place {
	private final int x;

	public Location(int x) {
		this.x = x;
	}

	@Override
	public int distance(Place other) {
		return Math.abs(x - (((Location) other).x));
	}

	public boolean sameDistance(Place p1, Place p2, Place p3) {
		return p1.distance(p2) == p1.distance(p3);
	}
}
