package X;

import android.content.Intent;

public abstract class RKS extends Exception {
    public final Intent A00;

    public RKS(Intent intent) {
        super("Google Play Services not available");
        this.A00 = intent;
    }
}
