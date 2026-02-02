package Interface.example2;

public class Crocodile implements WaterAnimal, LandAnimal {
    @Override
    public boolean canBreathe() {
        System.out.println("Crocodile can breathe");
        return true;
    }
    @Override
    public boolean canEat() {
        System.out.println("Crocodile can eat");
        return true;
    }
}
