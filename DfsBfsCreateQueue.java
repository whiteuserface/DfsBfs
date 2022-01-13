package dfsBfs;

import java.util.NoSuchElementException;

class Queue<T> {
	
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	//추가하는 함수 구현
	public void add (T item) {
		Node<T> t = new Node<T>(item);
		
		if(last != null) {
			last.next = t;
		}
		
		//이전것이 null이면 이전노드에 금방만든 t를 붙인다.
		last = t;
		
		if(first == null) {
		//첫번째것이 null이면 last	
			first = last;
		}
	}
	
	public T remove() {
		//Queue가 비어있으면 NoSuchElementException을 실행한다.
		if(first == null) {
			throw new NoSuchElementException();	
		}
		
		T data = first.data;
		first = first.next;
		
		if(first == null) {
			last = null;
		}
		
		return data;
	}
	
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
		Queue<Integer> q = new Queue<Integer>();
		//4개의 Node를 추가한다.
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		//확인
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
	}
}
