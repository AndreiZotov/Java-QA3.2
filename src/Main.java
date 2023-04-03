public class Main {
    public static void main(String[] args) {
        System.out.println(" Расчёт индекса массы тела");

        BmiService service = new BmiService();

        int weightInKg = 98;

        double heightInMeters = 1.87;

        int bmiIndex = service.calculate(weightInKg, heightInMeters);

        System.out.println(bmiIndex);

    }
}