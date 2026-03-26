abstract class Vehicle {
    private String number;
    private String type;

    public Vehicle(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public abstract double calculateFee(long hours);
}