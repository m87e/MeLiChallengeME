package personal.meli.dao.dominio;

public class Login {

	private int idCuentaMail;
	private String correo;
	private String password;
	
	
	public int getIdCuentaMail() {
		return idCuentaMail;
	}
	public void setIdCuentaMail(int idCuentaMail) {
		this.idCuentaMail = idCuentaMail;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Login() {}
	
	public Login(int idCuentaMail, String correo, String password) {
		this.idCuentaMail = idCuentaMail;
		this.correo = correo;
		this.password = password;
	}
	
	
	
	
}
