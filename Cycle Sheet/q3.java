import java.lang.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q3 {

    public static void calu(String side) {
        for (String compound : side.split("\\+")) {
            compound = compound.trim();
            Pattern p = Pattern.compile("\\d*");
            Matcher m = p.matcher(compound);
            m.find();
            int number = 1;
            if (m.group().length() != 0)
                number = Integer.parseInt(m.group());
            System.out.print(" " + number + " moles of " + compound.replaceFirst(String.valueOf(number), ""));
        }
        System.out.println(".");
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String str = src.nextLine();
        // String str = "2NaOH + H2SO4 -> Na2SO4+ 2H2O";
        String react = str.split("->")[0];
        String product = str.split("->")[1];
        System.out.print("Reactants are");
        calu(react);
        System.out.print("Products are");
        calu(product);
    }
}