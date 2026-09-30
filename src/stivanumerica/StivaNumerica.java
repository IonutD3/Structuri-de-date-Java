import java.io.*; 

class Stiva 

{ private int maxSize; 

private double[]StivaSir; 

private int top; 

public Stiva(int s) 

{ maxSize = s; 

StivaSir = new double[maxSize]; 

top = -1; } 

public void push(double j) 

{ StivaSir[++top] = j; } 

public double pop() 

{ return StivaSir[top--]; } 

public double peek() 

{ return StivaSir[top];} 

public boolean StivaGoala() 

{ return (top == -1); } 

public boolean StivaPlina() 

{ return (top == maxSize-1);} 

public void afiseaza() { 

for(int j=0; j<maxSize; j++) 

System.out.print(StivaSir[j] + " "); 

System.out.println(""); } 

public void bubbleSort() { 

int out, in; 

for(out=maxSize-1; out>0; out--)  

for(in=0; in<out; in++) 

if( StivaSir[in] > StivaSir[in+1] )  

inverseazaPozitii(in, in+1); } 

private void inverseazaPozitii(int one, int two) { 

    double temp = StivaSir[one];  

    StivaSir[one] = StivaSir[two]; 

    StivaSir[two] = temp; } 

} 

 