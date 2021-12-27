package boundedTypeParameterssss;

public class NaturalNumber<T extends Integer> {

	private T n;

	public NaturalNumber(T n) {
		this.n = n;
	}

	public boolean isEven() {
		return n.intValue() % 2 == 0;
	}

	public static void main(String[] args) {
		NaturalNumber<Integer> nat = new NaturalNumber<Integer>(new Integer(11));
		Boolean result = nat.isEven();
		System.out.println(result);
	}

}
