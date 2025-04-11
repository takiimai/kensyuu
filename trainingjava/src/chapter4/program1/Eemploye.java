package chapter4.program1;

public class Eemploye {
	String name;
	String busyo;

	public void displayPersonalEemploye() {
		System.out.println(name);
		System.out.println(busyo);
	}

	public Eemploye(String name, String busyo) {
		this.name = name;
		this.busyo = busyo;
	}

	public Eemploye() {
		this.name = name;
		this.busyo = busyo;
	}

	@Override
	public String toString() {
		return "名前: " + name + ", 部署: " + busyo;
	}

}
