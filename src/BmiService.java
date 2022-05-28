public class BmiService {

    public double calculate(double weight, double height){
    double result;
    double totalHeight;

    totalHeight=(height*height);
    result=(weight/totalHeight);

    return result;

    }
}

