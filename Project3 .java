//Smart Gym
import java.util.*;
class Methods
{	Scanner sc=new Scanner(System.in);
	String cname;
	int cage=0,cid=0,id;
	//method to display gym details
	void display()
	{
		System.out.println("       DISPLAYING ENERGY ZONE DETAILS");
		System.out.println("       ******************************");
		System.out.println("         ________ENERGY ZONE________");
		System.out.println("         ____Contact:7207070905_____");
		System.out.println("         ____energyzone@gmail.com___");
		System.out.println("         _____PALAMANER,CHITTOOR____");
		System.out.println("         __________517408___________\n\n");
	}
	//method to display tools
	void tdisplay()
	{
	   	System.out.println("       DISPLAYING ENERGY ZONE TOOLS");
		System.out.println("       ******************************"); 
		System.out.println("Barbells\nDumbbells\nE-Z Bar\nBench press\nLeg press Machine\nPull up bar\nArm Curl Machine\nAb Roller\nTreadmill\nVertical Climber");
	}
	//method to register 
	void joinGym()
	{
	    System.out.println("PLEASE ENTER YOUR DETAILS");
    	System.out.println("**************************");
	    System.out.println("Enter your name:");
	    cname=sc.next();
        System.out.println("Enter your age:");
	    cage=sc.nextInt();
		if(cage<10)
		{
			System.out.println("SORRY!!!!!Our gym doesnot provide tools for your age");
		}
		else if(cage>=10&&cage<=25)
		{
			System.out.println("Provide a id:");
			cid=sc.nextInt();
			System.out.println("\nYour registration is successful..!!! and Your id no is:"+cid);
			System.out.println("Kindly go to 2nd floor\n");
		}
		else
		{
			System.out.println("Provide a id:");
			cid=sc.nextInt();
			System.out.println("\nYour registration is successful..!!! and Your id no is:"+cid);
			System.out.println("Kindly go to 1st floor\n");
		}
		
	}
	//method to workt
	void work()
	{
        System.out.println("Enter your ID");
	    id=sc.nextInt();
	    if(id==cid)
    	{
            System.out.println("Enter Your Purpose:\n(i.e.,for weightloss(enter-->wl)&for weightgain(enter-->wg)");
    	    String purpose=sc.next();
	        if(purpose.equals("wg"))
	        {  
	            if(cage<=25)
	          {
                System.out.println("🏋🏻FOR YOUR FITNESS WE TRAIN YOU THE FOLLOWING EVERYDAY🏋🏻");
                System.out.println("****************************************************");
                System.out.println("15 x Squats");
                System.out.println("15 x Push Ups");
                System.out.println("15 x Walking lunges");
                System.out.println("15 x Tricep Dips");
                System.out.println("15 x Pull-ups");
                System.out.println(" ");
                System.out.println("It hurts now🥵, but one day it’ll be your warm up💪");
                System.out.println();
	          }
	          else
	          {
	        	 System.out.println("🏋🏻FOR YOUR FITNESS WE TRAIN YOU THE FOLLOWING EVERYDAY🏋🏻");
                System.out.println("****************************************************");
	        	System.out.println("25 x Pullups");
                System.out.println("25 x Squats");
                System.out.println("25 x Lunges");
                System.out.println("25 x Bench press ");
                System.out.println("25 x Overhead press");
                System.out.println(" ");
                System.out.println("It hurts now🥵,but one day it’ll be your warm up💪");
                System.out.println();
	          }
	       }
	       else if(purpose.equals("wl"))
	       { 
	             if(cage<=25)
	             {
	                 System.out.println("🏋🏻FOR YOUR FITNESS WE TRAIN YOU THE FOLLOWING EVERYDAY🏋🏻");
                     System.out.println("****************************************************");
                     System.out.println("10 x Hand walk");
                     System.out.println("10 x Forward Lungs/each side ");
                     System.out.println("15 x Jumping jacks");
                     System.out.println("15 x Leg lifts");
                     System.out.println("15 x Cross Body Climbers/each side");
                     System.out.println(" ");
                     System.out.println("It hurts now🥵,but one day it’ll be your warm up💪");
                     System.out.println();
                 }
                 else
                 {
                     System.out.println("🏋🏻FOR YOUR FITNESS WE TRAIN YOU THE FOLLOWING EVERYDAY🏋🏻");
                     System.out.println("****************************************************");
                     System.out.println("20 x Dumbell romanian deadlift");
                     System.out.println("20 x Jump rope");
                     System.out.println("20 x Dumbbel pull complex");
                     System.out.println("20 x Goblet Squat");
                     System.out.println("20 x Plank");
                     System.out.println(" ");
                     System.out.println("It hurts now🥵, but one day it’ll be your warm up💪");
                     System.out.println();
        
                  }
	       }
	       else
    	   {
	        System.out.println("SORRY.......WE ARE NOT PROVIDING SUCH THINGS HERE");
           }
	  }
	  else
      {
		System.out.println("Your ID is INVLID!!!..Please confirm your registration in ground floor");
      }
    }
}

//main method
public class Project3 
{
	public static void main(String[] args)
	{   
	    Scanner sc2=new Scanner(System.in);
	    Methods m=new Methods();
	    int cid=0,cage,ch;
		do{
		    System.out.println("                              💪🏻ENERGY ZONE💪🏻");
		    System.out.println("                              -----------------");
		    System.out.println("              _______Good things come to those who sweat_______\n");
		    System.out.println("*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		    System.out.println("\n1.Display Details\n2.Display tools\n3.Registration\n4.Go and Workout\n5.Way out");
		    System.out.println("\nEnter your choice:");
		    ch=sc2.nextInt();
	    	switch(ch)
	    	{
		        case 1:
		            m.display();
		            break;
		        case 2:
		            m.tdisplay();
		            break;
		        case 3:
	                m.joinGym();
	                break;
	            case 4:
	                m.work();
	                break;
	           case 5:
	               System.out.println("TAKE REST😴");
	               break;
		     }
		}while(ch!=5);
	}
}
