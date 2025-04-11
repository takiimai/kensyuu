package chapter4.program1;

import java.util.ArrayList;

public class DE {
	ArrayList<Eemploye> EemployeList = new ArrayList<>();
	String name;
	ArrayList<String> BusyoList = new ArrayList<>();

	public Eemploye newEemploye(String name, String busyo) {
		Eemploye x = new Eemploye(name, busyo);
		EemployeList.add(new Eemploye(name, busyo));
		return x;
	}

	public void displayEemployeList() {

		for (Eemploye y : EemployeList) {
			System.out.println(y);
		}

	}
}
