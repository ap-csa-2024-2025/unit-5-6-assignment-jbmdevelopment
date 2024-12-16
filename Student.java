public class Student
{
  private int ID;
  private int grade;
  private String name;

  // Constructors
public Student(int input_id, int input_grade, String input_name) {
    this.setID(input_id);
    this.setGrade(input_grade);
    this.setName(input_name);
}
  public Student(int input_id, int input_grade) {
    this(input_id, input_grade, "unknown");
    /*ID = input_id;
    grade = input_grade;
    name = "unknown";*/
  }
  public Student() {
    this(0, 0, "Unknown");
    /*ID = 0;
    grade = 0;
    name = "unknown";*/
  }
  public void setID(int input_id) {
    this.ID = input_id;
  }
  public void setGrade(int input_grade) {
    this.grade = input_grade;
  }
  public void setName(String input_name) {
    this.name = input_name;
  }
  public String toString() {
    return "ID: " + ID + "\nName: " + name + "\nGrade: " + grade;
  }
}
