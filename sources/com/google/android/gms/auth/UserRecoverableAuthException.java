package com.google.android.gms.auth;

import X.RDP;
import X.RKH;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class UserRecoverableAuthException extends RKH {
    public final PendingIntent A00;
    public final Intent A01;
    public final RDP A02;

    public final Intent A00() {
        String str;
        Intent intent = this.A01;
        if (intent != null) {
            return new Intent(intent);
        }
        int ordinal = this.A02.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                str = "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.";
            } else if (ordinal != 2) {
                return null;
            } else {
                str = "this instantiation of UserRecoverableAuthException doesn't support an Intent.";
            }
            Log.e("Auth", str);
            return null;
        }
        Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
        return null;
    }

    public UserRecoverableAuthException(PendingIntent pendingIntent, Intent intent, RDP rdp, String str) {
        super(str);
        this.A00 = pendingIntent;
        this.A01 = intent;
        this.A02 = rdp;
    }
}
