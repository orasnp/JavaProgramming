import java.util.Random;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randGen= new Random();
		int rand1, rand2, rand3,rand4,rand5,total;
		rand1=randGen.nextInt(6)+1;
		rand2=randGen.nextInt(6)+1;
		rand3=randGen.nextInt(6)+1;
		rand4=randGen.nextInt(6)+1;
		rand5=randGen.nextInt(6)+1;
		System.out.println("(1) " + rand1);
		System.out.println("(2) " + rand2);
		System.out.println("(3) " + rand3);
		System.out.println("(4) " + rand4);
		System.out.println("(5) " + rand5);
		total = rand1+rand2+rand3+rand4+rand5;
		System.out.println("(Total) " + total);
	}
}
