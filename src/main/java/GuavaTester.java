import com.google.common.math.*;

public class GuavaTester {
    public static void main(String[] args) {
        int bigNum = Integer.MAX_VALUE;

        System.out.println(bigNum + 1);
        try {
            System.out.println(IntMath.checkedAdd(bigNum, 1));
        } catch (ArithmeticException e) {
            System.err.println("OVERFLOW DETECTED OH NO");
        }
    }
}
