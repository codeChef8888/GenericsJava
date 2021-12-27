package GenericMethods;
public class Generic {

	public static void main(String[] args) {
		Boolean same;
		Util util = new Util();
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(1, "apple");
		same = util.compare(p1, p2);
		System.out.println(same);
	}

}
