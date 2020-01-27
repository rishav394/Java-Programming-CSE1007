import java.util.*;
import java.util.regex.*;

public class q7
{
	public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String registration = src.nextLine();
        String mobile = src.nextLine();
        // Matcher m = Pattern.matche
        try{
            if(registration.length()!=9 || mobile.length()!=10){
                throw new IllegalArgumentException("");
            }
            if(!Pattern.matches("\\d{10}", mobile)){
                throw new NumberFormatException("");
            }
            if(!Pattern.matches("[\\w]{9}", registration)){
                throw new NoSuchElementException("");
            }
            System.out.println("valid");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("invalid");
        }
	}
}

