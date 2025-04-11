package chapter4.program1;
import java.util.ArrayList;

public class EemployeList {
    String name;
    String busyo;

    public void displayeemploye() {
        System.out.println(name);
        System.out.println(busyo);
    }

    public EemployeList(String name, String busyo) {
        this.name = name;
        this.busyo = busyo;
    }

    public static void main(String[] args) {
        String name = "山田太郎";
        String busyo = "営業部";

        ArrayList<EemployeList> lists = new ArrayList<EemployeList>();
        lists.add(new EemployeList(name, busyo));

        // 表示確認
        for (EemployeList e : lists) {
            e.displayeemploye();
        }
    }
}