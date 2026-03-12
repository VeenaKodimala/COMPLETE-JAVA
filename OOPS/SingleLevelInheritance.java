/* In every constructure, we will have a defaultmethod 
called super().
 This will check if the current class extensds 
 any other class(parent), if so it will first
  call the parent's constructor and then the constructor of itself.
But when you call a parameterised constructor of B, even then the defualt constructor of A
will only be called. Because in constructor B super() will be called and not super(<parameters>).
The above has to be done by us explicitly.
 */
//Every class in java by default(if not extends any other class) extends Object class.
class A{
    public A(){
        System.out.println("Constructor of A");
        String a = "Req004,Req012";
        if(a.contains("Req004")){
            System.out.println("Requirement 004 is present");

        }
    }

     public A(int a){
        System.out.println("Constructor of A with int parameter: " + a);
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("Constructor of B");
    }

    public B(int i){
        //this(7); - Not possible because you are calling the same constructor as the current one.
        //This will call the constructor of the same class, i mean the non-parameterised one.
        this();
        System.out.println("Constructor of B with int parameter: " + i);
    }
}






public class SingleLevelInheritance {
    public static void main(String[] args) {
        B b = new B(5);

        



    }
}