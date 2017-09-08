import java.util.Scanner;

public class Case {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter haircolor");
		String HC = reader.nextLine();
		System.out.print("Enter number of letters in last name");
		String number = reader.nextLine();
		System.out.print("Enter profession");
		String p = reader.nextLine();
		System.out.print("Enter haircolor");
//		String HC = reader.nextLine();
//		System.out.print("Enter number of letters in last name");
//		String number = reader.nextLine();
//		System.out.print("Enter profession");
//		String p = reader.nextLine();
//		System.out.print("Enter haircolor");
//		String HC = reader.nextLine();
//		System.out.print("Enter number of letters in last name");
//		String number = reader.nextLine();
//		System.out.print("Enter profession");
//		String p = reader.nextLine();
//		
		
		String criteria = (HC+number+p).toUpperCase();
		
		String teachername = Teachername(criteria);
		
		System.out.printf("Your Teachername:%s%n" , teachername);
		
		System.out.printf("Your criteria: %s%n  found this Teacher: :%s%n" ,criteria,teachername);
	
	}
	
	
	private static  String Teachername(String input)
	{
		switch(input){
		
		case "BLUE6MATH":
			return "Smith";	
		case "BLUE7MATH":
			return "Tiger";	
		case "BLUE8MATH":
			return "Roger";	
		case "GREY9HIST":
			return "Petty";	
		
			
			
		default:
			return "YOU BUREE";
			
		}
		
	}
}
