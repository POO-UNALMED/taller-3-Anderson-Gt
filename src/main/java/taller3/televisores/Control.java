package taller3.televisores;

public class Control {
	TV tv;
	public Control(){		
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff(){
		tv.turnOff(); 		
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	public void enlazar(TV tv) {
		setTv(tv);
		tv.setControl(this);
	}
	public void setTv(TV tv) {
		this.tv=tv;
	}
	public TV getTv() {
		return this.tv;
	}
}





