package practise;

public class HashcodeTest {

	public static void main(String[] args) {
				
		Geek g1 = new Geek("aa",1);
		Geek g2 = new Geek("aa",1);
		
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		
		System.out.println((Geek)g1 == (Geek)g2);
		
		
		if(g1.hashCode() == g2.hashCode())
		{
			if(g1.equals(g2))
				System.out.println("Both the objects are equals");
			else
				System.out.println("Both are not equal");
		}
		else
		{
			System.out.println("Both are not equal2");
		}

	}

}
