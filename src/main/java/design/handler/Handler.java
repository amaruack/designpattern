package design.handler;

/**
 * @author rino
 * @version 1.0.0
 * @name Handler
 * @since 2022-03-16 오후 3:20
 */
public abstract class Handler {
	public String name;
	private Handler next;

	public Handler(String name) {
		this.name = name;
	}

	public void setNext(Handler next) {
		this.next = next;
	}

	public void handleRequest(int number) {
		if (canHandle(number)) {
			print(number);
//            chain이 연결되어 있으면 다음 처리 객체에 문제 전달 (oddHandler -> evenHandler 순으로 처리)
		} else if (next != null) {
			next.handleRequest(number);
		} else {
			System.out.println("처리할 수 있는 객체 없음");
		}
	}

	public void print(int number) {
		System.out.println(number + ":" + name + "로 처리");
	}

	public abstract boolean canHandle(int number);

}