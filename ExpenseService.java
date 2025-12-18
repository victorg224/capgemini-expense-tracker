import java.util.*;

public class ExpenseService {

    //storing in memory using a list 
    private List<expense> expenses = new ArrayList<>();

    //adds new expense to list
    public void addExpense(String category, double amount, String date) {
        expenses.add(new expense(category, amount, date));
    }

    //calcualting total expense
    public double getTotalExpense() {
        return expenses.stream().mapToDouble(expense::getAmount).sum();
    }

    //spending per category
    public Map<String, Double> getTotalByCategory() {
        Map<String, Double> totals = new HashMap<>();
        for (expense e : expenses) {
            totals.put(
                e.getCategory(),
                totals.getOrDefault(e.getCategory(), 0.0) + e.getAmount());
        }
        return totals;
    }

    //return highest
    public String getHighestSpending() {
        return getTotalByCategory()
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("N/A");
    }

    //return lowest
    public String getLowestSpending() {
        return getTotalByCategory()
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("N/A");
    }

//calculates expense trend by date, treeMap sorts dates
public Map<String, Double> getExpenseTrend() {
    Map<String, Double> trend = new TreeMap<>(); // TreeMap sorts by date

    for (expense e : expenses) {
        trend.put(
          e.getDate(),
            trend.getOrDefault(e.getDate(), 0.0) + e.getAmount());
    }
    return trend;
}

public void resetExpenses() {
        expenses.clear();
}

}

