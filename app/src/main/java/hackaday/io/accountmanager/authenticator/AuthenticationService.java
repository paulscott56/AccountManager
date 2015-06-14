package hackaday.io.accountmanager.authenticator;

/**
 * Created by paul on 2015/06/14.
 */

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Service to handle Account authentication. It instantiates the authenticator
 * and returns its IBinder.
 */
public class AuthenticationService extends Service {
    private static final String TAG = "AuthenticationService";
    private Authenticator mAuthenticator;
    @Override
    public void onCreate() {
        if (Log.isLoggable(TAG, Log.INFO)) {
            Log.i(TAG, "HackadayIO Authentication Service started.");
        }
        mAuthenticator = new Authenticator(this);
    }
    @Override
    public void onDestroy() {
        if (Log.isLoggable(TAG, Log.INFO)) {
            Log.i(TAG, "HackadayIO Authentication Service stopped.");
        }
    }
    @Override
    public IBinder onBind(Intent intent) {
        if (Log.isLoggable(TAG, Log.INFO)) {
            Log.i(TAG, "getBinder()...  returning the AccountAuthenticator binder for intent "
                    + intent);
        }
        return mAuthenticator.getIBinder();
    }
}