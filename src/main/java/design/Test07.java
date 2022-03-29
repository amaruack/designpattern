package design;

import java.util.ArrayList;
import java.util.List;

/**
 * ��  ��  �� :		Test07.java
 * ��       �� :		Design pattern - Composite  ����
 * ��  ��  �� :		�տ���
 * �ۼ� �Ͻ� : 	2012.10.08
 * 
 * ���� �����Ϳ� ���� �Ϲ����� Ʈ�� ������ ������ Ÿ���� ����� ���� Composite �����Դϴ�
 * Composite �ռ���
 */

public class Test07 {
	public static void main(String[] args) {
		Composite main = new Composite("Main");
        Composite sub1 = new Composite("sub1");
        Composite sub2 = new Composite("sub2");
        Composite sub11 = new Composite("sub11");
        Composite sub12 = new Composite("sub12");
        Composite sub13 = new Composite("sub13");
        Composite sub21 = new Composite("sub21");
        Composite sub22 = new Composite("sub22");
        Leaf leaf14 = new Leaf("leaf14");
        Leaf leaf121 = new Leaf("leaf121");
        Leaf leaf122 = new Leaf("leaf122");
       
        main.add(sub1);
        main.add(sub2);
        sub1.add(sub11);
        sub1.add(sub12);
        sub1.add(sub13);
        sub2.add(sub21);
        sub2.add(sub22);
        sub1.add(leaf14);
        sub12.add(leaf121);
        sub12.add(leaf122);
       
        System.out.println(main.getString());
	}	
}

abstract class Component {
	private String componentName;
	protected List<Component> children = new ArrayList<Component>();
	public Component(String componentName){
		this.componentName = componentName;
	}
	public String getComponentName(){
		return componentName;
	}
	public abstract void add(Component c);
	public List<Component> getChildrem(){
		return children;
	}
	public String getString(){
		return getString(0);
	}
	private String getString(int depth) {
		StringBuffer sb = new StringBuffer();
		if ( this instanceof Composite) {
			for ( int i=0 ; i<depth; i++){
				sb.append(" ");
			}
			sb.append("+"+getComponentName()+"\n");
			for( Component comp: children){
				sb.append(comp.getString(depth+1));
			}
		} else {
			for (int i = 0; i < depth; i++) {
				sb.append(" ");
			}
			sb.append("-"+getComponentName()+"\n");
		}
		return sb.toString();
	}	
}

class Composite extends Component {
	public Composite(String componentName){
		super(componentName);
	}
	
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	} 
}

class Leaf extends Component {
	public Leaf(String componentName){
		super(componentName);
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}
		
		






