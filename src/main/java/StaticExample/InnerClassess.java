package StaticExample;

public class InnerClassess {
   static class Test{
       String name;
       public Test(String name){

           this.name = name;
       }

    }

    public static void main(String[] args) {
        Test a = new Test("vikash");
        Test b = new Test("arpit");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
