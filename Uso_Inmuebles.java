package ud7Ej5hoja2;

public class Uso_Inmuebles {
    //main de la clase
    // Cambio 2
	public static void main(String[] args) {
		
		Inmuebles [] inmuebles=new Inmuebles[5];
		Pisos pisos=new Pisos ("8iz","CalleSanta","Nuevo",24,10,2000);
		inmuebles[0]=pisos;
	System.out.println(inmuebles[0]);
	}
    
}
