package ahorcado;

public interface IAhorcado
{
	/**
	*	Comienza una partida
	*	@param fraseAAdivinar Es la frase que hay que adivinar.
	 */
	public void partidaNueva(String fraseAAdivinar);
	/**
	*	@return N�mero de intentos que se han realizado en la partida.
	 */
	public int getNumeroIntentos();
	/**
	*	Intento de letra para completar el panel.
	*	@param letra
	*	@return true si se ha acertado alguna, false si la letra no est� presente 
	*	o ya se ha puesto.
	 */
	public boolean ponerLetra(char letra);
	/**
	*	@return N�mero de letras que se han fallado. Las repetidas cuentan como fallos.
	 */
	public int getNumeroFallos();
	/**
	*	Para saber si se ha completado el panel.
	*	@return true si se ha completado, false en caso contrario
	 */
	public boolean panelCompleto();
	/**
	*	@return Una cadena con el panel, donde todas las letras ser�n pasadas a may�sculas.  * Las letras acertadas aparecer�n y los espacios en blanco tambi�n. Las letras sin acertar
	*	se mostrart�n en el String como un gui�n.
	 */
	public String getPanel();
}
