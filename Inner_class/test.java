package Inner_class;

public class test {
  private int age;
  private String colour;


  // inner class have access to any variables or methods found in the parent class,
  // no matter the access modifier, we can also have the static modifier in our inner class
  private class testInnerClass{
    private String name;

    public testInnerClass(String name) {
      this.name = name;
    }

    private  void printAge(){
      System.out.println("Age: "+ age);
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
