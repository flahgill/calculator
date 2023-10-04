public class Calculator {
    public Double add(Double a, Double b){
        Double result = a + b;
        return result;
    }

    public Double substract(Double a, Double b){
        Double result = a - b;
        return result;
    }

    public Double multiply(Double a, Double b){
        Double result = a * b;
        return result;
    }

    public Double divide(Double a, Double b){
        if(b == 0){
            throw new IllegalArgumentException("Can't divide by 0!");
        }
        Double result = a / b;
        return result;
    }
}
