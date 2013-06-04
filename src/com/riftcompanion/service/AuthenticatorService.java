package com.riftcompanion.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.riftcompanion.accounts.AccountAuthenticator;

public class AuthenticatorService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		return new AccountAuthenticator(this).getIBinder();
	}

}
