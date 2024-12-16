public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;
  public void setName(String n) {
    name = n;
  }
  public String getName() {
    return name;
  }
  public void setWeight(double lbs) {
    weight = lbs;
    if(weight < 0) {
      weight = 0;
    }
  }
  public double getWeight() {
    return weight;
  }
  public void setColor(String col) {
    color = col;
  }
  public String getColor() {
    return color;
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
