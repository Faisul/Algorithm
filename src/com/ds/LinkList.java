package com.ds;

class LinkList<E> {

	Node first;
	Node tail;
	int size = 0;

	public boolean add(E element) {
		addLast(element);
		size++;
		return true;
	}

	private void addLast(E element) {
		if (null == element)
			return;

		if (first == null && tail == null) {
			first = new Node(element, null, null);
			tail = first;
		} else
			tail.next = new Node(element, null, tail);
	}

	public boolean remove(E element) {
		if (!removeFirst(element)) {
			Node current = first;
			while (current.next != null) {
				if (current.element.equals(element)) {
					current.prev.next = current.next;
					current.next.prev = current.prev;
				}
				current = current.next;
				size--;
			}
		}
		return true;
	}

	boolean removeFirst(E element) {
		if (first.next == null) {
			first = null;
			tail = null;
			return true;
		}
		return false;
	}

	/*
	 * This is a node class that has both elements and reference of next node
	 */
	class Node {
		E element;
		Node next;
		Node prev;

		Node(E element, Node next, Node prev) {
			this.element = element;
			this.next = next;
			this.prev = prev;
		}

		@Override
		public String toString() {
			return "Node [element=" + element + ", next=" + next + ", prev=" + prev + "]";
		}

	}

	@Override
	public String toString() {
		Node current = first;
		StringBuilder s = new StringBuilder();
		while (current != null) {
			s.append(current.element).append(",");
			current = current.next;
		}
		if (s.length() > 0)
			s.deleteCharAt(s.length() - 1);
		return s.toString();
	}

}