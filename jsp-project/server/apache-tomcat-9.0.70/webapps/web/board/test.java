
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

class Test{
    public void name() {
        ArrayList<HashMap<String,String>> resultList = new ArrayList<>();
        ArrayList<HashMap<String,String>> testList = resultList.stream()
        .filter(t ->  t.get("num"))
        .collect(Collectors.toList());
    }
}