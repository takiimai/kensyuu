package chapter4.program1;

public class HumanResource2 extends Eemploye {
	public boolean Mensetu() {
		boolean result = true;
		if (result == true) {
			System.out.println("面接を行い、結果は採用だった");
			DE.newEemploye(this.name, this.busyo);
		} else {
			System.out.println("面接を行い、結果は不採用だった");
		}

		return result;
	}

	public void kyuuyo() {
		System.out.println("給与計算を行った");
	}
}
