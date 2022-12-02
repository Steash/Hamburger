public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Angus Beef", 14.54, "Sesame");
//        addHamburgerAddition1("Chips", 2.75);
        System.out.println("Added Chips for an extra 2.75");
        System.out.println("Added Drink for an extra 1.81");
//        this.price = 19.10;
        this.setPrice(19.10);
    }


    @Override
    public void addHamburgerAddition1(String additionName, double additionPrice) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    @Override
    public void addHamburgerAddition2(String additionName, double additionPrice) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    @Override
    public void addHamburgerAddition3(String additionName, double additionPrice) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }
    @Override
    public void addHamburgerAddition4(String additionName, double additionPrice) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }
}