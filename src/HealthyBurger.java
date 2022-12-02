public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Whole grain");
    }

    public void addHealthyAddition1(String healthyExtraName, double healthyExtraPrice) {
        this.healthyExtra1Name = healthyExtraName;
        this.healthyExtra1Price = healthyExtraPrice;
        System.out.println("Added " + healthyExtraName + " for an extra "  +healthyExtraPrice);
    }

    public void addHealthyAddition2(String healthyExtraName, double healthyExtraPrice) {
        this.healthyExtra2Name = healthyExtraName;
        this.healthyExtra2Price = healthyExtraPrice;
        System.out.println("Added " + healthyExtraName + " for an extra " + healthyExtraPrice);
    }

    @Override
    public double itemizeHamburger() {
//        System.out.println("A Healthy Hamburger with " + healthyExtra1Name + " and " + healthyExtra2Name + ".");
        return this.getPrice() + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price + this.healthyExtra1Price + this.healthyExtra2Price;
    }
}