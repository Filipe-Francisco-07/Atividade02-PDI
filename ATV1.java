package DefaultPackage;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =0; i< 1000;i++) {
			System.out.println();
			for(int j =0; j<3000;j++) {
				Random r = new Random();
				int k = r.nextInt(0,256);	
				System.out.print(k+ " ");
				
			}
		}
	}

}
