package inputpro;

import datastore.Data;
import mdaefsm.Mda;

public class IP1 {

	Mda mda_o;
	Data d_o;

	public void setMDA(Mda x) {
		mda_o = x;
	}

	public void setdata(Data x) {
		d_o = x;
	}

	public void open(String p, String y, float a) {

		d_o.setStringp(p);
		d_o.setStringy(y);
		d_o.setfloata(a);
		mda_o.open();
	}

	public void pin(String x) {

		if (x == d_o.getStringp()) {
			if (d_o.getfloata() > 500) {
				mda_o.correctpinabovemin();
			} else {
				mda_o.correctpinbelowmin();
			}
		} else {
			mda_o.incorrectpin(3);
		}
	}

	public void deposit(float d) {
		d_o.setDeposit(d);
		mda_o.deposit();
		if(d_o.getDeposit()>500){
			mda_o.aboveminbalance();
		}else{
			mda_o.belowminbalance();
		}
	}

	public void withdraw(float w) {
		d_o.setWithdraw(w);
		mda_o.withdraw();
		if(d_o.getWithdraw() > 500){
			mda_o.aboveminbalance();
		}else{
			mda_o.withdrawbelowminbalance();
	}}

	public void balance() {
		mda_o.balance();
	}

	public void login(String y) {
		if(y==d_o.getStringy()){
			mda_o.login();
		}else{
			mda_o.incorrectlogin();
		}
	}

	public void logout() {
		mda_o.logout();
	}

	public void lock(String x) {
		if(d_o.getStringp()==x){
			mda_o.lock();
		}
		else{
			mda_o.incorrectlock();
		}
	}

	public void unlock(String x) {
		if(x==d_o.getStringp()){
			mda_o.unlock();
			if(d_o.getfloata()>500){
				
				mda_o.aboveminbalance();
				
			}
			else{
				mda_o.belowminbalance();
			}
		}
		else{
			mda_o.incorrectunlock();
		}
	}

}
