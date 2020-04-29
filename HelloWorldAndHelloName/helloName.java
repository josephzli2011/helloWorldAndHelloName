import java.util.*;
public class HelloName {
	Scanner s = new Scanner(System.in);
	System.out.print("What is your name? ");
	String name = s.nextLine();
	System.out.println("Hello, "+name);
}