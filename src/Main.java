public class Main {
    public static void main(String[] args) {
        System.out.println(" Расчёт индекса массы тела");

        bmiService service = new bmiService();

        int weightInKg = 98;

        double heightInMeter = 1.87;

        int bmiIndex = service.calculate(weightInKg, heightInMeter);

        System.out.println(bmiIndex);

    }
}