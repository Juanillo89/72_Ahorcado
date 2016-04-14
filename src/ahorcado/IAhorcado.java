package ahorcado;

public interface IAhorcado
{
	/**
	*	Comienza una partida
	*	@param fraseAAdivinar Es la frase que hay que adivinar.
	 */
	public void partidaNueva(String fraseAAdivinar);
	/**
	*	@return Número de intentos que se han realizado en la partida.
	 */
	public int getNumeroIntentos();
	/**
	*	Intento de letra para completar el panel.
	*	@param letra
	*	@return true si se ha acertado alguna, false si la letra no está presente 
	*	o ya se ha puesto.
	 */
	public boolean ponerLetra(char letra);
	/**
	*	@return Número de letras que se han fallado. Las repetidas cuentan como fallos.
	 */
	public int getNumeroFallos();
	/**
	*	Para saber si se ha completado el panel.
	*	@return true si se ha completado, false en caso contrario
	 */
	public boolean panelCompleto();
	/**
	*	@return Una cadena con el panel, donde todas las letras serán pasadas a mayúsculas.  * Las letras acertadas aparecerán y los espacios en blanco también. Las letras sin acertar
	*	se mostrartán en el String como un guión.
	 */
	public String getPanel();
}
