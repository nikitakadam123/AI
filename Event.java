import java.util.*;
class Event
{
void Home()
{

System.out.println(">>>>>===========================Welcome	To	Online	Event	Management System========================================<<<<<");
System.out.println("\nMade	By:\n\t32.Kadam	Nikita\n\t34.Karnjule	Kishori");

System.out.println("***********************************************************************************************");

System.out.println("\n****************************************Home**********************************************"); Scanner sc=new Scanner(System.in); System.out.println("Enter Agent Name:-");
String s=sc.next(); System.out.println("Enter Address:-"); String st=sc.next();
 
System.out.println("Enter Location:-"); String L=sc.next(); System.out.println("E-mail ID:-"); String E=sc.next();
}
Event() // default constructor

{


Home(); System.out.println("Events are:");
System.out.println("\n A)Hall Events: \n\t 1)Press Meeting \n\t2)Culturals \n\t 3)Book Publish \n\t 4)New Year Events \n\t5)Official Parties");
System.out.println("\n B)Family Events: \n\t 1)Marriage\n\t2)Reception \n\t3)Birthday Parties \n\t 4)Get together\n\t5)Surprise Event");
}
}
class UserRegistration extends Event
{

void Registration()
{

//	super.Registration();
 

System.out.println("**************************************************************************");
System.out.println("\n>>>>>>>>>>>>>>>>>>>>>**USER REGISTRATION**<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

System.out.println("\n***************************************************************************");
System.out.println("=================Log In=================");
Scanner scr=new Scanner(System.in); System.out.println("Enter First Name:"); String a=scr.next(); System.out.println("Enter Last Name:"); String b=scr.next(); System.out.println("Enter DOB"); Integer i=scr.nextInt(); System.out.println("Enter Address:"); String h=scr.next();
System.out.println("Enter contact number:"); Long i1=scr.nextLong(); System.out.println("Eneter City:");
String d=scr.next(); System.out.println("Enter Email-ID:");
 
String e=scr.next(); System.out.println("Enter Gender"); String k=scr.next(); System.out.println("Enter Pincode"); Integer i2=scr.nextInt();
}
}
class BookingEvent extends UserRegistration
{



void Booking()
{

System.out.println("************************************************************");

System.out.println(">>>>>===================BOOKING EVENT=================<<<<<");

System.out.println("*************************************************************");
Scanner r=new Scanner(System.in); System.out.println("Enter your name:"); String name=r.next();
 
System.out.println("Enter mobile number"); Long num=r.nextLong();
}

void Select()
{

Booking();
System.out.println("Please Enter your choice:"); Scanner scanIn=new Scanner(System.in);
int Events=scanIn.nextInt(); switch(Events)
{
case 1:


System.out.println("\n******************************************************************************");

System.out.println("\n>>===================================Hall Event================================");

System.out.println("\n********************************************************************************"); System.out.println("Select Hall Event:"); Scanner scan=new Scanner(System.in);
 
int subevents1=scan.nextInt(); switch(subevents1)
{

case 1:
System.out.println("1.Press Meeting"); break;
case 2:
System.out.println("2.Election Campaign events"); break;
case 3:
System.out.println("3.Book Publish"); break;
case 4:
System.out.println("4.New year events"); break;
case 5:
System.out.println("5.Official events"); break;
default:
System.out.println("Invalid choice!");
}

break;
 
case 2:

System.out.println("\n******************************************************************************");
System.out.println(">>>==================Family Event==================================<<<");

System.out.println("\n******************************************************************************"); System.out.println("Select Family event:"); Scanner scan1=new Scanner(System.in); int subevents2=scan1.nextInt(); switch(subevents2)
{

case 1: System.out.println("1.Marriage"); break;
case 2: System.out.println("2.Reception"); break;
case 3:
System.out.println("3.Birthday Parties"); break;
 
case 4:
System.out.println("4.Get together"); break;
case 5:
System.out.println("5.Surprise events"); break;
default:
System.out.println("Invalid choice!");

}
break; default:
System.out.println("Invalid choice!");
}



}
void equipments()
{
System.out.println("Equipments	for	events	are:	\n\t1.Stage	decoration	\n\t	2.sound	system	\n\t	3.food management \n\t 4.light system");
System.out.println("please	select	equipments	required for your event:");
System.out.println("\n\t1.Stage	Decoration	\n\t2.Sound System \n\t3.Light System \n\n\t These are common for all Events	");
System.out.println("Thank you for placing order	!");
}
}
class Final extends BookingEvent
{
public static void main(String args[])
{
Final f=new Final();



f.Registration(); f.Select(); f.equipments();
}
}
