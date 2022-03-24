package turorial;

public class clase_tutorial {
	String usuario;
	String password;
	
	public clase_tutorial() {
		usuario = "";
		password = "";
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
	
	public boolean login() {
		
		if(getPassword().equals("1234") && getUsuario().equals("jotatuts")) {
			return true;
		}
		return false;
	}
}
