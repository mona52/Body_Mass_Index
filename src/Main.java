public class Main {
    public static void main(String[] args) {
        BmiService service1 = new BmiService();
        float height1 = 158.40f;
        float weight1 = 60.50f;
        float bmi1 = service1.calculate(height1,weight1);
        System.out.println(bmi1);
    }
}
