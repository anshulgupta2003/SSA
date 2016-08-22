package mdaefsm;
import state.State;
public class Mda
{
    State c_state; //c_state is used to point to the current state object
    State[] ls = new State[8];   
    public void setStates(State a)
    {
    c_state = a;
    }
    
    public void setStatesList(State a1,State a2,State a3,State a4,State a5,State a6,State a7,State a8,State a9){
    	ls[0]=a1; //start state
        ls[1]=a2; //idle state
        ls[2]=a3; //check pin state
        ls[3]=a4; //ready state
        ls[4]=a5; //s1 state
        ls[5]=a6; //overdrawn state
        ls[6]=a7; //Locked state
        ls[7]=a8; //suspended state
        ls[8]=a9;// close state
}  
   public void open(){
	   
	   int current=c_state.getStateId();
	   switch(current){
	   case 0: 
   	{
   	  c_state.open();
   	  c_state = ls[1];
   	  break; 
   	}
	case 1: break; 
   	case 2: break; 
   	case 3: break;
   	case 4: break; 
   	case 5: break; 
   	case 6: break; 
   	case 7: break;
   	case 8:break;
   	case 9:break;
	   
	   }
	  
   }
 public void login(){
	   
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
   	case 1:  
   	{
   		c_state.login();
   		c_state=ls[2];
   	}
   	case 2: break;
   	case 3: break; 
   	case 4: break; 
   	case 5: break; 
   	case 6: break; 
   	case 7: break;
   	case 8:break;
   	case 9:break;
	   
	   }
	  
   }
 public void incorrectlogin(){
	 int current=c_state.getStateId();
   switch(current){
case 0: 
{
 	  c_state.incorrectlogin();
 	  c_state = ls[0];
 	  break; 
 	}
	case 1: break; 
	
	case 2: break; 
	case 3: break; 
	case 4: break; 
	case 5: break; 
	case 6: break; 
	case 7: break;
	case 8:break;
	case 9:break;
	}
 }
   public void incorrectpin(int max){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		
		case 2: break; 
		case 3:  
		{
		 	  c_state.incorrectpin(max);
		 	  c_state = ls[1];
		 	  break; 
		 	}
		case 4: break; 
		case 5: break; 
		case 6: break; 
		case 7: break;
		case 8:break;
		case 9:break;
		}
	 }
   
   public void correctpinbelowmin(){
	   
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		
		case 2: break; 
		case 3:  
		{
		 	  c_state.correctpinbelowmin();
		 	  c_state = ls[5];
		 	  break; 
		 	}
		case 4: break; 
		case 5: break; 
		case 6: break; 
		case 7: break;
		case 8:break;
		case 9:break;
		} 
   }
   public void correctpinabovemin(){
	   
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		
		case 2: break; 
		case 3:  
		{
		 	  c_state.correctpinabovemin();
		 	  c_state = ls[3];
		 	  break; 
		 	}
		case 4: break; 
		case 5: break; 
		case 6: break; 
		case 7: break;
		case 8:break;
		case 9:break;
		} 
   }
   public void deposit(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		
		case 2: break; 
		case 3: break; 
		
		case 4:  
		{
		 	  c_state.deposit();
		 	  c_state = ls[3];
		 	  break; 
		 	}
		case 5: break; 
		case 6:  
		{
		 	  c_state.deposit();
		 	  c_state = ls[4];
		 	  break; 
		 	}
		case 7: break;
		case 8:break;
		case 9:break;
		}  
   }
   public void belowminbalance(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: break; 
		case 5:  
		{
		 	  c_state.belowminbalance();
		 	  c_state = ls[5];
		 	  break; 
		 	}
		case 6: break; 
		case 7: break;
		case 8:break;
		case 9:break;
		}  
	   
   }
   public void aboveminbalance(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: break; 
		case 5:  
		{
		 	  c_state.aboveminbalance();
		 	  c_state = ls[3];
		 	  break; 
		 	}
		case 6: break; 
		case 7: break;
		case 8:break;
		case 9:break;
		}   
   }
   public void logout(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: 
		{
		 	  c_state.logout();
		 	  c_state = ls[1];
		 	  break; 
		 	}
		case 5: break; 
		case 6:  
		{
		 	  c_state.logout();
		 	  c_state = ls[1];
		 	  break; 
		 	}
		case 7: break;
		case 8:break;
		case 9:break;
		}    
   }
   public void balance(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: 
		{
		 	  c_state.balance();
		 	  c_state = ls[3];
		 	  break; 
		 	}
		case 5:  break;
		
		case 6:  
		{
		 	  c_state.balance();
		 	  c_state = ls[5];
		 	  break; 
		 	}
		case 7: break;
		case 8:
		{
		 	  c_state.balance();
		 	  c_state = ls[7];
		 	  break; 
		 	}
		case 9:break;
		}   
   }
   public void withdraw(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: 
		{
		 	  c_state.withdraw();
		 	  c_state = ls[4];
		 	  break; 
		 	}
		case 5: break; 
		case 6:  
		{
		 	  c_state.withdraw();
		 	  c_state = ls[5];
		 	  break; 
		 	}
		case 7: break;
		case 8:break;
		case 9:break;
		}   
   }
   public void withdrawbelowminbalance(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: break;
		case 5: 
		{
		 	  c_state.withdrawbelowminbalance();
		 	  c_state = ls[5];
		 	  break; 
		 	}
		case 6:  break;
		case 7: break;
		case 8:break;
		case 9:break;
		}   
   }
   public void nofunds(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: 
		{
		 	  c_state.nofunds();
		 	  c_state = ls[3];
		 	  break; 
		 	}
		case 5: break;
		case 6:  break;
		case 7: break;
		case 8:break;
		case 9:break;
		}   
   }
   public void lock(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break;
		
		case 4:  
		{
		 	  c_state.lock();
		 	  c_state = ls[6];
		 	  break; 
		 	}
		
		case 5: break;
		case 6:  
		{
		 	  c_state.lock();
		 	  c_state = ls[6];
		 	  break; 
		 	}
		case 7: break;
		case 8:break;
		case 9:break;
		}   
   }
   public void incorrectlock(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: break;
		
		case 5: break;
		case 6:  break;
		case 7: 
		{
		 	  c_state.incorrectlock();
		 	  c_state = ls[6];
		 	  break; 
		 	}
		case 8:break;
		case 9:break;
		}   
   }
   public void unlock(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: break;
		
		case 5: break;
		case 6:  break;
		case 7: 
		{
		 	  c_state.unlock();
		 	  c_state = ls[6];
		 	  break; 
		 	}
		case 8:break;
		case 9:break;
		}   
   }
   public void incorrectunlock(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: break;
		
		case 5: break;
		case 6:  break;
		case 7: 
		{
		 	  c_state.incorrectunlock();
		 	  c_state = ls[6];
		 	  break; 
		 	}
		case 8:break;
		case 9:break;
		}   
   }
   public void  suspend(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: 
		{
		 	  c_state.suspend();
		 	  c_state = ls[7];
		 	  break; 
		 	}
		
		case 5: break;
		case 6:  break;
		case 7: break;
		
		case 8:break;
		case 9:break;
		}   
   }
   public void activate(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: break;
		
		
		case 5: break;
		case 6:  break;
		case 7: break;
		
		case 8:
		{
		 	  c_state.activate();
		 	  c_state = ls[3];
		 	  break; 
		 	}
		case 9:break;
		}     
   }
   public void close(){
	   int current=c_state.getStateId();
	   switch(current){
	case 0: break;
	
		case 1: break; 
		case 2: break; 
		case 3: break; 
		case 4: break;
		
		
		case 5: break;
		case 6:  break;
		case 7: break;
		
		case 8:break;
		
		case 9:
		{
		 	  c_state.close();
		 	  c_state = ls[8];
		 	  break; 
		 	}
		} 
   }
 
   
  
}
