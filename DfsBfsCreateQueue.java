package dfsBfs;

import java.util.NoSuchElementException;

class Queue<T> {
	
	class Node<T> {
		//���� ������
		private T data;
		//���� ������
		private Node<T> next;
		//������ 
		public Node(T data) {
			this.data = data;
		}
	}
	//ù��° ��带 �˾ƾ���.
	private Node<T> first;
	//������ ��带 �˾ƾ���.
	private Node<T> last;
	//�߰��ϴ� �Լ� ����
	public void add (T item) {
		//���ο� ��� ����
		Node<T> t = new Node<T>(item);
		//���࿡ ������ �����Ͱ� �ִٸ� last��� next�� ���ο� ��带 ���
		if(last != null) {
			last.next = t;
		}
		//������ �����Ͱ� ���ٸ� last ���� ���ο�� ���� ��������.
		last = t;
		//���� ù��° �����Ͱ� ���ٸ�
		if(first == null) {
		//first node�� last��� ���� �����ͼ� ����	
			first = last;
		}
	}
	
	public T remove() {
		//Queue�� ��������� NoSuchElementException�� �����Ѵ�.
		if(first == null) {
			throw new NoSuchElementException();	
		}
		//ù��° �����͸� tmp�� ����
		T data = first.data;
		//ù��° ������ �ڸ��� ���� �Է°��� ����
		first = first.next;
		//���� ù��°�� null�̶��
		if(first == null) {
			//last�� null�� �ʱ�ȭ
			last = null;
		}
		//ù��° �����͸� ������
		return data;
	}
	//ù��° �����͸� ������(���� ó���� ���� ������)
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
		//queue�� �̿��ؼ� ����
		
	}
}
