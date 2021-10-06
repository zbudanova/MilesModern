public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int milesBeLowLimit = service.calculate(1);
        System.out.println(milesBeLowLimit);

        int milesOverLimit = service.calculate(10_000);
        System.out.println(milesOverLimit);

        int milesEqualityLimit = service.calculate(20);
        System.out.println(milesEqualityLimit);
    }
}
