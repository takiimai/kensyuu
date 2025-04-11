package chapter4.program1;

public class Main {
    public static void main(String[] args) {
    	DE a=new DE(); 
    	Eemploye b=a.newEemploye("imai","taki");
    	b.displayPersonalEemploye();
    	Eemploye c=a.newEemploye("1","2");
    	c.displayPersonalEemploye();
    	a.displayEemployeList();
    }
}