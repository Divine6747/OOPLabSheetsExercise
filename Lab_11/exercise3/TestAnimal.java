package Lab_11.exercise3;

//TestAnimal.java
/*A driver (test) class that contains the main() method for
testing the functionality of the Animal class*/
public class TestAnimal {
    public static void main(String[] args) {
        Animal[] allAnimals = new Animal[10];

        Animal a1 = new Animal();
        System.out.println("Calling the no-argument constructor to create the first animal...\n" + "Details of first animal are: \n\n" + a1);
        String[] lionContinents = {"Africa","Asia"};

        System.out.println("Calling the 4-argument constructor to create a lion object....");
        Animal a2 = new Animal("Lion",lionContinents,200,40);

        System.out.println("\nCalling the 4-argument constructor to create a rat object....");
        Animal a3 = new Animal("Rat",new String[]{"Europe", "America", "Africa", "Asia"},0.2,5);

        System.out.println("\nCalling the 4-argument constructor to create a polar bear object....");
        Animal a4  = new Animal("Polar Bear",new String[]{"Antarctica"},450,15);

        System.out.println("\nCalling the 4-argument constructor to create an anaconda object....");
        Animal a5  = new Animal("Anaconda",new String[]{"Asia","America"},100,8);

        allAnimals[0] = a1;
        allAnimals[1] = a2;
        allAnimals[2] = a3;
        allAnimals[3] = a4;
        allAnimals[4] = a5;

        allAnimals[0].setType("Gorilla");
        allAnimals[0].setWeight(250);

        System.out.println("\n\nThe details of all the animals in the Animal array are:\n\n");

        for(int i = 0; i < allAnimals.length; i++)
            if(allAnimals[i] != null)
                System.out.println(allAnimals[i]+"\n\n");

    }
}