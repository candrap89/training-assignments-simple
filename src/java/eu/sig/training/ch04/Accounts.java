package eu.sig.training.ch04;

public  class Accounts {
    @SuppressWarnings("unused")
    public static CheckingAccount findAcctByNumber(String number) {
        return new CheckingAccount();
    }

    public static boolean isValid(String number){
    	int sum = 0;
    	for (int i = 0; i< number.length();i++){
    		sum = sum +(9-i)* Character.getNumericValue(number.charAt(i));
    	}
    	return sum % 11 == 0;
    }
    
    public Transfer makeTransfer (String counterAccount, Money amount) throws BusinessException {
    
    int sum = 0;
    for (int i = 0; i < counterAccount.length(); i++) {
        char character = counterAccount.charAt(i);
        int characterValue = Character.getNumericValue(character);
        sum = sum + (9 - i) * characterValue;
    }

    if (sum % 11 == 0) {
        // 3. Look up counter account and make transfer object:
        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        Transfer result = new Transfer(this, acct, amount);
        return result;
    } else {
        throw new BusinessException("Invalid account number!");
    }
    }
    
    public void addInterest() {
    	
    }
    // end::isValid[]
}