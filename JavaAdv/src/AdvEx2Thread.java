

public class AdvEx2Thread extends Thread{
	public AdvEx2Thread(String name) {
		super(name);
		
	}
	
	public void run() {
		for(int i=0;i<5;i++)
			System.out.print(this.getName());
	}
	public static void main(String [] args) {
		AdvEx2Thread t = new AdvEx2Thread("1-");
		AdvEx2Thread t2 = new AdvEx2Thread("2--");
		AdvEx2Thread t3 = new AdvEx2Thread("3---");
		AdvEx2Thread t4 = new AdvEx2Thread("4----");
		AdvEx2Thread t5 = new AdvEx2Thread("5-----");
		AdvEx2Thread t6 = new AdvEx2Thread("\n");
		t.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}

}
