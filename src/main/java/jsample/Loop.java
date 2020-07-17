package jsample;

public class Loop {

    private TestClass testClass;

    public TestClass getTestClass() {
        return testClass;
    }

    public void setTestClass(TestClass testClass) {
        this.testClass = testClass;
    }

    public boolean test(int count) {
        if (count < 0) {
            return false;
        }
        for (int i = 0; i < count; i++) {
            testClass.print(i);
        }
        return true;
    }
}