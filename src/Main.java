public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 52;   //вес тела в кг
        double height = 1.64; //рост в м
        double result = service.calculate(52,1.64);

        System.out.println(result);
    }
}