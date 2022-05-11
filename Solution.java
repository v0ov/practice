import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {

        String[] participant = new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[] {"stanko", "ana", "mislav"};

        List <String> plist = Arrays.asList(participant);
        List clist = Arrays.asList(completion);

        Stream<String> stream = plist.stream();
        stream.forEach(System.out::println);

    }
}
