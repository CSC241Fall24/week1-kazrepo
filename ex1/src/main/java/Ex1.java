public class Ex1 {
    /**
     * Calculate the sum of an arithmetic progression.
     *
     * @param start The first term of the progression
     * @param step The common difference between consecutive terms
     * @param count The number of terms to sum
     * @return The sum of the arithmetic progression
     */

    public static long calculateGaussSum(long start, long step, int count) {
        long result = 0;
        for(int i = 0; i < count; i++){
            result += start + (step * i);
        }
        System.out.println(result);
        return result; // This is a placeholder return value. Replace it with your calculation.
    }

    public static void main(String[] args) {
        long start = 81297;
        long step = 198;
        int count = 100;
        calculateGaussSum(start, step, count);
    }
}