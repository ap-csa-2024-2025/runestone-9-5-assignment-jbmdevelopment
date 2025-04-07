public class Animal
{
    private String name;
    private String species;
    public Animal(String n, String s) {
        this.name = s;
        this.species = s;
    }
    public Animal() {
        this("Bob", "Your Mom");
    }
    public void matingCall() {
        System.out.println("generic sound");
    }
}