package controler;

import org.springframework.beans.factory.annotation.Autowired;

import service.ServiceInterface;

public class InvoiceControlerMichel implements InvoiceControlerInterface {

	@Autowired
	ServiceInterface serviceInterface;

	public ServiceInterface getServiceInterface() {
		return serviceInterface;
	}

	public void setServiceInterface(ServiceInterface serviceInterface) {
		this.serviceInterface = serviceInterface;
	}

	public void afficherControler() {
		serviceInterface.analyser();
		System.out.println("InvoiceControler Michel");
	}

}
