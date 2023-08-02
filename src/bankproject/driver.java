package bankproject;
import java.util.*;
public class driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select bank from given below");
		System.out.println("select 1 for icici,     2==sbi  3===hdfc");
		int x=sc.nextInt();
		switch(x)
		{
		case 1: System.out.println("you select icici bank");
		        bank b1=new icici();
		        System.out.println("your rate is="+b1.rOI()+"%");
		        break;
		case 2: System.out.println("you select sbi bank");
                bank b2=new sbi();
                System.out.println("your rate is="+b2.rOI()+"%");
                break;
		case 3: System.out.println("you select hdfc bank");
                bank b3=new hdfc();
                System.out.println("your rate is="+b3.rOI()+"%");
                break;
        default:
        	    System.out.println("please select valid bank");
		
		}
	}

}
