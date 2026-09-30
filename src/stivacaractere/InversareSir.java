import java.io.*; 

class InversareChar 

{ public static void main(String[] args) throws IOException 

{ String input, output; 

while(true) 

{ System.out.println(""); 

System.out.print("Introduceti sirul de caractere: "); 

System.out.flush(); 

input = getString(); 

if(input.equals("")) 

break; 

System.out.println("Sirul " + " ' "+input+ " ' "+" are " +input.length()+ " caractere "); 

inverseaza theReverser = new inverseaza(input); 

output = theReverser.invers(); 

System.out.println("Sirul inversat are forma: " + output); } 

} 

public static String getString() throws IOException 

{InputStreamReader isr=new 

InputStreamReader(System.in); 

BufferedReader br = new BufferedReader(isr); 

String s = br.readLine(); 

return s;} 

} 
