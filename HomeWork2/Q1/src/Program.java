
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(3,4,2,5);
		
		int result = r1.getArea();
		System.out.println(result);
		
		Rectangle r2 = new Rectangle(5,6,5,8);
		r2.moveTo(7,9);
		
		if(r1.getPerimiter() > r2.getPerimiter())
			r1.show();
		else
			r2.show();

	}

}
