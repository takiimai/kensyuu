package chapter4.program1;

public class Engineer{
	String name;
	String busyo;
	public void displayeemploye(){
	   System.out.println(name);
	   System.out.println(busyo);
	}
	public  Engineer(String name,String busyo) {
		this.name=name;
		this.busyo=busyo;
	
	}	
	@Override
    public String toString() {
        return "名前: " + name + ", 部署: " + busyo;
    }
	
	}

