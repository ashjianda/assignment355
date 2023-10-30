package assignment355;

public class TestTwo {

    public void testSum() {
        Assignment a = new Assignment();
        System.out.println(a.sum(10, 10) == 20);
    }

    public static void main(String[] args) {
        TestTwo t = new TestTwo();
        t.testSum();
    }
}