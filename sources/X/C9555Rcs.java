package X;

import android.content.Context;

/* renamed from: X.Rcs  reason: case insensitive filesystem */
public abstract class C9555Rcs {
    public static boolean A00(Context context) {
        if (context == null) {
            return false;
        }
        return Pxf.A0N(context.getApplicationContext(), AnonymousClass3RV.A00, "oxygen_fbns_config").getBoolean("fbns_secure_auth", false);
    }
}
