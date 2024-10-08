package X;

import android.content.Context;

/* renamed from: X.4sp  reason: invalid class name and case insensitive filesystem */
public final class C276194sp implements C276204sq {
    public final Context A00;

    public final boolean hasPermission(String str) {
        return 1DL.A07(this.A00, "android.permission.ACCESS_WIFI_STATE");
    }

    public C276194sp(Context context) {
        this.A00 = context;
    }
}
