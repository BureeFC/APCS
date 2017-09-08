
import java.util.Random;
public class Lottery{
	public static void main(String[] args) {
		Random rand = new Random();
		String used = "";
	
		int count = 0;
		while (count<=5){
			int number = rand.nextInt(56) + 1;
			if (used.contains("" + number)){
				continue;
			}
			else{
				used += "" + number  +",";
				System.out.println(used);
				count++;
			}
			
		}
		
		int g = rand.nextInt(46) + 1;
		System.out.println("Your First number from 1-46 is  " + " " + g);
		

		
	}

}
