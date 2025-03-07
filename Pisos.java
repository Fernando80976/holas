package ud7Ej5hoja2;

public class Pisos extends Inmuebles{
	private String NumPiso;
public Pisos(String numPiso,String direccion, String estado, int mCdros,int año,double precio) {
		super(direccion,estado,mCdros,año,precio);
		NumPiso = numPiso;
	}
public String getNumPiso() {
	return NumPiso;
}
public void setNumPiso(String numPiso) {
	NumPiso = numPiso;
}
@Override
public String toString() {
	return super.toString()+"Pisos [NumPiso=" + NumPiso + "]";
}




}
