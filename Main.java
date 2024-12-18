import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Student test = new Student(1, 2, "Bob");
    System.out.println(test);
    Scanner sc = new Scanner(System.in);
    String input = "";
    Plane p = new Plane(1000);
    while (!input.equals("q")) {
      System.out.println("Type \"u\" to move upwards, \"d\" to move downwards, \"n\" for new Plane, \"q\" to quit.");
      // System.out.println(print the plane's location and uncomment);
      input = sc.nextLine();
      if (input.equals("u")){
        p.upward();
        System.out.print(p.toString());
      } else if (input.equals("d")) {
        p.downward();
        System.out.print(p.toString());
        // move the plane downwards
      } else if (input.equals("n")) {
        System.out.println("Starting location for a new plane?");
        int location = sc.nextInt();
        sc.nextLine(); // consume the ENTER key left behind by nextInt()
        p = new Plane(location); // create new plane at proper location
      } else if (input.equals("q")) {
        System.out.println("Thank you for using plane simulator");
      } else{
        System.out.println("Invalid input");
      }
    }
  }
}
