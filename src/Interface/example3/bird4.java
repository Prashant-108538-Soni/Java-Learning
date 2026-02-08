package Interface.example3;

@FunctionalInterface
public interface bird4
{
    // public abstract method
    void canFly(String val);


    // default method
    default  void getHeight()
    {
        // implementation
    }


    // static method
   static void canEat()
   {
       // implementation
   }


   // object class method. ( Every class is a child of Object class )
   String toString();
}

// In functional interface, only 1 abstract method is allowed, but we can have other methods
// like - default, static method or Methods inherited from the Object class.

