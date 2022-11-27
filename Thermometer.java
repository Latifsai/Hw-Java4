public class Thermometer {

    double convToFahrenheit;
    double convToCeil;


    private double concentToBigNum (double num){
        return  Math.ceil(num);
    }

    public double convetToFarren(){
        double contToFar = (convToCeil * 9/5) + 32;
        return Math.ceil(contToFar);
    }

    public double convetToCelsius (){
        double convetToFahrrenheit = (convToFahrenheit - 32) * 5/9;
        return Math.ceil(convetToFahrrenheit);
    }

    public Thermometer(double convToFahrenheit, double convToCeil) {
        this.convToFahrenheit = convToFahrenheit;
        this.convToCeil = convToCeil;
    }
}
