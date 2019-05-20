import org.apache.thrift.TException;
import java.util.*;
public class MapHandler implements CustomMap.Iface
{
Map<String, String> numberMapping = new HashMap<>();

        @Override
        public boolean ping() throws TException {
			System.out.println("I got ping()");
			return true;
		}

        @Override
        public void put(String key,String val) throws TException {
		System.out.println("key"+key+"val"+val);
				 numberMapping.put(key, val);
        }
        
        @Override
        public String get(String key) throws TException {
				System.out.println("key"+key);
                return numberMapping.get(key);
        }
}