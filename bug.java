// import static org.junit.Assert.*;
// import org.junit.*;


public class bug{
    static int[] nums = {1, 5, 9, 2, 7};
    public static void main(String[] args){
        System.out.println("The sum is "+ ArraySum.sum(nums));
        System.out.println(Test.assertEquals(24, ArraySum.sum(nums)));   
    }

}

class ArraySum{
    static int sum(int[] nums){
        int sum = 0;
        for(int i = 1; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

}

class Test{
    public static String assertEquals(int expected, int actual){
        if(expected == actual){
            return "Tests passed, ran 1 tests";
        }
        return "Failure!!!!!!!!! Expected was " + expected + ", but actual was " + actual;
    }

}
