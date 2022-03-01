package Design;


/**
 * 파  일  명 :		Test08.java
 * 설       명 :		Design pattern - Decorator 예제
 * 작  성  자 :		손영준
 * 작성 일시 : 	2012.10.08
 * 기존에 구현되어 있는 클래스에 기능을 추가하기 위한 패턴입니다. 기존에 있던 클래스를 상속하여 만들기 때문에 기존 클래스와 사용법이 크게 다르지는 않습니다.
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



