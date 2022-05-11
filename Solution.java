import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Solution {
    public static void main(String[] args) {

        String[] participant = new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[] {"stanko", "ana", "mislav"};

        Map<String, Long> pMap = Arrays.asList(participant).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //찾아서 한부분
        // 배열을 리스트로 받는법 asList
        // 스트림에서 그룹바이 하는 법 collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        // 그룹바이 한것을 맵으로 받는 법
        // ?? asList로 배열을 리스트로 받은걸 스트림 그룹바이로 어떻게 맵으로 한번에 받을수있게 되는지 모르겟다


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
