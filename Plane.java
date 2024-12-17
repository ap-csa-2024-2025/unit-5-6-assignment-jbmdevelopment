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
}
