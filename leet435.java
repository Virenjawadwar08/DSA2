import java.util.Arrays;

public class leet435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Step 1: sort by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0; // number of intervals to remove
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                // overlap → remove this interval
                count++;
            } else {
                // no overlap → update end
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }
}
