
public class Example1 extends Thread{
	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().getId() + "is running");
			 
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			Example1 ex1=new Example1();
			ex1.start();
		}
	}

}
