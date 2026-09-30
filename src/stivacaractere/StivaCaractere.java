import java.io.*; 

class Stiva 

{ private int maxSize; 

private char[] StivaSir; 

private int top; 

public Stiva(int max) 

{maxSize = max; 

StivaSir = new char[maxSize]; 

top = -1;} 

public void push(char j) 

{ StivaSir[++top] = j;} 

public char pop() 

{ return StivaSir[top--];} 

public char peek() 

{return StivaSir[top];} 

public boolean StivaGoala() 

{return (top == -1);} 

} 

