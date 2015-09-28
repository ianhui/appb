package appb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService(serviceName = "ServiceBService", portName = "ServiceBPort", endpointInterface = "appb.IServiceB", targetNamespace = "http://appb/ServiceB")
public class ServiceB implements IServiceB {

	@Override
	public int minus(int left, int right) {
		int result2 = left - right;

		System.out.println("method=minus, left="+left + ", right=" + right + ", result2=" + result2);
		
		return result2;
	}

}
