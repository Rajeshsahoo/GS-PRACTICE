package com.gspractice.util;

public class EntryNode<K, V> {

	private K key;
	private V value;
	private int hash;
	private EntryNode<K, V> next;
	

	public EntryNode(K key, V value, EntryNode<K, V> next) {
		super();
		this.key = key;
		this.value = value;
		this.next = next;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public EntryNode<K, V> getNext() {
		return next;
	}

	public void setNext(EntryNode<K, V> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "EntryNode [key=" + key + ", value=" + value + "]";
	}
	
	
}
