package datastore;

public class Data1 extends Data {
	
	static String temp_p;
	static String temp_y;
	static float temp_a;
	static float temp_d;
	static float temp_w;
	
	
	public void setStringp(String p){
		temp_p=p;
	}
	public String getStringp(){
		return temp_p;
	}
	public void setStringy(String y){
		temp_y=y;
	}
	public String getStringy(){
		return temp_y;
	}
	
	public void setfloata(float a){
		temp_a=a;
	}
	public float getfloata(){
		return temp_a;
	}
	public void setDeposit(float d){
		temp_d=d;
	}
	public float getDeposit(){
		return temp_d;
	}
	public void setWithdraw(float w){
		temp_w=w;
	}
	public float getWithdraw(){
		return temp_w;
	}
	

}
