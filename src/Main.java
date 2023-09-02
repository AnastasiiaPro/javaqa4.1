public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bodyWeightKg = 98;
        double statureM = 1.87;

        int bodyMassIndex = service.calculate(98, 1.87);
        System.out.println("Bmi-индекс: " + bodyMassIndex);
    }
}