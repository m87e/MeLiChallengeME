package personal.meli.dao.factory;

import personal.meli.dao.implementacion.CuerpoMailDAOImplDatabase;
import personal.meli.dao.interfaz.CuerpoMailDAO;

public class CuerpoMailFactory {
	public static CuerpoMailDAO GetImplementation(String source) {

		if (source.equals("database")) {
			return new CuerpoMailDAOImplDatabase();
		}

		return null;

	}
}
