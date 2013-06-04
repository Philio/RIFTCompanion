package com.riftcompanion.app;

import android.accounts.Account;
import android.app.Application;

import com.riftcompanion.accounts.DummyAccount;

public class RiftApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Ensure an account is created for content provider sync
		Account account = DummyAccount.create(this);
		// @todo add sync
	}
	
}
