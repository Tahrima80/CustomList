package com.naztech;

import java.util.Arrays;

public class CustomList<T> {
	private Object[] elements;
	private int size = 0;
	
	public CustomList() {
        elements = new Object[10];
    }
	
	private void CheckBound() {
        int listSize = elements.length * 2;
        elements = Arrays.copyOf(elements, listSize);
    }
	
	public T get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        T t = (T)elements[i];
		return t;
    }
	
	public int size() {
        return size;
    }
	
	public void add(T e) {
        if (size == elements.length) {
            CheckBound();
        }
        elements[size] = e;
        size++;
       
    }
	
	 public T remove(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = elements[i];
	        int number = elements.length - (i + 1);
	        System.arraycopy(elements, i + 1, elements, i, number);
	        size--;
	        return (T)item;
	    }
	
	public void addAll(CustomList<T> list) {

        for (int i = 0; i < list.size; i++) {
            if (size == elements.length) {
                CheckBound();
            } else {
                elements[size++] = list.get(i);
            }

        }
    }
	
	public T[] removeAll(CustomList<T> list) {
        Object[] item = new Object[list.size + 1];
        int sizeOfList = 0;
        for (int i = 0; i < list.size; i++) {
            if (i >= size || i < 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
            }

            for (int j = 0; j < elements.length; j++) {
                if (elements[j] == list.get(i)) {
                    item[sizeOfList++] = list.get(i);
                    int number = elements.length - (j + 1);
                    System.arraycopy(elements, j + 1, elements, j, number);
                    size--;
                }
            }

        }
        return (T[]) item;
    }
	
	public T[] clear() {
        Object[] item = new Object[elements.length + 1];
        int sizeOfList=0;

            for (int j = 0; j < elements.length; j++) {
                
                    item[sizeOfList++] = elements[j];
                    int number = elements.length - (j + 1);
                    System.arraycopy(elements, j + 1, elements, j, number);
                    size--;
                }
            

        size=0;
        return (T[]) item;
        
    }
	
	@Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i = 0; i < size; i++) {
        	stringBuilder.append(elements[i].toString());
            if (i < size - 1) {
            	stringBuilder.append(",");
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

}
