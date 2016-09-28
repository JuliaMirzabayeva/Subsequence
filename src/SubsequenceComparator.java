import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubsequenceComparator
{
   static Map<Object,Integer> xMap = new HashMap<>();
   static Map<Object,Integer> yMap = new HashMap<>();

    public static boolean compare(ArrayList<Object> x, ArrayList<Object> y)
    {
        for(Object ob: x)
        {
            if(xMap.isEmpty() || !xMap.containsKey(ob))
                xMap.put(ob,1);
            else xMap.put(ob, xMap.get(ob)+ 1);
        }
        for(Object ob: y)
        {
            if(yMap.isEmpty() || !yMap.containsKey(ob))
                yMap.put(ob,1);
            else yMap.put(ob, yMap.get(ob)+ 1);
        }
        if(y.size() > x.size())
        {
            for(Map.Entry<Object,Integer> pair: xMap.entrySet())
            {
                Object key = pair.getKey();
                int value = pair.getValue();
                if(!yMap.containsKey(key) || yMap.get(key) < value)
                    return false;
            }
        }
        else
        {
            for(Map.Entry<Object,Integer> pair: yMap.entrySet())
            {
                Object key = pair.getKey();
                int value = pair.getValue();
                if(!xMap.containsKey(key) || xMap.get(key) < value)
                    return false;
            }
        }
        return true;
    }
}
