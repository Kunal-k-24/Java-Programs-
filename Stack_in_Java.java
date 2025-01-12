import java.util.Scanner;
public class Stack_in_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ar = new int[9];
        int top = -1;
        System.out.println("");
        System.out.println("       # Stack #        ");
        while(true){
            System.out.println("");
            System.out.println("Select any Operation....");
            System.out.println("1 - PUSH Operation ");
            System.out.println("2 - POP Operation ");
            System.out.println("3 - Display Operation ");
            System.out.println("4 - Exit");
            System.out.println("Provide Your Choice: ");
            int ch1=sc.nextInt();
        switch (ch1){
            case 1 :
                if (top == 9){
                    System.out.println("Stack Overflow !");
                }
                else {
                    System.out.println("Enter The Number You Want to Push ");
                    int num1=sc.nextInt();
                    ar[top+1]=num1;
                    top++;
                    System.out.println("Element Pushed Into The Stack.");
                }
                break;
            case 2 :
                int len = ar.length;
                if ( top == -1){
                    System.out.println("Stack Underflow! ,do the PUSH Operation ");

                }
                else{
                    System.out.println("Top Element "+ ar[top] +" Popped Out...");
                    top--;
                }
                break;
            case 3 :
                if ( top == -1){
                System.out.println("Stack is Empty Nothing to Display ! ");

            }
                else {
                for(int i=top;i>=0;i--){
                    System.out.println(ar[i]);
                }}
                break;
            case 4 :
                System.exit(0);
            default:
                System.out.println("Invalid Input Give Valid One....");
        }
        }
    }
}
