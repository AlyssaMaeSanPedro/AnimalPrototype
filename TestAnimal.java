public class TestAnimal{
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        System.out.println("--------------------------------");

        Animal shawn = registry.createSheep("Shawn");
        shawn.makeSound();
        System.out.println("Type: " + shawn.getType());
        System.out.println("Name: " +  ((Sheep) shawn).getName());
        System.out.println("Number of legs: " + ((Sheep) shawn).getLegs());
        System.out.println("Food: " + ((Sheep) shawn).getFood());

        System.out.println("--------------------------------");
        
        Animal daisy = registry.createCow();
        daisy.makeSound();
        System.out.println("Type: " + daisy.getType());
        System.out.println("Number of legs: " + ((Cow) daisy).getLegs());
        System.out.println("Food: " + ((Cow) daisy).getFood());

        System.out.println("--------------------------------");

        Animal willow = registry.createHorse("White");
        willow.makeSound();
        System.out.println("Type: " + willow.getType());
        System.out.println("Color: " + ((Horse) willow).getColor());
        System.out.println("Number of legs: " + ((Horse) willow).getLegs());
        System.out.println("Food: " + ((Horse) willow).getFood());

        System.out.println("--------------------------------");
        
        Animal anotherShawn = registry.createSheep("Another Shawn");
        anotherShawn.makeSound();
    }
}
