package service;

import org.springframework.beans.factory.annotation.Autowired;

import repository.RepositoryInterface;

public class ServiceLamine implements ServiceInterface {

	@Autowired
	RepositoryInterface repositoryInterface;
	private int numService;

	public void setNumService(int numService) {
		this.numService = numService;
	}

	public void setRepositoryInterface(RepositoryInterface repositoryInterface) {
		this.repositoryInterface = repositoryInterface;
	}

	public void analyser() {
		repositoryInterface.stcocker();
		System.out.println("analyser methode Lamine service num = " + numService);
	}
}
