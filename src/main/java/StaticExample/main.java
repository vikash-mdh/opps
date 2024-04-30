package StaticExample;

public class main {
    public static void main(String[] args) {
        Human vikash = new Human(22, 24000,"vikash", false);
        Human rahul = new Human(23, 25000, "rahul", true);
        Human arpit = new Human(26, 5600, "arpit",  false);
       // System.out.println(vikash.name +" "+ vikash.sallary+" "+ vikash.age+" "+ vikash.marride);
       // System.out.println(vikash.sallary);
//        System.out.println(rahul.population);
//        System.out.println(arpit.population);
//        System.out.println(vikash.population);
    }

    // this is not dependent on objects
    static void fun(){
        // greeting(); // you cant use this beacause it required an instance
        // but the function you are using it in does depend on instance

        // you can not access not static stuff without refrecing their instance in a static contest

        // hence here i ma refrencing it
        main obj = new main();
        obj.greeting();
    }

    // we know that somthing which is not static , belongs to an objects

    void greeting(){
      //  fun();
        System.out.println("hello dosto");
    }
}
