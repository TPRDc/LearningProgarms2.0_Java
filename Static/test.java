package Static;

public class test {

  /* when we declear our methods,variables or class as static it means the methods,variables
  or class belongs to the object itself not the instances of the variable
   */

  public static String name;
  public String skinColor;
  public int age;

  public test(String skinColor, int age) {
    this.skinColor = skinColor;
    this.age = age;
  }

  public void print_Non_static(){
    System.out.println("Printing........Non");
  }

  public static void printStatic(){
    System.out.println("Printing......... Static");
  }

  public static String getName() {
    return name;
  }

  public static void setName(String name) {
    test.name = name;
  }

  public String getSkinColor() {
    return skinColor;
  }

  public void setSkinColor(String skinColor) {
    this.skinColor = skinColor;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
