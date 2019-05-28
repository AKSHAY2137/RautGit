import java.io.IOException;
import java.util.*;
public class ChildStringCount {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException
	     {
	           int count=0;
	        String s1 ="FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC";

	        String s2 =
	        		"WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS";

	      char[] c=s1.toCharArray();
	      char[] c1=s2.toCharArray();
	      for(int i=0;i<c.length;i++)
	      {
	          for(int j=0;j<c1.length;j++)
	          {
	              if(c[i]==c1[j])
	              {
	            	  System.out.print(c[i]+""+c1[j]);
	                  count++;
	                  c[j]='#';
	                  break;
	              }
	          }
	      }
	      System.out.println(count);
	    }
	}

