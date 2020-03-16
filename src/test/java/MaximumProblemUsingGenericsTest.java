import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemUsingGenericsTest {

    MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics();
    @Test
    public void givenThreeNumber_WhenThardMax_ThenTrue() {
        Integer max=  maxnumber.getMaximumNumber(10,20,30);
        Assert.assertEquals((Integer) 30,max);
    }
    @Test
    public void givenThreeNumber_WhenSecondMaximum_ThenTrue() {
        Integer max=maxnumber.getMaximumNumber(10,30,20);
        Assert.assertEquals((Integer)30,max);
    }
    @Test
    public void givenThreeNumber_WhenFirstMaximum_ThenTrue() {
        Integer max=maxnumber.getMaximumNumber(30,20,30);
        Assert.assertEquals((Integer)30,max);
    }
    @Test
    public void givenThreeFloatNumber_WhenThardMax_ThenTrue() {
        Float max=maxnumber.getMaximumNumber(10.10f,20.20f,30.50f);
        Assert.assertEquals((Float)30.50f,max);
    }
    @Test
    public void givenThreeFloatNumber_WhenSecondMax_ThenTrue() {
        Float max=maxnumber.getMaximumNumber(10.10f,30.50f,20.20f);
        Assert.assertEquals((Float)30.50f,max);
    }
    @Test
    public void givenThreeFloatNumber_WhenFirstMax_ThenTrue() {
        Float max=maxnumber.getMaximumNumber(30.50f,10.10f,20.20f);
        Assert.assertEquals((Float)30.50f,max);
    }
    @Test
    public void givenThreeString_WhenThardMax_ThenTrue() {
        String max=maxnumber.getMaximumNumber("abc","pqr","xyz");
        Assert.assertEquals("xyz",max);
    }
    @Test
    public void givenThreeString_WhenSecondMax_ThenTrue() {
        String max=maxnumber.getMaximumNumber("abc","xyz","pqr");
        Assert.assertEquals("xyz",max);
    }
    @Test
    public void givenThreeString_WhenFirstMax_ThenTrue() {
        String max=maxnumber.getMaximumNumber("xyz","abc","pqr");
        Assert.assertEquals("xyz",max);
    }
    @Test
    public void givenThreeStringInCapitalLetter_WhenThardMax_ThenTrue() {
        String max=maxnumber.getMaximumNumber("ABC","PQR","XYZ");
        Assert.assertEquals("XYZ",max);
    }
    @Test
    public void givenThreeStringInCapitalLetter_WhenSecondMax_ThenTrue() {
        String max=maxnumber.getMaximumNumber("ABC","XYZ","PQR");
        Assert.assertEquals("XYZ",max);
    }
    @Test
    public void givenThreeStringInCapitalLetter_WhenFirstMax_ThenTrue() {
        String max=maxnumber.getMaximumNumber("XYZ","ABC","PQR");
        Assert.assertEquals("XYZ",max);
    }
    @Test
    public void givenThreeStringInNumbers_WhenThardMax_ThenTrue() {
        String max=maxnumber.getMaximumNumber("123","456","789");
        Assert.assertEquals("789",max);
    }
}

