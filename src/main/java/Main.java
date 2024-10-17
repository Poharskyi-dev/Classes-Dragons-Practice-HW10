import mysticalAnimal.Dragon;

public class Main {
    public static void main(String[] args) {

    //Dragon creation
    Dragon dragon01 = new Dragon("Arrax", 100, 2000);
    Dragon dragon02 = new Dragon("Vermox", 200, 3000);
    Dragon dragon03 = new Dragon("Vhagar", 150, 2500);
    Dragon dragon04 = new Dragon();


    // check
    System.out.println(dragon01.toString());
    System.out.println(dragon02.toString());
    System.out.println(dragon03.toString());
    System.out.println(dragon04.toString());
    }
}

