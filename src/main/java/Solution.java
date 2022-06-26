import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
  public int scheduleCourse(int[][] courses) {
    // sort by LastDay decrease
    Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
    PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)-> b-a);
    int time = 0;
    for (int[] course : courses) {
      int duration = course[0];
      int lastDay = course[1];
      if (time + duration <= lastDay) {
        time += duration;
        queue.add(duration);
      } else if (!queue.isEmpty() && queue.peek() > duration) {
        int first_large_duration = queue.poll();
        time += duration - first_large_duration;
        queue.add(duration);
      }
    }
    return queue.size();
  }
}
