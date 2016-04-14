package ahorcado;

public class Ahorcado implements IAhorcado
{

	private String fraseAAdivinar;
	private int contIntentos;
	private int contFallos;
	private boolean[] letrasAcertadas;

	@Override
	public void partidaNueva(String fraseAAdivinar)
	{
		this.fraseAAdivinar = fraseAAdivinar;
		letrasAcertadas = new boolean[fraseAAdivinar.length()];
		contIntentos = 0;
		contFallos = 0;
	}

	@Override
	public int getNumeroIntentos()
	{
		return contIntentos;
	}

	@Override
	public boolean ponerLetra(char letra)
	{
		contIntentos++;
		boolean acierto = false;
		for (int i = 0; i < fraseAAdivinar.length(); i++)
		{
			if(fraseAAdivinar.charAt(i) == letra && letrasAcertadas[i] == false)
			{
				letrasAcertadas[i] = true;
				acierto = true;
			}
		}
		if(acierto == true)
			return true;
		contFallos++;
		return false;
	}

	@Override
	public int getNumeroFallos()
	{
		return contFallos;
	}

	@Override
	public boolean panelCompleto()
	{
		for (int i = 0; i < letrasAcertadas.length; i++)
		{
			if(letrasAcertadas[i] == false && fraseAAdivinar.charAt(i) != ' ')
				return false;
		}
		return true;
	}

	@Override
	public String getPanel()
	{
		StringBuilder aux = new StringBuilder();
		for (int i = 0; i < letrasAcertadas.length; i++)
		{
			if(letrasAcertadas[i] == true)
				aux.append(fraseAAdivinar.charAt(i));
			else if(letrasAcertadas[i] == false && fraseAAdivinar.charAt(i) != ' ')
				aux.append("-");
			else
				aux.append(" ");
		}
		return aux.toString().toUpperCase();
	}

}
