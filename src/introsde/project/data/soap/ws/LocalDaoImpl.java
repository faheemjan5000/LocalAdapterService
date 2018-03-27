package introsde.project.data.soap.ws;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import introsde.project.data.soap.dao.DatabaseDao;

@WebService(endpointInterface = "introsde.assignment3.soap.ws.PeopleActivity")

public class LocalDaoImpl implements LocalDao{

	@Override
	public EntityManager createEntityManager() {
		return DatabaseDao.instance.createEntityManager();
	}

	@Override
	public void closeConnections(EntityManager em) {
		DatabaseDao.instance.closeConnections(em);
	}

	@Override
	public EntityTransaction getTransaction(EntityManager em) {
		return DatabaseDao.instance.getTransaction(em);
	}

}
