

public final class Vectors {

	private Vectors() {
	}

	/**
	 * Verifica se dois vetores são iguais
	 */
	public static boolean igual(int[] a, int[] b) {
		if ((a == null) || (b == null)) {
			throw new IllegalArgumentException("Argumento nulo");
		}

		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Multiplicaçao escalar de dois vetores
	 */
	public static int multiplicacaoEscalar(int[] a, int[] b) {
		if ((a == null) || (b == null)) {
			throw new IllegalArgumentException("Argumento nulo");
		}

		if (a.length != b.length) {
			throw new IllegalArgumentException(
					"diferentes tuplas de vetores (" + a.length + ", "
							+ b.length + ')');
		}

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i] * b[i];
		}
		return sum;
	}

}
