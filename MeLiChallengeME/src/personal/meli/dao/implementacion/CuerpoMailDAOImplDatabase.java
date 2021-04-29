package personal.meli.dao.implementacion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import personal.meli.dao.dominio.CuerpoMail;
import personal.meli.dao.interfaz.CuerpoMailDAO;

public class CuerpoMailDAOImplDatabase implements CuerpoMailDAO {

	@Override
	public void AgregarAerolinea(CuerpoMail cuerpoMail, Connection con) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModificarAerolinea(CuerpoMail cuerpoMail, Connection con) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarAerolinea(CuerpoMail cuerpoMail, Connection con) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuerpoMail ObtenerAerolineaPorID(int idMail) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CuerpoMail> GetAll() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
