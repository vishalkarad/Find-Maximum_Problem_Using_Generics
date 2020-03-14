public class MaximumProblemUsingGenerics {
    public static void main(String[] args) {
        System.out.println("*************** Welcome to Generics ***************");
    }
    // Give 3 integer number and find maximum number
    public Integer maxnumber(Integer firstNumber,Integer secondNumber,Integer thardNumber){
        Integer maxNumber = firstNumber;
        if(secondNumber.compareTo(maxNumber)>0){
            maxNumber = secondNumber;
        }
        if(thardNumber.compareTo(maxNumber)>0){
            maxNumber = thardNumber;
        }
        return maxNumber;
    }

}
