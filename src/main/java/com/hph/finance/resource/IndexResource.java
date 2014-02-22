package com.hph.finance.resource;

import java.util.ArrayList;
import java.util.List;

public class IndexResource extends Resource {

	private Resource accounts;
	
	private Resource banks;

	public Resource getAccounts() {
		return accounts;
	}

	public void setAccounts(Resource accounts) {
		this.accounts = accounts;
	}

	public Resource getBanks() {
		return banks;
	}

	public void setBanks(Resource banks) {
		this.banks = banks;
	}
	
	
}
