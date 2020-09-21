/**
 * 
 */

/**
 * @author Destructor X
 *
 */
import java.util.ArrayList;

public class BaseDeDatos {
	
	private String usuario;
	private String contraseña;
	
	public BaseDeDatos() {
		
		usuario="";
		contraseña="";
		
	}
	
	public void setUsuario(String usuario) {
		
		this.usuario=usuario;
		
	}
	public String getUsuario() {
		
		return usuario;
		
	}
	public void setContraseña(String contraseña) {
		
		this.contraseña=contraseña;
		
	}
	public String getContraseña() {
		
		return contraseña;
		
	}
	
}
