package dfsBfs;

import java.util.EmptyStackException;

class Stack<T> {
	//LIFO
	
	//POP() //맨마지막에 넣은 데이터를 가져와서 지우는거
	//PUSH() //새로운 데이터를 맨 위에 쌓아놓는거
	//PEEK() //데이터가 있는지 확인하는 것
	//ISEMPTY() //비어있는지 확인하는 것.
	
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top;
	
	public T pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top; //기존 top을 t.next로 보냄 
		top = t; //지금 들어온 타입의 데이터가 top이 됨
	}
	public T peek() {
		if(top==null) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	public boolean isEmpty() {
		return top == null;
	}
}


public class DfsBfsCreateStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.pop());//top = 4
		System.out.println(s.pop()); // top = 3 2를 top에 저장됨
		System.out.println(s.peek()); // top을 선택 2
		System.out.println(s.pop()); // top = 2
		System.out.println(s.isEmpty()); //top = 2이므로 false
		System.out.println(s.pop());  //top = 1 이므로 1 출력하고 top.next가 없으므로 null;
		System.out.println(s.isEmpty()); // top = null; true;
		
	}
}
