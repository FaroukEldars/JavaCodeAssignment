package Session07;

public class zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        Animal animal = new Animal();
        animal.makeSound();
        Animal animal2 = new Dog();
        animal2.makeSound();
        ((Dog)animal2).bite();
        feed(animal2);
        animal2 = new Cat();
        ((Cat)animal2).scratch();
        feed(animal2);


    }
    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println(" Here is your Dog food");
        }
        else if(animal instanceof Cat) {

            System.out.println("Here is your Cat food");
        }

    }
    public void polyMethod(int userChoice){
        Animal animal;
        if(userChoice == 1){
            animal = new Dog();

        }
        else{
            animal = new Cat();
        }

    }
}
