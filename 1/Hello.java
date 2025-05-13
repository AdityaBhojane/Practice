import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {

        int[] roll = {1,2,3,4};

        System.err.println(sum(4,7));
        System.out.println(Arrays.toString(roll));
    }
    // java not allow nested function (methods)
    static int sum(int a, int b) {
        return a + b;
    }
}