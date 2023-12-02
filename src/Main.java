public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        {
            double height = 1.87;
            double weight = 98;

            double bmi = service.calculate(weight, height);

            System.out.printf("Body Mass Index %.0f", bmi);
        }
    }
}
// Body Mass Index 28