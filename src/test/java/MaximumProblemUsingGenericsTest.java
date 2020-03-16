import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemUsingGenericsTest {

    @Test
    public void givenThreeNumber_WhenThardMax_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics(10,20,30);
        Integer max=(Integer)maxnumber.getMaximumNumber();
        Assert.assertEquals((Integer) 30,max);
    }
    @Test
    public void givenThreeNumber_WhenSecondMaximum_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics(10,30,20);
        Integer max=(Integer)maxnumber.getMaximumNumber();
        Assert.assertEquals((Integer) 30,max);
    }
    @Test
    public void givenThreeNumber_WhenFirstMaximum_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics(30,10,20);
        Integer max=(Integer)maxnumber.getMaximumNumber();
        Assert.assertEquals((Integer) 30,max);
    }
    @Test
    public void givenThreeFloatNumber_WhenThardMax_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics(10.10f,20.20f,30.50f);
        Float max=(Float)maxnumber.getMaximumNumber();
        Assert.assertEquals((Float)30.50f,max);

    }
    @Test
    public void givenThreeFloatNumber_WhenSecondMax_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics(10.10f,30.50f,20.20f);
        Float max=(Float)maxnumber.getMaximumNumber();
        Assert.assertEquals((Float)30.50f,max);
    }
    @Test
    public void givenThreeFloatNumber_WhenFirstMax_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics(30.50f,10.10f,20.20f);
        Float max=(Float)maxnumber.getMaximumNumber();
        Assert.assertEquals((Float)30.50f,max);
    }
    @Test
    public void givenThreeString_WhenThardMax_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics("abc","pqr","xyz");
        String max=(String)maxnumber.getMaximumNumber();
        Assert.assertEquals("xyz",max);
    }
    @Test
    public void givenThreeString_WhenSecondMax_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics("abc","xyz","pqr");
        String max=(String)maxnumber.getMaximumNumber();
        Assert.assertEquals("xyz",max);
    }
    @Test
    public void givenThreeString_WhenFirstMax_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics("xyz", "abc", "pqr");
        String max = (String) maxnumber.getMaximumNumber();
        Assert.assertEquals("xyz", max);
    }
    @Test
    public void givenThreeStringInCapitalLetter_WhenThardMax_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics("ABC","PQR","XYZ");
        String max=(String)maxnumber.getMaximumNumber();
        Assert.assertEquals("XYZ",max);

    }
    @Test
    public void givenThreeStringInCapitalLetter_WhenSecondMax_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics("ABC","XYZ","PQR");
        String max=(String)maxnumber.getMaximumNumber();
        Assert.assertEquals("XYZ",max);
    }
    @Test
    public void givenThreeStringInCapitalLetter_WhenFirstMax_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics("XYZ","ABC","PQR");
        String max=(String)maxnumber.getMaximumNumber();
        Assert.assertEquals("XYZ",max);
    }
    @Test
    public void givenThreeStringInNumbers_WhenThardMax_ThenTrue() {
        MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics("123", "456", "789");
        String max = (String) maxnumber.getMaximumNumber();
        Assert.assertEquals("789", max);
    }
}

