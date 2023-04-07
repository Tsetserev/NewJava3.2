public class BmiService {
    public double bmi(double h, double m) {
        double index = m / (h * h) * 10000;
        return index;
    }
}
