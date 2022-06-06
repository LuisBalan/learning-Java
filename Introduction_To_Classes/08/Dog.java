public class Dog {
    String breed;
    String name;
    String color;
    boolean hasOwner;
    int age;
    
    public Dog(String dogBreed, boolean dogOwned, int dogYears) {
      System.out.println("Constructor invoked!");
      breed = dogBreed;
      hasOwner = dogOwned;
      age = dogYears;
      System.out.println("Construction finished");
    }

    // public Cat(String nameCat, String colorCat, String breedCat){
    //   name = nameCat;
    //   color = colorCat;
    //   breed = breedCat;
    // }
    
    public static void main(String[] args) {
      // System.out.println("Main method started");
      // Dog fido = new Dog("poodle", false, 4);
      // Dog nunzio = new Dog("shiba inu", true, 12);
      // boolean isFidoOlder = fido.age > nunzio.age;
      // int totalDogYears = nunzio.age + fido.age;
      // System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
      // System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
      // System.out.println("The total age of the dogs is: " + totalDogYears);
      // System.out.println("Main method finished");
      // Dog rocky = new Dog("boxer", true, 8);
    // Cat canela = new Cat("canela", "black", "angora");
      // System.out.println("The new dog breed is: " + rocky.breed);
    // System.out.println("The name of a new Cat instance is: " + canela.name);
    }
  }