public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 48_000;
        int miles = service.calculate(price);
        System.out.println(miles);
        int price1 = 12_000;
        int miles1 = service.calculate(price1);
        System.out.println(miles1);
        int price2 = 148_000;
        int miles2 = service.calculate(price2);
        System.out.println(miles2);
    }
}