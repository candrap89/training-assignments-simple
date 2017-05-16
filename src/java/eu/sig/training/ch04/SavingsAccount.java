package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends Accounts {
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private Money balance = new Money();
    private CheckingAccount registeredCounterAccount;


        // 1. Assuming result is 9-digit bank account number, validate 11-test:

    	@Override
    	public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
    		Transfer result = super.makeTransfer(counterAccount, amount);
    		if (result.getCounterAccount().equals(this.registeredCounterAccount)) 
            {
                return result;
            } else {
                throw new BusinessException("Counter-account not registered!");
            }
    	
    	}
            
        


    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
// end::SavingsAccount[]
