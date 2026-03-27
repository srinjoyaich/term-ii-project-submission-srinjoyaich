import java.time.Duration;
import java.time.LocalDateTime;

class Ticket {
    private Vehicle vehicle;
    private int slotNumber;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(Vehicle vehicle, int slotNumber) {
        this.vehicle = vehicle;
        this.slotNumber = slotNumber;
        this.entryTime = LocalDateTime.now();
    }

    public double generateBill() {
        exitTime = LocalDateTime.now();
        long hours = Duration.between(entryTime, exitTime).toHours();

        if (hours == 0) hours = 1;

        return vehicle.calculateFee(hours);
    }

    public void printTicket(double bill) {
        System.out.println("\n PARKING RECEIPT ");
        System.out.println("Vehicle Number: " + vehicle.getNumber());
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Slot Number: " + slotNumber);
        System.out.println("Entry Time: " + entryTime);
        System.out.println("Exit Time: " + exitTime);
        System.out.println("Total Fee: ₹" + bill);
        System.out.println("\n");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getSlotNumber() {
        return slotNumber;
    }
}