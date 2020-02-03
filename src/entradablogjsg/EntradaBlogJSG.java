package entradablogjsg;

/**
 * Clase para manejar las entradas de un blog y su autor
 * @author Jaime Sansano García
 * @since 02/02/2020
 * @version 2.4
 */
public class EntradaBlogJSG {
	/**
	 * 'separador' es el carácter que separa "ENTRADA DE" del nombre del autor
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
	 * @throws IllegalArgumentException Se lanza si el número de entrada es negativo
	 */
	public EntradaBlogJSG(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	
	/**
	 * Override del método toString()
	 * @return String con el contenido formateado del objeto impreso por el método main
	 */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}

	/**
	 * Método getter del atributo 'id'
	 * @return Devuelve el entero 'id' del objeto
	 */
	public int getId(){
		return this.id;
	}

	/**
	 * Método getter del atributo 'texto'
	 * @return Devuelve el String con el texto de la entrada del blog
	 */
	public String getTexto(){
		return this.texto;
	}

	/**
	 * Método getter del atributo 'autor'
	 * @return Devuelve el String con el nombre del autor en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}

	/**
	 * Método obsoleto que obtiene el atributo 'autor'  
	 * @deprecated Sustituido por getAutor()
	 * @return Devuelve el String con el nombre del autor
	 */
	public String devuelveAutor(){
		return this.autor;
	}

	/**
	 * Método main Imprime en pantalla el nombre del autor y su entrada al blog
	 * @param args No tiene porqué tener argumentos
	 */
	public static void main(String[] args) {
		EntradaBlogJSG e1=new EntradaBlogJSG (3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}