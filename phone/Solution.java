package phone;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        String[] phone_book = new String[] {"12","123","88","1235","567"};

        List list = Arrays.asList(phone_book).stream().sorted().toList();

        System.out.println(list);
    }
}
