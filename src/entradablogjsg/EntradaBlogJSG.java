package entradablogjsg;

/**
 * Clase para manejar las entradas de un blog y su autor
 * @author Jaime Sansano Garc�a
 * @since 02/02/2020
 * @version 2.4
 */
public class EntradaBlogJSG {
	/**
	 * 'separador' es el car�cter que separa "ENTRADA DE" del nombre del autor
	 */
	public static char separador=':';
	private int id;
	private String autor;
	private String texto;

	/**
	 * Constructor de la clase EntradaBlogJSG
	 * @param id Entero identificador del autor
	 * @param autor String con el nombre del autor
	 * @param texto String con el texto de la entrada del blog
	 * @throws IllegalArgumentException Se lanza si el n�mero de entrada es negativo
	 */
	public EntradaBlogJSG(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	
	/**
	 * Override del m�todo toString()
	 * @return String con el contenido formateado del objeto impreso por el m�todo main
	 */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}

	/**
	 * M�todo getter del atributo 'id'
	 * @return Devuelve el entero 'id' del objeto
	 */
	public int getId(){
		return this.id;
	}

	/**
	 * M�todo getter del atributo 'texto'
	 * @return Devuelve el String con el texto de la entrada del blog
	 */
	public String getTexto(){
		return this.texto;
	}

	/**
	 * M�todo getter del atributo 'autor'
	 * @return Devuelve el String con el nombre del autor en may�sculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}

	/**
	 * M�todo obsoleto que obtiene el atributo 'autor'  
	 * @deprecated Sustituido por getAutor()
	 * @return Devuelve el String con el nombre del autor
	 */
	public String devuelveAutor(){
		return this.autor;
	}

	/**
	 * M�todo main Imprime en pantalla el nombre del autor y su entrada al blog
	 * @param args No tiene porqu� tener argumentos
	 */
	public static void main(String[] args) {
		EntradaBlogJSG e1=new EntradaBlogJSG (3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}
}