package X;

import android.content.Intent;

/* renamed from: X.F6v  reason: case insensitive filesystem */
public abstract class C49787F6v {
    public static final Intent A00(Intent intent) {
        String str;
        if (intent == null) {
            return null;
        }
        String action = intent.getAction();
        if (action != null) {
            str = new 11S(C66579MXk.A00(728)).A01(action, AnonymousClass000.A00(2598));
        } else {
            str = null;
        }
        intent.setAction(str);
        return intent;
    }

    public static final boolean A01(String str) {
        if (str == null) {
            return false;
        }
        if ("android.intent.action.BOOT_COMPLETED".equals(str) || 0qQ.A0K(new 11S("android\\.").A01("android.intent.action.BOOT_COMPLETED", "com.instagram.android."), str)) {
            return true;
        }
        return false;
    }
}
