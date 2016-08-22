package abstractfactory;

import strategy.DisplayBalance;
import strategy.DisplayMenu;
import strategy.IncorrectIdMsg;
import strategy.IncorrectLockMsg;
import strategy.IncorrectPinMsg;
import strategy.IncorrectUnlockMsg;
import strategy.MakeDeposit;
import strategy.MakeWithdraw;
import strategy.Penalty;
import strategy.PromptForPin;
import strategy.StoreData;
import strategy.TooManyAttemptsMsg;

public abstract class AbstractFactory {

	public abstract DisplayBalance getDisplayBalance();
	public abstract DisplayMenu getDisplayMenu();
	public abstract  IncorrectIdMsg getIncorrectIdMsg();
	public abstract  IncorrectLockMsg geIncorrectLockMsg();
	public abstract  IncorrectPinMsg getIncorrectPinMss();
	public abstract  IncorrectLockMsg getIncorrectLockMsg();
	public abstract  IncorrectUnlockMsg getIncorrectUnlockMsg();
	public abstract  MakeDeposit getMakeDeposit();
	public abstract  MakeWithdraw getMakeWithdraw();
	public abstract  Penalty getPenalty();
	public abstract  PromptForPin getPromptForPin();
	public abstract  StoreData getStoreData();
	public abstract  TooManyAttemptsMsg getTooManyAttemptsMsg();
	
}