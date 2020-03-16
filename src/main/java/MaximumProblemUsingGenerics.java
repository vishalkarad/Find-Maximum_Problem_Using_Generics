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
    // Give three float number and find maximum number
    public Float maxFloatNumber(Float firstNumber,Float secondNumber,Float thardNumber){
        Float maxNumber = firstNumber;
        if(secondNumber.compareTo(maxNumber)>0){
            maxNumber = secondNumber;
        }
        if(thardNumber.compareTo(maxNumber)>0){
            maxNumber = thardNumber;
        }
        return maxNumber;
    }
    // Give 3 integer number and find maximum number
    public String maximumString(String firstString,String secondString,String thardString){
        String maxNumber = firstString;
        if(secondString.compareTo(maxNumber)>0){
            maxNumber = secondString;
        }
        if(thardString.compareTo(maxNumber)>0){
            maxNumber = thardString;
        }
        return maxNumber;
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
}
