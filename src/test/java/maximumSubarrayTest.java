import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class maximumSubarrayTest {


    @Test
    public void acceptanceTest() {
        List<Integer> array = Arrays.asList(-2,1,-3,4,-1,2,1,-5,4);
        assertEquals(6, MaximumSubarrayCalculator.maxSubArray(array));
    }
}
