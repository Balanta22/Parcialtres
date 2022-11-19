public class Conexion {
	//ATRIVUTOS PRIVADOS//
	private String nombre;
	
	private int  puerto;
	
	private String host;
	
	private String usuario;
	
	private String password;
	
	private String tipo;
	
	//CONSTRUCTORES

	public Conexion(String nombre, int puerto, String host, String usuario, String password, String tipo) {
		
		this.nombre = nombre;
		this.puerto = puerto;
		this.host = host;
		this.usuario = usuario;
		this.password = password;
		this.tipo = tipo;
		
		
	}

	public Conexion(String nombre, int puerto, String host, String tipo) {
	
		this.nombre = nombre;
		this.puerto = puerto;
		this.host = host;
		this.tipo = tipo;
	}

	public Conexion(String nombre, String host, String password, String tipo) {
		
		this.nombre = nombre;
		this.host = host;
		this.password = password;
		this.tipo = tipo;
	}

	public Conexion( String host, String usuario, String password) {
	
		this.nombre = nombre;
		this.host = host;
		this.usuario = usuario;
		this.password = password;
	}

	public Conexion() {
		
	}

	//METODOS GETTER Y SETTER//
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	


	
	
	
	
	
	
	


