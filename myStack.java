import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class myStack<Object> {
	ArrayList<Object> list;
	int count;

	public myStack(){
		list = new ArrayList<Object>(); 
		count = 0;
	}

	public int size() {
        return count;
    }

    public void push(Object e){
    	list.add(e);
    	count++;
    }

    public Object peek(){
    	if(count == 0){
    		throw new NoSuchElementException("No Such Element");
    	}
    	Object e = list.get(count-1);
    	return e;
    }

    public Object pop(){
    	if(count == 0){
    		throw new NoSuchElementException();
    	}
    	Object e = list.get(count-1);
    	list.remove(count-1);
    	count--;
    	return e;
    }

    public boolean isEmpty(){
    	return (count == 0);
    }
}
