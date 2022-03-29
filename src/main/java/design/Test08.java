package design;


/**
 * ��  ��  �� :		Test08.java
 * ��       �� :		Design pattern - Decorator ����
 * ��  ��  �� :		�տ���
 * �ۼ� �Ͻ� : 	2012.10.08
 * ������ �����Ǿ� �ִ� Ŭ������ ����� �߰��ϱ� ���� �����Դϴ�. ������ �ִ� Ŭ������ ����Ͽ� ����� ������ ���� Ŭ������ ������ ũ�� �ٸ����� �ʽ��ϴ�.
 */
public class Test08 {
    public static void main(String[] args) {
//        Decorator decorator = new Decorator();
//        System.out.println(decorator.getMerong());
//        Decorator child = new ChildDecorator(decorator);
//        System.out.println(child.getMerong());
//        Decorator child2 = new ChildDecorator(child);
//        System.out.println(child2.getMerong());
    	
    	Decorator decorator = new Decorator();
    	ChildDecorator chi1 = new ChildDecorator(decorator);
    	System.out.println(chi1.getMerong());
    	ChildDecorator chi2 = new ChildDecorator(chi1);
    	System.out.println(chi2.getMerong());
    }
}

class Decorator {
    public String getMerong(){
        return "merong";
    }
}


class ChildDecorator extends Decorator{
    private Decorator decorator;
    public ChildDecorator(Decorator decorator){
        this.decorator = decorator;
    }
    @Override
    public String getMerong(){
        return "@" + decorator.getMerong() + "@";
    }
}



