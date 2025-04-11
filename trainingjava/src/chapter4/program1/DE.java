package chapter4.program1;

import java.util.ArrayList;

public class DE {
	private final String companyname = "BT/DE";
	ArrayList<Eemploye> EemployeList = new ArrayList<>();
	ArrayList<String> BusyoList = new ArrayList<>();

	public DE() {
		BusyoList.add("人事");
		BusyoList.add("営業");
		BusyoList.add("エンジニア");

	}

	public Eemploye newEemploye(String name, String busyo) {
		Eemploye eemploye = new Eemploye(name, busyo);
		EemployeList.add(eemploye);
		return eemploye;
	}

	public HumanResource newHumanResource(String name, String busyo) {
		HumanResource eemploye = new HumanResource(name, busyo, this);
		EemployeList.add(eemploye);
		return eemploye;
	}

	public Sales newSales(String name, String busyo) {
		Sales eemploye = new Sales(name, busyo);
		EemployeList.add(eemploye);
		return eemploye;
	}

	public Engineer newEngineer(String name, String busyo, String language) {
		Engineer engineer = new Engineer(name, busyo, language);
		EemployeList.add(engineer);
		return engineer;
	}

	public void displayEemployeList() {

		for (Eemploye y : EemployeList) {
			System.out.println(y);
		}

	}
}
