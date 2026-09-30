class inverseaza 

{private String input; 

private String output; 

public inverseaza(String in) 

{ input = in; } 

public String invers() 

{int stackSize = input.length(); 

Stiva OStiva = new Stiva(stackSize); 

for(int j=0; j<input.length(); j++) 

{char ch = input.charAt(j); 

OStiva.push(ch);} 

output = ""; 

while(!OStiva.StivaGoala()) 

{ char ch = OStiva.pop(); 

output = output + ch;} 

return output;} 

} 

 