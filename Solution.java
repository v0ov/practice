import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Solution {
    public static void main(String[] args) {

        String[] participant = new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[] {"stanko", "ana", "mislav"};

        Map<String, Long> pMap = Arrays.asList(participant).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (String complete : completion){
            Long val = pMap.get(complete) - 1;
            pMap.put(complete, val);
        }

        String retVal = "";
        for (String nComp : pMap.keySet()){
            if(pMap.get(nComp) > 0){
                retVal = nComp;
            }
        }
        System.out.println(retVal);
    }
}
