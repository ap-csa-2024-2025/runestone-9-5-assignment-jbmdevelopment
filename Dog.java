public class Dog extends Animal {
    String breed;
    public Dog(String n, String b) {
        super(n, "canine");
        this.breed = b;
    }
    public String getBreed() {
        return this.breed;
    }
    public void wagTail() {
        System.out.println("waggin");
    }
    public void matingCall() {
        super.matingCall();
        System.out.println("woof");
    }
}