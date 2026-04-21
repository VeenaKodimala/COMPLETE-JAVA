

class DataFrame{
private String name;
    private int age;

   public void setName(String name) {
        this.name =  name;
    }
    public String getName() {
        return name;
    }

     public void setAge(int age) {
        //what if we have to use same name? if we have same name, 
        // then it will consider it as local variable.
        //that's when we use this, "this" keyword repesent the
        //currnet obj that is calling this method.
        this.age = age;
    }
    public int getAge() {
        return age;
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