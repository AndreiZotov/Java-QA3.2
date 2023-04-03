public class bmiService {

    public int calculate(int weightInKg, double heightInMeters) {

        double bmiIndex = weightInKg / heightInMeters / heightInMeters;

        return (int) bmiIndex;
    }
}
