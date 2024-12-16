public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;

  // Make setters
  public void setName(String n) {
    name = n;
  }
  public String getName() {
    return name;
  }
  public void setWeight(int lbs) {
    weight = lbs;
  }
  public int getWeight() {
    return weight;
  }
  public void setColor(String col) {
    color = col;
  }
  public String getColor() {
    return col;
  }
  public void setBreed(String iBreed)
  {
    breed = iBreed;
  }
  public String getBreed()
  {
    return breed;
  }
}
