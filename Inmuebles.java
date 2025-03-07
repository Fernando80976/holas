package ud7Ej5hoja2;

public class Inmuebles {
	//Este es mi cambio

	private  String direccion,estado;
	private int MCdros,año;
	private double precio;
	
	public Inmuebles(String direccion, String estado, int mCdros,int año,double precio) {
		this.direccion = direccion;
		this.estado = estado;
		MCdros = mCdros;
		this.precio=precio;
		this.año=año;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getMCdros() {
		return MCdros;
	}

	public void setMCdros(int mCdros) {
		MCdros = mCdros;
	}


	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		cambioPrecio(precio);
			this.precio=precio;
			
		 
	}
	public double cambioPrecio(double precio) {
	 if(getAño()<15) {
			precio= precio-precio*0.01;
		}else {
			precio= precio-precio*0.02;
		}
	 return precio;
 }
	@Override
	public String toString() {
		return "Inmuebles [direccion=" + direccion + ", estado=" + estado + ", MCdros=" + MCdros + ", año=" + año
				+ ", precio=" + precio + "]";
	}
	
	
}
