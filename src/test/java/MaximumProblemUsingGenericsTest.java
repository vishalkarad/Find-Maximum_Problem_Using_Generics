import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemUsingGenericsTest {

    MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics();
    @Test
    public void givenThreeNumber_WhenThardMax_ThenTrue() {
        int max=maxnumber.maxnumber(10,20,30);
        Assert.assertEquals(30,max);
    }
    @Test
    public void givenThreeNumber_WhenSecondMaximum_ThenTrue() {
        int max=maxnumber.maxnumber(10,30,20);
        Assert.assertEquals(30,max);
    }
    @Test
    public void givenThreeNumber_WhenFirstMaximum_ThenTrue() {
        int max=maxnumber.maxnumber(30,20,30);
        Assert.assertEquals(30,max);
    }
    @Test
    public void givenThreeFloatNumber_WhenThardMax_ThenTrue() {
        Float max=maxnumber.maxFloatNumber(10.10f,20.20f,30.50f);
        Assert.assertEquals((Float)30.50f,max);
    }
}