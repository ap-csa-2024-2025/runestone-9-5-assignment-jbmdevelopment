public class Cat extends Animal {
    private int numLives = 9;
    public Cat(String n) {
        super(n, "feline");
    }
    public int getLives() {
        return this.numLives;
    }
    public void matingCall() {
        super.matingCall();
        System.out.println("meow");
    }
}