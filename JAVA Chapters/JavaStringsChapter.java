/* String constant Pool:
This is the pool where all the strings created will be stored. Here, if we create a string using double quotes, it will be stored in the string constant pool. If we create a string using the new keyword, it will be stored in the heap memory. If we create a string using the new keyword and then intern it(Eg: String s1 = new String("hello").intern(); // now points to pool
), it will be stored in the string constant pool. The string constant pool is a special area of memory that is used to store string literals. When a string literal is created, it is added to the string constant pool. If a string literal already exists in the pool, then a reference to that string is returned instead of creating a new string object. This helps to save memory and improve performance. Now if an existing reference id modified with new value, then it will create a new string object in the string constant pool and the reference will point to that new string object. If we create a string using the new keyword, it will always create a new string object in the heap memory, even if the same string already exists in the string constant pool. This is because the new keyword creates a new object in memory, regardless of whether an identical string already exists in the pool or not.
*/ 
public class JavaStringsChapter{

    public static void main(String[] args) {
       NormalStrings ns = new NormalStrings();
       ns.normalString();
       StringBufferExample sb = new StringBufferExample();
       sb.strBuffer();

    }

    /** String Buffer: It is a mutable sequence of characters. Unlike strings, string buffers can be modified after they are created.
     * 
     * String constant pool is not involved in string buffer. Why????
     * The string constant pool works because String is immutable — the same value can be safely shared between references.StringBuffer is mutable (you can change its content), so sharing it would be dangerous — modifying one reference would affect all others. Therefore, pooling makes no sense for it.
     */



}
class NormalStrings{
    public void normalString() {
        System.out.println("Normal Strings:");
        String a = "veena"; // stored in string constant pool
        //system.identityHashCode() is used to get the memory address of the object
        System.out.println("Address of a: " + System.identityHashCode(a));
        String b = "veena"; // stored in string constant pool, reference to the same string object as a
        System.out.println("Address of b: " + System.identityHashCode(b));

        a = "Veena Kodimala"; // creates a new string object in the string constant pool and reference a points to it

        System.out.println("New Address of a: " + System.identityHashCode(a));
    }
}
class StringBufferExample {
    public void strBuffer() {
        System.out.println("String Buffer Example:");
  
    StringBuffer sb = new StringBuffer();
    System.out.println("Capacity of sb: " + sb.capacity());
    sb.append("This is a long text");
    //Capacity increases if input string length exceeds the current capacity. The new capacity is calculated as (old capacity * 2) + 2.
    System.out.println("Capacity of sb after appending 'This is a long text': " + sb.capacity());
    }
}

//StringBuilder is similar to StringBuffer but it is not thread-safe, which means it is not synchronized. It is faster than StringBuffer because it does not have the overhead of synchronization. StringBuilder should be used when there is no need for thread safety, while StringBuffer should be used when thread safety is required.