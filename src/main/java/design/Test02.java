package design;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * ��  ��  �� :		Test02.java
 * ��       �� :		Design pattern - adapter ����
 * ��  ��  �� :		�տ���
 * �ۼ� �Ͻ� : 	2012.10.05
 */

class IteratorToEnumeration implements Enumeration<String> {

	private Iterator<String> ite;
	
	public IteratorToEnumeration(Iterator<String> ite){
		this.ite = ite;
	}
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return ite.hasNext();
	}

	@Override
	public String nextElement() {
		// TODO Auto-generated method stub
		return ite.next();
	}
	
}

//class IteratorToEnumeration implements Enumeration<String>{
//    private Iterator<String> iter;
//    public IteratorToEnumeration(Iterator<String> iter) {
//        this.iter = iter;
//    }
//    public boolean hasMoreElements() {
//        return iter.hasNext();
//    }
//    public String nextElement() {
//        return iter.next();
//    }
//}

public class Test02 {
	
	public static void goodMethod(Enumeration<String> enu){
		while (enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("��");
		list.add("dudwisdofij");
		
		Enumeration<String> ite = new IteratorToEnumeration(list.iterator());
		Test02.goodMethod(ite);
	}
	

}
