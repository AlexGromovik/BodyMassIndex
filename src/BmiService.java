public class BmiService {
    public int calculate(double weight, double height) {
        // int index;
        // double bMi;
        double bMi = weight / Math.pow(height, 2);
        int index = (int) bMi;
        return index;
    }
}
