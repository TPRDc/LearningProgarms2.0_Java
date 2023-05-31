package objectProgramming;

public class Brid extends Animal{
    private int wings;
    private int children;

    public Brid(String name, String colour, int legs, boolean hasTail, int wings, int children) {
        super(name, colour, legs, hasTail);
        this.wings = wings;
        this.children = children;
    }

    public Brid(String name, String colour, int legs, int wings, int children) {
        super(name, colour, legs);
        this.wings = wings;
        this.children = children;
    }

    public void chicks(){
        System.out.println(this.getName()+" has "+this.getChildren()+" children");
    }
    public void chicks(String name, int children){
        System.out.println(name+" has "+children+" children today");
    }
    public int getChildren() {
        return children;
    }
    public void setChildren(int children) {
        this.children = children;
    }
    public int getWings() {
        return wings;
    }
    public void setWings(int wings) {
        this.wings = wings;
    }
}
