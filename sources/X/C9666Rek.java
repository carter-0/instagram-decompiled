package X;

import android.app.Activity;

/* renamed from: X.Rek  reason: case insensitive filesystem */
public abstract class C9666Rek {
    public static final boolean A00(Activity activity) {
        if (activity == null || activity.getWindow() == null || (C66581MXm.A0A(activity).getSystemUiVisibility() & 1536) == 0) {
            return false;
        }
        return true;
    }
}
