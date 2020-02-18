import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

// Not the best solution out there. If you can find another, use another.

class Donor implements Serializable {

  private static final long serialVersionUID = 1L;

  String name;
  int age;
  String address;
  String contact;
  String blood;
  String last;

  Donor(String name, int age, String address, String contact, String blood, String last) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.contact = contact;
    this.blood = blood;
    this.last = last;
  }

  @Override
  public String toString() {
    return String.format("%s %d %s %s %s %s", this.name, this.age, this.address, this.contact, this.blood, this.last);
  }
}

public class q9 {

  // Create obj.txt in this folder if doesnt already exist
  private static final String filepath = "./obj.txt";

  public static void main(String[] args) {
    int n = 3;
    ArrayList<Donor> al = new ArrayList<Donor>();
    Donor obj[] = new Donor[n];

    // Populate
    obj[0] = new Donor("rishav", 12, "Vellore", "99580823", "B+", "20-01-1999");
    obj[1] = new Donor("some name 2", 22, "Vellore", "234234", "O+", "20-10-2000");
    obj[2] = new Donor("naman", 45, "Vellore", "995809589", "A+", "07-01-2019");
    al.add(obj[0]);
    al.add(obj[1]);
    al.add(obj[2]);
    al = WriteObjectToFile(al);

    for (Donor donor : al) {
      if (donor.blood.equals("A+"))
        System.out.println(donor);
    }
  }

  public static ArrayList<Donor> WriteObjectToFile(ArrayList<Donor> obj) {

    try {
      FileInputStream fileIn = new FileInputStream(filepath);
      ObjectInputStream objectIn = new ObjectInputStream(fileIn);

      @SuppressWarnings("Type safety")
      ArrayList<Donor> donors = (ArrayList<Donor>) objectIn.readObject();

      FileOutputStream fileOut = new FileOutputStream(filepath);
      ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

      donors.addAll(obj);

      objectOut.writeObject(donors);
      objectOut.close();
      objectIn.close();

      return donors;

    } catch (Exception e) {
      System.out.println(e);
      return null;
    }

  }

}