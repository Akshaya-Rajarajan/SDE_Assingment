package assigment_framework_test;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;

public class Test {
	
	Map<String,String> classList = new HashMap<String,String>();
	public Test() {
		classList.put("Bob","A");
		classList.put("Mary","C");
		classList.put("Sara","A");
		classList.put("Greg","B");
	}
	
public void printClassList() {
	Iterator <Map.Entry<String, String>> entries = classList.entrySet().iterator();
	while(entries.hasNext()) {
		Map.Entry<String, String> entry = entries.next();
		System.out.println("Key ="+ entry.getKey() +", value = "+ entry.getValue());
	} 
} 
public void printClassList2(){
for (Map.Entry<String, String> entry : classList.entrySet()){
System.out.println("Key = " + entry.getKey() + ", value =" + entry.getValue());
}

for(String key : classList.keySet()){
System.out.println("Key = " + key);
}

for(String value : classList.values()){
System.out.println("Value = " + value);
}
}
public static void main(String[] args) {
	Test myClassList = new Test();
	myClassList.printClassList2();
	Test myList2 = new Test();
	myList2.printClassList();
}
}
