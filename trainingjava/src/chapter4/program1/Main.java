package chapter4.program1;

public class Main {
	public static void main(String[] args) {
		DE a = new DE();
		Eemploye b = a.newEemploye("imai", "taki");
		b.displayPersonalEemploye();
		Eemploye c = a.newEemploye("1", "2");
		c.displayPersonalEemploye();
		Engineer d = a.newEngineer("aaa", "bbb", "java");
		d.displayPersonalEemploye();
		HumanResource e = a.newHumanResource("ccc", "ddd");
		e.displayPersonalEemploye();
		e.Mensetu("123", "456");
		Sales f = a.newSales("eee", "fff");
		f.mendan(d.name);
		f.displayPersonalEemploye();

		a.displayEemployeList();

	}
}