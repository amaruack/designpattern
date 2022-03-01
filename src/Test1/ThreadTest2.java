package Test1;

import java.util.HashMap;
import java.util.Map;

public class ThreadTest2 {

	private Map<String, String> map1 = new HashMap<String, String>();
	private Map<String, String> map2 = new HashMap<String, String>();
	
	public void put1 (String key, String value){
		synchronized (map1) {
			map1.put(key, value);
		}
	}
	
	public void put2 (String key, String value){
		synchronized (map2) {
			map2.put(key, value);
		}
	}
}
