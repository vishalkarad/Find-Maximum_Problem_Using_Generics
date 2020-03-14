import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemUsingGenericsTest {

    MaximumProblemUsingGenerics maxnumber = new MaximumProblemUsingGenerics();
    @Test
    public void given3Number_WhenFindMax_ThenTrue() {
        int max=maxnumber.maxnumber(10,20,30);
        Assert.assertEquals(30,max);
    }

}
