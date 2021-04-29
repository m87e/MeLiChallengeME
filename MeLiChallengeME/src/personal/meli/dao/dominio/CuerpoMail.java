package personal.meli.dao.dominio;

import java.util.Date;

public class CuerpoMail {

	private String idMail;
	private String subject;
	private Date fechaRecepcion;
	private String to;
	
	public String getIdMail() {
		return idMail;
	}
	public void setIdMail(String idMail) {
		this.idMail = idMail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}
	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public CuerpoMail() {}
	
	public CuerpoMail(String idMail, String subject, Date fechaRecepcion, String to) {

		this.idMail = idMail;
		this.subject = subject;
		this.fechaRecepcion = fechaRecepcion;
		this.to = to;
	}
}