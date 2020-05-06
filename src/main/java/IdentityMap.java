import java.util.HashMap;
import java.util.Map;

public class IdentityMap {

    private static Map <Integer, Man> hash = new HashMap <>();

    public IdentityMap () {
    }

    public static Man isInto(int key) throws Exception {
        Man man = hash.get(new Integer (key));
        return man;
    }

    public static void add(Man man) {
        hash.put(new Integer(man.getId()), man);
    }
}
