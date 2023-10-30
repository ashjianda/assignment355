package assignment355;

public class TestOne {

    public void testSum() {
        Assignment a = new Assignment();
        System.out.println(a.sum(2, 3) == 5);
    }

    public static void main(String[] args) {
        TestOne t = new TestOne();
        t.testSum();
    }
}
