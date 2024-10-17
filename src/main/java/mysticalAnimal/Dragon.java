package mysticalAnimal;

public class Dragon {

    private String name;
    private int age;
    private int weight;
    private DragonType dragonType;

    public Dragon() {
        System.out.println("Створено невідомго дракона");
    }

    public Dragon(String name, int age, int weight, DragonType dragonType) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dragonType = dragonType;
        System.out.println("Створено повноцінного дракона");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDragonType(DragonType dragonType) {
        this.dragonType = dragonType;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public DragonType dragonType() {
        return this.dragonType;
    }

    public void say(String sentence){
        System.out.println(System.lineSeparator());
        System.out.println(sentence);
    }

    public void fireRelease(){
        System.out.println("");
        System.out.println("\uD83D\uDD25 \uD83D\uDD25 \uD83D\uDD25");
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", dragonType=" + dragonType +
                '}';
    }
}

