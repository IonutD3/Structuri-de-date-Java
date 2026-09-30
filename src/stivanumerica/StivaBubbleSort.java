public class StivaApp 

{ public static void main(String[] args) 

{ Stiva OStiva = new Stiva(9); 

OStiva.push(20); 

OStiva.push(40); 

OStiva.push(60); 

OStiva.push(80); 

OStiva.push(10); 

OStiva.push(30); 

OStiva.push(50); 

OStiva.push(70); 

OStiva.push(90); 

double val = OStiva.peek(); 

while( !OStiva.StivaGoala ()) 

{ double value = OStiva.pop(); 

System.out.print(value); 

System.out.print(" ");} 

System.out.println(""); 

OStiva.bubbleSort(); 

System.out.println("Sirul ordonat cu BubbleSort este: "); 

OStiva.afiseaza(); 

if(OStiva.StivaPlina())  

    System.out.println("Stiva este plina"); 

else  

    System.out.println("Mai este loc in stiva"); 

System.out.println("Varf " + val );  

System.out.println("");} 

}
