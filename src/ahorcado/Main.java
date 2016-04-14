package ahorcado;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		String aux = "";
		Scanner sc = new Scanner(System.in);
		Ahorcado ahorcado = new Ahorcado();
		do
		{
			System.out.print("Frase a adivinar: ");
			ahorcado.partidaNueva(sc.nextLine());
			while(!ahorcado.panelCompleto() && ahorcado.getNumeroFallos() != 6)
			{
				System.out.println(ahorcado.getPanel());
				System.out.print("Letra: ");
				ahorcado.ponerLetra(sc.nextLine().charAt(0));
				System.out.println("Quedan " + (6 - ahorcado.getNumeroFallos()) + " intentos.");
			}
			if(ahorcado.panelCompleto() == true)
				System.out.println("Has ganado.");
			else
				System.out.println("Has perdido.");
			System.out.println("Se han hecho " + ahorcado.getNumeroIntentos() + " intentos.");
			System.out.print("¿Seguir jugando?(s/n): ");
			aux = sc.nextLine();
		}
		while(aux.equals("s"));
		sc.close();
	}

}
