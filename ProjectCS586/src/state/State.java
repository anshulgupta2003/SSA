package state;



public class State {
	int StateId;
	public int getStateId()
    {
        return StateId;
    }
    
    public void setStateId(int a)
    {
        StateId = a;
    }
    public void open(){}
    public void login(){}
    public void incorrectlogin(){}
    public void incorrectpin(int max){}
    public void correctpinbelowmin(){}
    public void correctpinabovemin(){}
    public void deposit(){}
    public void belowminbalance(){}
    public void aboveminbalance(){}
    public void logout(){}
    public void balance(){}
    public void withdraw(){}
    public void withdrawbelowminbalance(){}
    public void nofunds(){}
    public void lock(){}
    public void incorrectlock(){}
    public void unlock(){}
    public void incorrectunlock(){}
    public void  suspend(){}
    public void activate(){}
    public void close(){}
    
}
