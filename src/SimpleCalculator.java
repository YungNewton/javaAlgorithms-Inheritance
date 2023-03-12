public class SimpleCalculator {
    // write your code here
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        double addition = firstNumber+secondNumber;
        return addition;
    }
    public double getSubtractionResult(){
        double sub = firstNumber-secondNumber;
        return sub;
    }
    public double getMultiplicationResult(){
        double sub = firstNumber*secondNumber;
        return sub;
    }
    public double getDivisionResult (){
        if(secondNumber == 0){
            return 0;
        }else {
            double sub = firstNumber/secondNumber;
            return sub;
        }
    }
}