import java.util.ArrayList;

public class ArrayListWithSum extends ArrayList<Integer> implements ListWithSum {
	@Override
	public int sum() {
		return stream()
				.mapToInt(x -> x)
				.sum();
	}
}
