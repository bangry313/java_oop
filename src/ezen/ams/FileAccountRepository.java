package ezen.ams;

import java.io.DataInputStream;

public class FileAccountRepository implements AccountRepository {
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addAccount(Account account) {
		// 파일저장 기능 환료

	}

	@Override
	public Account[] getAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findByNumber(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAccount(String number) {
		// TODO Auto-generated method stub
		return false;
	}

}
