import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class testFrozenfood1
{
    public static void main(String [] args) {
        LinkedList food1 = new LinkedList();
        Scanner scan = new Scanner(System.in);
        FrozenFood fz;
        String foodName;
        double amountCharge;
        
        for(int i=0;i<2;i++) {
            System.out.println("Please insert the food name: ");
            foodName = scan.next();
            System.out.println("Please insert the amount charge: ");
            amountCharge = scan.nextDouble();
            fz = new FrozenFood(foodName, amountCharge);
            food1.addFirst(fz);
        }
        
        System.out.println("Food Name\t Amount Charge \tGovernment Tax\n");
        ListIterator i = food1.listIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        
        double highest = 0.0;
        String str = "";
        ListIterator b = food1.listIterator();
        FrozenFood fs;
    
        for(int z=0; z<food1.size(); z++) {
            fs = (FrozenFood)b.next();
        if(highest < fs.calcGovTax()) {
            System.out.print("test");
            highest = fs.calcGovTax();
            str = fs.toString();
        }
    }
     System.out.println("Highest government charge is: \n" + highest);
      System.out.println("Food Name\t Amount Charge \tGovernment Tax\n" + str);
    
    }
    
    
}
