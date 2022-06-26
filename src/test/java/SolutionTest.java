import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void scheduleCourseExample1() {
    assertEquals(3, sol.scheduleCourse(new int[][]{
        {100,200},
        {200, 1300},
        {1000, 1250},
        {2000, 3200}
    }));
  }
  @Test
  void scheduleCourseExample2() {
    assertEquals(1, sol.scheduleCourse(new int[][]{
        {1,2}
    }));
  }
  @Test
  void scheduleCourseExample3() {
    assertEquals(0, sol.scheduleCourse(new int[][]{
        {3,2},
        {4,3}
    }));
  }
}