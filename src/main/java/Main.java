import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controler.InvoiceControlerInterface;

public class Main {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
		InvoiceControlerInterface repositoryInterface = con.getBean(InvoiceControlerInterface.class);
		repositoryInterface.afficherControler();
	}

}
