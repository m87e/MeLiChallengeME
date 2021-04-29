package personal.meli.dao.interfaz;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import personal.meli.dao.dominio.CuerpoMail;


public interface CuerpoMailDAO {
	void AgregarAerolinea(CuerpoMail cuerpoMail, Connection con) throws IOException;

	void ModificarAerolinea(CuerpoMail cuerpoMail, Connection con) throws IOException;

	void EliminarAerolinea(CuerpoMail cuerpoMail, Connection con) throws IOException;

	CuerpoMail ObtenerAerolineaPorID(int idMail) throws SQLException;

	List<CuerpoMail> GetAll() throws IOException;
}
