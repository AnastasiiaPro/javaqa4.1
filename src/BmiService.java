public class BmiService {
    public int calculate(int bodyWeightKg, double statureM) {

        int bodyMassIndex = (int) (bodyWeightKg / (statureM * statureM));
        return bodyMassIndex;
    }
}

