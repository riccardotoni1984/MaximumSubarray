import java.util.List;

public class MaximumSubarrayCalculator {

    public static int maxSubArray(List<Integer> numbers) {
        if (numbers.size() == 0) return 0;

        int previusValuesSum = numbers.get(0);
        int bestValue = numbers.get(0);

        for (Integer currentNumber : numbers) {
            previusValuesSum = previusValuesSum > 0 ? currentNumber + previusValuesSum : currentNumber;
            bestValue = Math.max(bestValue, previusValuesSum);
        }

        return bestValue;
    }
}