public class Plane
{
  private int location;
  public Plane(int loc) {
    this.location = loc;
  }
  public Plane() {
    this(0);
  }
  public int getLoc() {
    return this.location;
  }
  public void upward() {
      if((this.location > 2000) || (this.location + 100 > 2000)) {
        System.out.println("You cannot go past 2000");
        this.location = 2000;
      } else {
        this.location += 100;
      }
  }
  public void downward() {
    if((this.location < -2000) || (this.location - 100 < -2000)) {
      this.location = -2000;
      System.out.println("You cannot go past -2000");
    } else {
      this.location -= 100;
    }
  }
  public String toString() {
      int spaces = location - (-2000); 
      String result = ""; // empty string
      for (int i = 0; i < spaces; i++) {
          result += " ";
      }
      result += "@";
      return result;
  }
}
