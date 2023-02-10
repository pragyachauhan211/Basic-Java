package basicProgram;

public class Practice1 
{	
  String s;
  
public void cube()
{
	int counter=0;
	String s = "sffsfsgf ";
	s = s.toLowerCase();
    s = s.replaceAll(" ", "");
    
	while(s.length()>0)
	{
	for(int i = 0; i<s.length();i++)
	{
	 if(s.charAt(0)==s.charAt(i))
	 {
		 counter++;		 
	 }
	}
	
	
	System.out.println("--------");
	
	char ch2 = s.charAt(0);
	String s23 = Character.toString(ch2);

	
	s = s.replaceAll(s23, "");
	counter = 0;
	}

}
		
public static void main(String[] args) 
	{
	Practice1 c = new Practice1();
	c.cube();
	}

}
