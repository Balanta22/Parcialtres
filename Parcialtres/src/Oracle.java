
public class Oracle {
	
	//ATRIBUTOS 
	
	private boolean plsql;
	
	public int cantidadDeUsuariosPermitidos ;
	
	//GETTERBY SETTER//
	
	public boolean isPlsql() {
		return plsql;
	}

	public void setPlsql(boolean plsql) {
		this.plsql = plsql;
	}

	public int getCantidadDeUsuariosPermitidos() {
		return cantidadDeUsuariosPermitidos;
	}

	public void setCantidadDeUsuariosPermitidos(int cantidadDeUsuariosPermitidos) {
		this.cantidadDeUsuariosPermitidos = cantidadDeUsuariosPermitidos;
		
	}

	
	//CONSTRUCTORES//
	public Oracle(boolean plsql, int cantidadDeUsuariosPermitidos) {
		
		this.plsql = plsql;
		this.cantidadDeUsuariosPermitidos = cantidadDeUsuariosPermitidos;
	}
	
	
	
	
	
	
	
	
	
	

}
