package com.gspractice.ds;

import java.util.Arrays;

import com.gspractice.util.EntryNode;

public class MyHashMap<K, V> {
	private EntryNode<K, V>[] table;
	private int capacity = 16;

	public MyHashMap() {
		table = new EntryNode[capacity];
	}
	

	public MyHashMap(int capacity) {
		table = new EntryNode[capacity];
		this.capacity = capacity;
	}

	
	@Override
	public String toString() {
		return "MyHashMap [table=" + Arrays.toString(table) + "]";
	}


	public void put(K key, V value) {
		int index = index(key);
		EntryNode<K, V> entryNode = new EntryNode<K, V>(key, value, null);
		if (table[index] == null) {
			table[index] = entryNode;
		}else {
			EntryNode<K, V> previousNode = null;
			EntryNode<K, V> currentNode = table[index];
			while(currentNode!=null) {
				if(currentNode.getKey().equals(key)) {
					currentNode.setValue(value);
					break;
				}
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
			if(previousNode!=null)
				previousNode.setNext(entryNode);
		}
	}

	public V get(K key) {
		V value = null;
		int index = index(key);
		EntryNode<K,V> currentNode = table[index];
		while(currentNode!=null) {
			if(currentNode.getKey().equals(key)) {
				value = currentNode.getValue();
				break;
			}
			currentNode = currentNode.getNext();
		}
		return value;
	}
	
	public void remove(K key) {
		int index = index(key);
		EntryNode<K, V> entry = table[index];
		EntryNode<K, V> previous = null;
		while(entry!=null) {
			if(entry.getKey().equals(key)) {
				if(previous==null) {
					entry = entry.getNext();
					table[index] = entry;
					return;
				}else {
					previous.setNext(entry.getNext());
					return;
				}
			}
			previous = entry;
			entry = entry.getNext();
		}
	}
	private int index(K key) {
		if (null == key)
			return 0;
		return Math.abs(key.hashCode() % capacity);
	}
	public static void main(String[] args) {
		MyHashMap<Integer, Integer> myHashMap = new MyHashMap<Integer, Integer>();
		myHashMap.put(1, 111);
		myHashMap.put(2, 222);
		//System.out.println(myHashMap);
		//System.out.println(myHashMap.get(1));
		myHashMap.remove(1);
		System.out.println(myHashMap);
	}
}
