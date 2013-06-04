package com.riftcompanion.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

import com.riftcompanion.R;

public class DummyAccount {

	/**
	 * Create dummy account (if it doesn't exist already) and return it
	 * 
	 * @param context
	 * @return
	 */
	public static Account create(Context context) {
		AccountManager accountManager = AccountManager.get(context);
		Account[] accounts = accountManager.getAccountsByType(context.getString(R.string.account_type));
		Account account;
		if (accounts == null || accounts.length == 0) {
			account = new Account(context.getString(R.string.app_name), context.getString(R.string.account_type));
			accountManager.addAccountExplicitly(account, null, null);
		} else {
			account = accounts[0];
		}
		return account;
	}
	
}
