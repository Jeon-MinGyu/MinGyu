package kr.ac.cu.tv.factory;

public class TVfactory {
	private static TVfactory instance;
	private Map<String, TV> map;
	private TVfactory() {
		map = new HashMap<String, TV>();
		map.put("samsung", new SamsungTV());
	}
	
	public static TVfactory getInstance() {
		if(instance == null) {
			instance = new TVfactory();
		}
		return null;
	}
	
	public TV getBrand(String brand) {
		return null;
	}
	}
