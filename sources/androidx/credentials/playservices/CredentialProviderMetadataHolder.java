package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public final class CredentialProviderMetadataHolder extends Service {
    public final LocalBinder binder = new LocalBinder();

    public final class LocalBinder extends Binder {
        public LocalBinder() {
        }

        public final CredentialProviderMetadataHolder getService() {
            return CredentialProviderMetadataHolder.this;
        }
    }

    public IBinder onBind(Intent intent) {
        return this.binder;
    }
}
