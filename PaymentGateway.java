import java.util.*;
class PaymentGateway{

    public static void main(String[] args){

       System.out.println("Select the Bank ");
        System.out.println("1.SBI   2.AXIS   3.HDFC");
        System.out.println("Enter your choice: ");
        Scanner sc =new Scanner(System.in);
        int choice =sc.nextInt();
        switch(choice){
            case 1:
                Sbi sbi=new Sbi();
                sbi.displayData();
                break;
            case 2:
                Axis axis=new Axis();
                axis.displayData();
                break;
            case 3:
                Hdfc hdfc=new Hdfc();
                Hdfc.displayData();
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");

        }

    }

}

