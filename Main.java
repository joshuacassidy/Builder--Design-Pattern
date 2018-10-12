public class Main {

    public static void main(String[] args) {
        Sandwich sandwich = new SandwichBuilder().setBread("White").setMeat("bacon").setSauce("ketchup").build();
        System.out.println(sandwich);
    }
}