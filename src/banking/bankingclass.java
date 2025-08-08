
package banking;


public class bankingclass {
    int accountNo;
    float initialBalance;
    int pin;
    
    public bankingclass() {
        this.initialBalance = 0.0f; 
    }
    
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
    
    public boolean verifyAccount(int acc, int pn){
        return acc == this.accountNo && pn == this.pin;
    }
}

    

