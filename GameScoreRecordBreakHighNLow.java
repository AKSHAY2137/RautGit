import java.util.Scanner;

public class GameScoreRecordBreakHighNLow
{
	public static void main(String[] args) 
	{
		 Scanner s=new Scanner(System.in);
		 int b=s.nextInt();
	        int[] score=new int[b];
	        int[] hb=new int[b];
	        int[] lb=new int[b];
	        int m=0;int count=0;int count1=0;int n=0;
	        for(int i=0;i<b;i++)
	        {
	          
	                int k=s.nextInt();
	                score[i]=k;
	               	            
	        }
	        
	        for(int i=1;i<b;i++)
	        {
	        	if(i==1)
	        	{
	        		hb[0]=score[0];
	        		m=score[0];
	        	}
	           if(score[i]>hb[i-1])
	           {
	        	 m  =score[i];
	        	 count++;
	           }
	           hb[i]=m;
	               
	          }
	       
	        for(int i=1;i<b;i++)
	        {
	        	if(i==1)
	        	{
	        		lb[0]=score[0];
	        		 n  =score[0];
	        	}
	           if(score[i]<lb[i-1])
	           {
	        	  n  =score[i];
	        	 count1++;
	        	
	           }
	           lb[i]=n;
	           System.out.print(lb[i]+",");
	           
	         }
	        System.out.println();
	        System.out.println(count+" "+count1);
	        
}
}
