import Interface.example1.Bird;
import Interface.example1.Eagle;
import Interface.example1.Hen;

// TODO : Any class that has a main method can be run, no matter how many such classes exist in a package.
void main() {

    // Method 1
//    Eagle eagle = new Eagle();
//    Hen hen = new Hen();
//    eagle.fly();
//    hen.fly();
//    eagle.eat();
//    hen.eat();

    // Method 2
    Bird bird = new Hen();
    Bird bird2 = new Eagle();
    // On run time below bird object decide to call which class.
    bird.fly();
    bird2.fly();
    bird.eat();
    bird2.eat();


}

