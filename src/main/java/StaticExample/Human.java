package StaticExample;

public class Human {
    int age;
    int sallary;
    String name;
    boolean marride;
    static long population;

    public Human(int age, int sallary, String name, boolean marride) {
        this.age = age;
        this.sallary = sallary;
        this.name = name;
        this.marride = marride;
        this.population += 1;
    }
}
