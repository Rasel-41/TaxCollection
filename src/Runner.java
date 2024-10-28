import q1.TaxCollection;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your income: ");
        double income = in.nextDouble();
        System.out.print("Are you married? (Y/N) ");
             String input = in.next();
        int status;
        if (input.equals("Y"))
                  {
                      status = TaxCollection.MARRIED;}
         else
              {
                  status = TaxCollection.SINGLE;
                  }
             TaxCollection taxCollection = new TaxCollection(income,status);
         System.out.println("Tax: "
                           + taxCollection.getTax());
           }
  }







