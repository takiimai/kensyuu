package LastExam;

public class Main {
	public static void main(String[] args) {
		Point a=new Point(1,1);
		Point b=new Point(3,3);
		Point c=new Point(5,5);
		
		
		Line d=new Line(2,2,3,3);
		d.draw();
		System.out.println(d.getPerimeter());
		Circle e=new Circle(2,2,3);
		System.out.println(e.getPerimeter());

	}
}