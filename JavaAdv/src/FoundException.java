import java.util.Date;

public class FoundException {
	
	public static void main(String[] args) {
		Date date = null;
		Date today = new Date();
		try {
		System.out.println(date.getClass().getName());
		System.out.println(today.getClass().getName());
		}
		catch(NullPointerException e) {
			System.out.println("erreur capturée"+ e);
			System.out.println("mais le programme s'arettte la");
		}
		finally {
			System.out.println("le programme dois continuer");
			System.out.println(date);
		}
	}

}
