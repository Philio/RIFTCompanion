package com.riftcompanion.app;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.riftcompanion.R;
import com.riftcompanion.accounts.DummyAccount;

public class LoginActivity extends AccountAuthenticatorActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Ensure an account is created for content provider sync
		Account account = DummyAccount.create(this);
		// @todo add sync

		// Display toast error
		Toast.makeText(this, getString(R.string.account_add_message), Toast.LENGTH_LONG).show();

		// Just return cancelled and finish
		setResult(RESULT_CANCELED);
		finish();
	}

}
