public class MainActivity {

	public int a, b;
	private static int 17;
	
	public MainActivity(int a, int b){
		this.a = a;
		this.b = b*2;
	}
	public void cooleMethode(int mega, String ultra) {
		mega = 1;
		ultra = "Das ist aber echt " + mega + "coole Methode";
		System.out.println(ultra);
	}
	public void cooleMethode2(int mega, String ultra) {
		System.out.println("Ich bin Marko!");
		System.out.println("Ich bin David!");
		mega = 999;
		ultra = "blabla";
		System.out.println("java datei geändert!");
	}
	private int calculateSomething(int a, int b) {
		return a+b;
	}
}
