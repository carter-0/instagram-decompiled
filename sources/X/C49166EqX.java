package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* renamed from: X.EqX  reason: case insensitive filesystem */
public abstract class C49166EqX {
    public static final String A00(Intent intent) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("android.intent.extra.REFERRER", Uri.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("android.intent.extra.REFERRER");
        }
        return DbX.A0t(parcelableExtra);
    }
}
