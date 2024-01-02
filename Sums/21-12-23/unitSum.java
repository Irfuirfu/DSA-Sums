public class ElectricityBill {
    public static void main(String[] args) {
        int unitsConsumed = 200;
        int electricityBill = calculateElectricityBill(unitsConsumed);
        System.out.println("Electricity bill: Rs." + electricityBill);
    }
    private static int calculateElectricityBill(int unitsConsumed) {
        int extraCharge = 0;
        double costPerUnit = 0;

        if (unitsConsumed <= 200) {
            costPerUnit = 0.5;
        } else if (unitsConsumed <= 400) {
            costPerUnit = 0.65;
            extraCharge = 100;
        } else if (unitsConsumed <= 600) {
            costPerUnit = 0.80;
            extraCharge = 200;
        } else {
            costPerUnit = 1.25;
            extraCharge = 425;
        }
        int electricityBill = (int) (unitsConsumed * costPerUnit) + extraCharge;

        return electricityBill;
    }
}
