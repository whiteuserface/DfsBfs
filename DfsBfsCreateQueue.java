package dfsBfs;

import java.util.NoSuchElementException;

class Queue<T> {
	
	class Node<T> {
		//들어온 데이터
		private T data;
		//다음 데이터
		private Node<T> next;
		//생성자 
		public Node(T data) {
			this.data = data;
		}
	}
	//첫번째 노드를 알아야함.
	private Node<T> first;
	//마지막 노드를 알아야함.
	private Node<T> last;
	//추가하는 함수 구현
	public void add (T item) {
		//새로운 노드 생성
		Node<T> t = new Node<T>(item);
		//만약에 마지막 데이터가 있다면 last노드 next에 새로운 노드를 등록
		if(last != null) {
			last.next = t;
		}
		//마지막 데이터가 없다면 last 값을 새로운만든 노드로 지정해줌.
		last = t;
		//만약 첫번째 데이터가 없다면
		if(first == null) {
		//first node를 last노드 값을 가져와서 저장	
			first = last;
		}
	}
	
	public T remove() {
		//Queue가 비어있으면 NoSuchElementException을 실행한다.
		if(first == null) {
			throw new NoSuchElementException();	
		}
		//첫번째 데이터를 tmp에 저장
		T data = first.data;
		//첫번째 데이터 자리에 다음 입력값을 저장
		first = first.next;
		//만약 첫번째가 null이라면
		if(first == null) {
			//last도 null로 초기화
			last = null;
		}
		//첫번째 데이터를 돌려줌
		return data;
	}
	//첫번째 데이터를 가져옴(가장 처음에 넣은 데이터)
	public T peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
}


public class DfsBfsCreateQueue {
	public static void main(String[] args) {
		//Depth-Frist Search (DFS)
		//inorder
		//preorder
		//postorder
		//stack을 이용해서 구현
		Queue<Integer> q = new Queue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		
		
		
		//Breadth-First Search(BFS)
		//queue을 이용해서 구현
		
	}
}
