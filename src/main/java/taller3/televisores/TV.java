package taller3.televisores;

class TV {
	Marca marca;
	int canal=1;
	int precio=500;
	boolean estado;
	int volumen=1;
	private static int numTV;
	private Control control;
	
	TV(Marca marca,boolean estado){
		this.marca = marca;
		this.estado=estado;
		setNumTV(getNumTV()+1);
	}
	public static void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	public int getNumTV() {
		return TV.numTV;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Marca getMarca() {
		return marca ;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}	
	public Control getControl() {
		return control;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		if(estado==true) {
			if(volumen>=0 && volumen<=7) {
				this.volumen = volumen;
			}
		}
	}
	
	public int getVolumen() {
		return volumen;
	}
	public void setCanal(int canal) {
		if(estado==true) {
			if(canal>=1 && canal<=120) {
				this.canal = canal;
			}
		}
	}
	public int getCanal() {
		return canal;
	}
	
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
		
	}
	public boolean getEstado() {
		return estado;
	}

	public void canalUp() {
		if (estado==true) {
			if (canal<120) {
				canal++;
			}
		}
		
	}
	public void canalDown() {
		if(estado==true) {
			if(canal>1) {
				canal--;
			}
		}
	}
	
	public void volumenUp(){
		if(estado==true) {
			if (volumen<7) {
				volumen++;
			}
		}
	}
	public void volumenDown() {
		if(estado==true) {
			if(volumen>0) {
				volumen--;
				
			}
		}
	}

	
	
}
