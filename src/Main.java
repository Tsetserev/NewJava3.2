public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int h = 170;
        int m = 90;
        double bodyMassIndex = service.bmi(h, m);
        System.out.println("Ваш индекс " + bodyMassIndex + " кг/м²");
    }
}
