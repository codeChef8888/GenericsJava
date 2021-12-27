package GenericMethods;
public class Util {

	public <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {

		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
}
