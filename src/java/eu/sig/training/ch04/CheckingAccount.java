package eu.sig.training.ch04;

// tag::CheckingAccount[]
public class CheckingAccount extends Accounts {
    private static final float INTEREST_PERCENTAGE = 0.01f;
    private Money2 balance = new Money2();
    private int transferLimit = 100;

    public Transfer makeTransfer(String counterAccount, Money2 amount)
        throws BusinessException2 {
        // 1. Check withdrawal limit:
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException2("Limit exceeded!");
        }
      return super.makeTransfer(counterAccount, amount);
    }

    public void addInterest() {
        Money2 interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
// end::CheckingAccount[]
