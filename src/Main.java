public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 65;
        double heightInMeters = 1.71;
        int bmi = service.calculate(weightInKg, heightInMeters);

        System.out.println("Индекс массы тела " + bmi);
    }
}
