import java.util.Scanner;
public class Queue_In_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ar = new int[9];
        int front = 0;
        int rear = -1;
        System.out.println("");
        System.out.println("       # Queue #        ");
        while(true){
            System.out.println("");
            System.out.println("Select any Operation....");
            System.out.println("1 - ENQUEUE Operation ");
            System.out.println("2 - DEQUEUE Operation ");
            System.out.println("3 - Display Operation ");
            System.out.println("4 - Exit");
            System.out.println("Provide Your Choice: ");
            int ch1=sc.nextInt();
            switch (ch1){
                case 1 :
                    if (rear == 9){
                        System.out.println("QUEUE Overflow !");
                    }
                    else {
                        System.out.println("Enter The Number You Want to ENQUEUE ");
                        int num1=sc.nextInt();
                        ar[rear+1]=num1;
                        rear++;
                        System.out.println("Element ENQUEUED Into The Queue.");
                    }
                    break;
                case 2 :
                    int len = ar.length;
                    if (front>rear){
                        System.out.println("Queue Underflow! ,do the PUSH Operation ");

                    }
                    else{
                        System.out.println("Element "+ ar[front] +" DEQUEUED...");
                        front++;
                    }
                    break;
                case 3 :
                    if ( front>rear){
                        System.out.println("Queue is Empty Nothing to Display ! ");

                    }
                    else {
                        for(int i=rear;i>=front;i--){
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

