import java.util.Scanner;
class Array{

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int marks[]= new int[100];

System.out.println("PLease Enter your Physics Marks");
marks[0]=sc.nextInt();
System.out.println("PLease ENter your Chemistry marks");
marks[1]=sc.nextInt();
System.out.println("PLese Enter Your Maths MArks");
marks[2]=sc.nextInt();

System.out.println("Physics :   "+marks[0]);
System.out.println("Chemistry  :"+marks[1]);
System.out.println("PF         :"+marks[2]);
  
System.out.println("Enter YOur age");
int a;
a=sc.nextInt();
System.out.println("Your age is"+a);


System.out.println(marks.length);



    }

}