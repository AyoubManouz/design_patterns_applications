package application;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int[] register = new int[len+1];
        for (int i : nums) {
            register[i] = 1;
        }

        System.out.println(register[0]);

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i<=len; i++) {
            if(register[i] ==0) list.add(i);
        }
        return list;
    }
}
