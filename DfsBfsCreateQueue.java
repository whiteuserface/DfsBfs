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
	//�߰��ϴ� �Լ� ����
	public void add (T item) {
		Node<T> t = new Node<T>(item);
		
		if(last != null) {
			last.next = t;
		}
		
		//�������� null�̸� ������忡 �ݹ游�� t�� ���δ�.
		last = t;
		
		if(first == null) {
		//ù��°���� null�̸� last	
			first = last;
		}
	}
	
	public T remove() {
		//Queue�� ��������� NoSuchElementException�� �����Ѵ�.
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
		//Depth-Frist Search (DFS)
		//inorder
		//preorder
		//postorder
		//stack�� �̿��ؼ� ����

		
		//Breadth-First Search(BFS)
		//queue�� �̿��ؼ� ����
		
	}
}
