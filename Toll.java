import java.util.ArrayList;
import java.util.Scanner;

public class Toll {

	  public static void main(String[] args) 
	  {
		 Scanner s=new Scanner(System.in);
		ArrayList<Integer> coll=new ArrayList<Integer>();
		int[] price= {80,40};int sum=0;int j=0;
		System.out.println("                          RATE FOR VEHICAL");
		System.out.println("Vehical Name"+"\t\t\t"+"Price"+"\t\t\t"+"Select No.");
		System.out.println("========================================================================");
		System.out.println("Bus/Truck          "+"\t\t\t"+"80"+"\t\t\t"+"1");
		System.out.println("Car                "+"\t\t\t"+"40"+"\t\t\t"+"2");
		System.out.println("Total Day Collection"+"\t\t\t"+"--"+"\t\t\t"+"3");
		System.out.println("Bike/Scooter        "+"\t\t\t"+"FREE"+"\t\t\t"+"");
		System.out.println("========================================================================");
       
       do
        {
        System.out.println("Enter your choice");
        int a=s.nextInt();
    	
         switch(a)
        {
        case 1:
        	System.out.println("Have Return Pass press 1 otherwise press any number");
        	int reTurn=s.nextInt();
        	System.out.println("Vehical Name"+"\t\t\t"+"Price"+"\t\t\t"+"Return");
        	if(reTurn==1)
        	{
        		coll.add(price[a-1]*2);
        		System.out.println("Bus/Truck   "+"\t\t\t"+"80"+"\t\t\t"+"YES");
        	}
        	else
        	{
        		coll.add(price[a-1]);
        		System.out.println("Bus/Truck   "+"\t\t\t"+"80"+"\t\t\t"+"NO");
        	}
        	System.out.println("YOUR BILL:"+"\t\t\t"+coll.get(coll.size()-1));
        	System.out.println("========================================================================");
        	System.out.println("\t\t\t"+" THANK-YOU"+"\n"+"\t\t\t"+"-Visit again-");
        	break;
        case 2:
        	System.out.println("Have Return Pass press 1 otherwise press any number");
        	int ret1=s.nextInt();
        	System.out.println("Vehical Name"+"\t\t\t"+"Price"+"\t\t\t"+"Return");
        	if(ret1==1)
        	{
        		coll.add(price[a-1]*2);
        		System.out.println("Car   "+"\t\t\t"+"80"+"\t\t\t"+"YES");
        	}
        	else
        	{
        		coll.add(price[a-1]);
        		System.out.println("Car   "+"\t\t\t"+"80"+"\t\t\t"+"NO");
             }
        	System.out.println("YOUR BILL:"+"\t\t\t"+coll.get(coll.size()-1));
        	System.out.println("========================================================================");
        	System.out.println("\t\t\t"+" THANK-YOU"+"\n"+"\t\t\t"+"-Visit again-");
        	
        	break;
        case 3:
        	for(int i=0;i<coll.size();i++)
        	{
        		sum=sum+coll.get(i);
        	}
        	System.out.println("Total Collection is:"+sum);
        	System.out.println("========================================================================");
        	break;
        	default:
        		System.out.println("Enter valid input");
	       }
         j++;
        }
       while(j<1000);

}
}
