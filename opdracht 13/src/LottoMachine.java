import java.awt.event.*;
import java.util.*;
public class LottoMachine {
	
	public List<LottoBallen> lb = new ArrayList<LottoBallen>();
	List<LottoBallen> uitkomsten = new ArrayList<LottoBallen>();
	
	public LottoMachine() {
	}
	
	public void voegBallenToe() {
		lb.clear();
		for(int i = 1; i <= 100; i++) {
			LottoBallen LB = new LottoBallen(i);
			lb.add(LB);
		}
	}
	
	public LottoBallen pakRandom() {
		Random random = new Random();
		int i = random.nextInt(lb.size());
		return lb.get(i);
	}
	
	public void zetRandomInLijst() {
		while (uitkomsten.size() < 5) {
			LottoBallen var = pakRandom();
			uitkomsten.add(var);
			lb.remove(var);
		}
	}
	
	public void printResultaten() {
		for (int i = 0; i <= uitkomsten.size(); i++) {
			System.out.println(uitkomsten.get(i));
		}
	}
	
	public void voorspelUitslag() {
		Scanner s = new Scanner(System.in);
		System.out.println("wat denkt u dat de resultaten zijn?");
		System.out.println("vul 5 getallen tussen de 1 en de 100 in");
		
	}
	
	public  void trekHendel() {
	}
	
	public void KeyPressed(KeyEvent e) {
		System.out.println("druk op enter om de lotto uitslag te krijgen.");
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_ENTER) {
			trekHendel();
		}
	}
}
