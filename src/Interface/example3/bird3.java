package Interface.example3;

// compilation error bcz cannot declare 2 abstract method in functional interface.
@FunctionalInterface
public interface bird3 {
    void canFly(String val);
//    void canFly2(String val);
}
