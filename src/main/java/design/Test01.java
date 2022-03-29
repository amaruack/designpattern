package design;

/**
 * ��  ��  �� :		Test01.java
 * ��       �� :		Design pattern - iterator ����
 * ��  ��  �� :		�տ���
 * �ۼ� �Ͻ� : 	2012.10.05
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
	 
	 public static void main(String[] args) {
		  MagicianList magicians = new MagicianList();
		  magicians.add("�տ���");
		  magicians.add("son young jun");
		  
		  Iterator<String> iterator = magicians.iterator();
		  while (iterator.hasNext()) {
		   String element = iterator.next();
		   System.out.println(element);
		  }
	}
	 
}
	 
class MagicianList implements Iterable<String> {
	 private List<String> list = new ArrayList<String>();
	 
	 public void add(String name){
	  list.add(name);
	 }

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<String>(){
			int seq = 0;
			public boolean hasNext() {
				return seq<list.size();
			}
			public String next() {
				return list.get(seq++);
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
		};
		
	}
	
	
}
