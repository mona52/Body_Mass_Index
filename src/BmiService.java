public class BmiService {
    public float calculate (float height, float weight) {
        float bmi = weight / (height * height)*10000;
        return bmi;
    }
}
