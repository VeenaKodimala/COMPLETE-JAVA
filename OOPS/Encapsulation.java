package OOPS;

class DataFrame{
private String Name;
    private int Age;

   public void setName(String name) {
        Name =  name;
    }
    public String getName() {
        return Name;
    }

     public void setAge(int age) {
        Age = age;
    }
    public int getAge() {
        return Age;
    }

}


public class Encapsulation{

public static void main(String[] args) {
    DataFrame df = new DataFrame();
    df.setName("John");
    df.setAge(30);
    String name = df.getName();
    int age = df.getAge();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);

}
    
}