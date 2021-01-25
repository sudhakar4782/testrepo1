package practise;

public class LambdaExpressionExample {
	
	public static void main(String args[])
	{
		int width = 10;
		System.out.println("Hi.");
		
//		Drawable d = new Drawable() {
//			
//			@Override
//			public void draw() {
//				System.out.println("Width="+width);
//				
//			}
//		};
		
		Drawable d2 = ()->{
			System.out.println("width2="+width);
		};
		
		d2.draw();
	}

}
