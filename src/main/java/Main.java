import mysticalAnimal.Dragon;
import mysticalAnimal.DragonType;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter name of the Dragon:");
        String inputDragonName = Input.nextLine();
        System.out.println("Enter type of the Dragon: \n    amphithere,\n" +
                "    dragon,\n" +
                "    wyvern,\n" +
                "    lindWurm,\n" +
                "    lungDragon,\n" +
                "    drake,\n" +
                "    wyrm");
        String inputDragonType = Input.nextLine().toLowerCase();
        System.out.println("Enter age of the Dragon:");
        int inputDragonAge = Input.nextInt();
        System.out.println("Enter weight of the Dragon:");
        int inputDragonWeight = Input.nextInt();


        DragonType dragonTypeEnum = DragonType.valueOf(inputDragonType);

        Dragon myDragon = new Dragon(inputDragonName, inputDragonAge, inputDragonWeight, dragonTypeEnum);

        System.out.println(myDragon.toString());

        myDragon.say("Hello, here I am! Now you will die!");
        myDragon.fireRelease();
    }
}