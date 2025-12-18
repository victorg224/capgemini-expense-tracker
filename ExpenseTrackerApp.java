import java.util.Scanner;

public class ExpenseTrackerApp {

    public static void main(String[] args) {
        
        //creates service 
        ExpenseService service = new ExpenseService();

          Scanner scanner = new Scanner(System.in);

        //user prompt
        System.out.print("How many expenses would you like to enter? ");

            int count = scanner.nextInt();
             scanner.nextLine();

        //loops to collect user input
        for (int i = 0; i < count; i++) {
            System.out.println("Expense " + (i + 1));

            System.out.print("Category: ");
            String category = scanner.nextLine();

            System.out.print("Amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Date MM-DD-YY: ");
            String date = scanner.nextLine();

            //add to service 
            service.addExpense(category, amount, date);
        }

        System.out.println("Expense Summary ");
        System.out.println("Total Expense: $" + service.getTotalExpense());

        System.out.println("Total by Category:");
        service.getTotalByCategory().forEach( (c, total) -> System.out.println(c + ": $" + total));

        System.out.println("Highest Spending Category: " + service.getHighestSpending());

        System.out.println("Lowest Spending Category: " + service.getLowestSpending());

        System.out.println("Expense Trend by date:");
        service.getExpenseTrend().forEach((date, total) -> System.out.println(date + "$" + total));
    
    }
}





