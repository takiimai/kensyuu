package chapter4.program1;

public class HumanResource extends Eemploye {

	private DE de;

	public HumanResource(String name, String busyo, DE de) {
		super(name, busyo);
		this.de = de;

	}

	public boolean Mensetu(String name, String busyo) {
		boolean result = true;
		if (result == true) {
			System.out.println("面接を行い、結果は採用だった");
			de.newEemploye(name, busyo);
		} else {
			System.out.println("面接を行い、結果は不採用だった");
		}

		return result;
	}

	public void kyuuyo() {
		System.out.println("給与計算を行った");
	}
}
