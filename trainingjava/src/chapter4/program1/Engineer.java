package chapter4.program1;

public class Engineer extends Eemploye {

	String language;

	public Engineer(String name, String busyo, String language) {
		super(name, busyo);
		this.language = language;
	}

	public void kaihatu() {
		System.out.println(language + "で開発を行った");
	}

	public void displayPersonalEemploye() {
		System.out.println(name);
		System.out.println(busyo);
		System.out.println(language);
	}

	@Override
	public String toString() {
		return "名前: " + name + ", 部署: " + busyo + "言語：" + language;
	}
}
