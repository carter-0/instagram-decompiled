package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: X.0Wi  reason: invalid class name */
public abstract class AnonymousClass0Wi {
    public abstract boolean A04(Context context, Intent intent, ServiceConnection serviceConnection, int i);

    public static boolean A00(Context context) {
        if (context instanceof Activity) {
            return true;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return false;
    }

    public static final boolean A01(Context context, Intent intent) {
        if ((intent.getFlags() & 268435456) != 0 || A00(context)) {
            return false;
        }
        intent.addFlags(268435456);
        return true;
    }
}
