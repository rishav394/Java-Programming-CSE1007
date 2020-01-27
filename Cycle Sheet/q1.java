public class q1{
    public static void main(String args[]){
        if(args.length < 4){
            System.err.println("Please pass arguments.");
            System.exit(0);
        }
        String fname = args[0];
        String lname = args[1];
        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);
        double bmi = weight / (height * height) * 1.00;
        String cate = "";
        if(bmi < 18)
            cate = "Underweight";
        else if(bmi < 25)
            cate = "Normal weight";
        else if(bmi < 30)
            cate = "Overweight";
        else
            cate = "Obese";
        System.out.println(fname + " " + lname + " is " + cate);
        
    }
}