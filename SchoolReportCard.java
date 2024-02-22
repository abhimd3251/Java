import java.util.Scanner;

class SchoolReportCard 
{
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
   System.out.println("enter the mark");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   int e=sc.nextInt();
   int f=sc.nextInt();

   int marks_obtained =+a+b+c+e+f;

   int total_marks=500;

  double per=(marks_obtained*100)/total_marks;

  char grade=(per<=100&&per>85)?('A'):(per<=85&&per>65)?('B'):(per<=65&&per>45)?('C'):((per<=45&&per>35)?('E'):('F'));

  String remark=(grade== 'A')?("Very good"):(grade== 'B')?("good"):(grade== 'C')?("need to improve"):(grade== 'E')?("work hard"):("Fail");

System.out.println(per);
System.out.println(grade);
System.out.println(remark);

System.out.println("--------------------------------------------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("                                         Qspider school");
System.out.println("");
System.out.println("                                         Deccan univercity");
System.out.println("");
System.out.println("Student name: Abhishek Dulange                                                                 Date:24/02/2024");
System.out.println("");
System.out.println("Roll num:3251                                  Sem:A                                             Exam:sem");

System.out.println("*****************************************************************************************************************");

System.out.println("Subject                                         Total Mark                                         marks Obtained");
System.out.println("-----------------------------------------------------------------------------------------------------------------");
System.out.println("Maths                                           100                                                +a");
System.out.println("-----------------------------------------------------------------------------------------------------------------");
System.out.println("Account                                         100                                                +b");
System.out.println("-----------------------------------------------------------------------------------------------------------------");
System.out.println("Economic                                        100                                                +c");
System.out.println("-----------------------------------------------------------------------------------------------------------------");
System.out.println("HTML                                            100                                                +e");
System.out.println("-----------------------------------------------------------------------------------------------------------------");
System.out.println("Java                                            100                                                +f");
System.out.println("-----------------------------------------------------------------------------------------------------------------");


System.out.println();
System.out.println("Total                                            500                                              "+marks_obtained);
System.out.println();

System.out.println("-----------------------------------------------------------------------------------------------------------------");
System.out.println("per:"+per+"                                                                                         Grade :"+grade);
System.out.println("-----------------------------------------------------------------------------------------------------------------");
System.out.println("remark:"+remark+"                                                                                   Sign"         );
System.out.println("-----------------------------------------------------------------------------------------------------------------");


}
}
