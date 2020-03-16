public class MaximumProblemUsingGenerics <T extends Comparable <T>>{

    // Variables
    T firstVariable;
    T secondVariable;
    T thardVariable;

    public MaximumProblemUsingGenerics(T firstVariable, T secondVariable, T thardVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thardVariable = thardVariable;
    }

    public static void main(String[] args) {
        System.out.println("*************** Welcome to Generics ***************");
    }

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
    public T getMaximumNumber(){
        return getMaximumNumber(firstVariable,secondVariable,thardVariable);

    }
}
