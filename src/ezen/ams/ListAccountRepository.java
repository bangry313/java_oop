package ezen.ams;

import java.util.LinkedList;
import java.util.List;

/**
 * AccountRepository 인터페이스 구현 클래스
 * @author 김기정
 * @Date   2023. 1. 9.
 */
public class ListAccountRepository {
	
	private List<Account> accounts;
	
	public ListAccountRepository() {
//		accounts = new ArrayList<>();
		accounts = new LinkedList<>();
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public Account findByNumber(String number) {
		for (Account account : accounts) {
			if(account.getAccountNumber().equals(number)) {
				return account;
			}
		}
		return null;
	}

	public boolean removeAccount(String number) {
		for (Account account : accounts) {
			if(account.getAccountNumber().equals(number)) {
				return accounts.remove(account);
			}
		}
		return 	false;	
	}
}
