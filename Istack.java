package core;

public interface Istack {
	boolean isEmpty();
	int getsize();
	void push (Object elm);
	Object top();
	boolean isFull();
	
}
