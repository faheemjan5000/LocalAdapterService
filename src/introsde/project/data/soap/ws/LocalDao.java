package introsde.project.data.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)

public interface LocalDao {

	@WebMethod(operationName="createEntityManager")
    @WebResult(name="entitymanager") 
    public EntityManager createEntityManager();
	
	@WebMethod(operationName="closeConnections")
    @WebResult(name="void") 
    public void closeConnections(@WebParam(name="entitymanager") EntityManager em);

	@WebMethod(operationName="closeConnections")
    @WebResult(name="void") 
    public EntityTransaction getTransaction(@WebParam(name="entitymanager") EntityManager em);
}
