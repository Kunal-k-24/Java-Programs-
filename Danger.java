import java.io.*;
import java.util.Scanner;
interface Gaadi {
void suru();
}// end of interface "Gaadi"

class Aniket implements Gaadi{
public static int a ;
public void suru(){
	Scanner ns= new Scanner(System.in);
System.out.println("Give Number: ");
a = ns.nextInt();
}
}
class Ashish extends Aniket{
public static int aB;
public static int add;
public void suru(){
Scanner ns= new Scanner(System.in);;
System.out.println("Give Second Number: ");
aB = ns.nextInt();	
add = a+aB;
}
}
class Danger extends Ashish{
public static void main(String args[]){
Scanner ns = new Scanner(System.in);
Gaadi jcb = new Aniket();
Gaadi kbc = new Ashish();
jcb.suru();
kbc.suru();
System.out.println("Addition is : "+ add);
while(true){
System.out.println("");
System.out.println("Tell What Operations You Want To Perform With The Base Number: ");
System.out.println("1 - Subtraction");
System.out.println("2 - Multiplication");
System.out.println("3 - Division");
System.out.println("4 - Exit");
int ch1 = ns.nextInt();
switch(ch1){

case 1 : int sub = a-aB;
	System.out.println("Subtraction is : "+sub);
	break;
case 2 : int mul = a*aB;
	System.out.println("Mul is : "+mul);
	break;
case 3 : double div = a/aB;
	System.out.println("Div is : "+div);
	break;
case 4 : System.exit(0);

}// end of Switch-Case.
}// end of loop
}// end of main f/n
}//end of main class