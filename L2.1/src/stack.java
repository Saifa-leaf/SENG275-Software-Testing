// L4.2

public class stack<T> {
    T[] itemsArray;
    int top=0;
    public stack()
    {
        itemsArray=(T[])new Object[8];
    }
    public int size()
    {
        return top;
    }
    public void push(T item)
    {
        itemsArray[top]=item;
        top++;
    }

    public T pop()
    {
        T x=itemsArray[top-1];
        top--;
        return x;
    }



}



