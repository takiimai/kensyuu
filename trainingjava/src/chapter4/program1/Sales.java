package chapter4.program1;

public class Sales extends Eemploye {

	public Sales(String name, String busyo) {
		this.name = name;
		this.busyo = busyo;
	}

	public void hensin() {
		System.out.println("週報の返信を行った");
	}

	public void mendan(String name) {
		System.out.println(name + "の面談を組んだ");
	}

	public void utiawase() {
		System.out.println("新規の打ち合わせをした");
	}
}
