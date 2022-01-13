package dfsBfs;

import java.util.EmptyStackException;

class Stack<T> {
	//LIFO
	
	//POP() //�Ǹ������� ���� �����͸� �����ͼ� ����°�
	//PUSH() //���ο� �����͸� �� ���� �׾Ƴ��°�
	//PEEK() //�����Ͱ� �ִ��� Ȯ���ϴ� ��
	//ISEMPTY() //����ִ��� Ȯ���ϴ� ��.
	
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
		t.next = top; //���� top�� t.next�� ���� 
		top = t; //���� ���� Ÿ���� �����Ͱ� top�� ��
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
		System.out.println(s.pop()); // top = 3 2�� top�� �����
		System.out.println(s.peek()); // top�� ���� 2
		System.out.println(s.pop()); // top = 2
		System.out.println(s.isEmpty()); //top = 2�̹Ƿ� false
		System.out.println(s.pop());  //top = 1 �̹Ƿ� 1 ����ϰ� top.next�� �����Ƿ� null;
		System.out.println(s.isEmpty()); // top = null; true;
		
	}
}
