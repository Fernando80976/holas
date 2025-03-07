package ud7Ej5hoja2;

public class Locales extends Inmuebles {


private int Numventanas;

public Locales(int numventanas,String direccion, String estado, int mCdros,int año,double precio) {
		super( direccion,  estado,  mCdros, año, precio);
		Numventanas = numventanas;
	}

public int getNumventanas() {
	return Numventanas;
}

public void setNumventanas(int numventanas) {
	Numventanas = numventanas;
}

@Override
public String toString() {
	return super.toString()+"Locales [Numventanas=" + Numventanas + "]";
}


}
