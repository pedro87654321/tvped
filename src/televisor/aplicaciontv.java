package televisor;
import java.util.Scanner;
public class aplicaciontv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		clasetv tv1 = new clasetv ();
		int encendido;
		System.out.println("ingrese la marca del televisor ");
		tv1.setMarca(ler.nextLine());
		System.out.println("ingrese tamaño del televisosr");
		tv1.setTamaño(ler.nextInt());
		System.out.println("(1)encendido, (2)apagado");
		encendido=ler.nextInt();
		if(encendido==1)
		{
		tv1.setEncendido(true);
		}
		else if(encendido==2)
		{
		tv1.setEncendido(false);
		}
        System.out.println("eliga entradas"+"\n (HDMI)"+"\n (AV)"+"\n (TV)");
        tv1.setEntradas(ler.nextLine());
        
		
	}

}
