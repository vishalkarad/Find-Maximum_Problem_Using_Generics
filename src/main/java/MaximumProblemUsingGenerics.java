public class MaximumProblemUsingGenerics <T extends Comparable <T>>{

    // Variables
    T firstVariable;
    T secondVariable;
    T thardVariable;

    // Set instance variable value using constructor
    public MaximumProblemUsingGenerics(T firstVariable, T secondVariable, T thardVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thardVariable = thardVariable;
    }
    // main method
    public static void main(String[] args) {
        System.out.println("*************** Welcome to Generics ***************");
    }
    // Generate maximum value
    public <T extends Comparable <T>> T  getMaximumNumber(T firstValue,T secondValue, T thardValue){

        T maximumResult = firstValue;
        if(secondValue.compareTo(maximumResult)>0){
            maximumResult = secondValue;
        }
        if(thardValue.compareTo(maximumResult)>0){
            maximumResult = thardValue;
        }
        return maximumResult;
    }
    // pass instance value
    public T getMaximumNumber(){
        T maxvalue = getMaximumNumber(firstVariable,secondVariable,thardVariable);
        printMaxValue(maxvalue);
        return maxvalue;
    }
    // print max value
    public void printMaxValue(T maxValue){
        System.out.println(maxValue);
    }
}
